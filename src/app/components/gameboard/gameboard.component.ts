import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GameboardService } from 'src/app/services/gameboard.service';
import { IBoard } from 'src/app/models/gameboard.model';

@Component({
  selector: 'app-gameboard',
  templateUrl: './gameboard.component.html',
  styleUrls: ['./gameboard.component.css']
})
export class GameboardComponent implements OnInit {

  boards: IBoard[]=[];

  constructor(private gameboardService: GameboardService, private router: Router) {  }

  ngOnInit(): void {
  }

  colorMapping(color: any) {
    switch(color){
        case 'R': {
            return "red"
        }
        case 'Y': {
            return "yellow"
        }
      }
    return "white"
}
  onSubmit(){
    this.router.navigate(['']);
    this.gameboardService.updateBoard(this.boards , this.colorMapping).subscribe((data: IBoard[]) => {
      console.log(data);
      this.boards = data;
    })
  }
}
