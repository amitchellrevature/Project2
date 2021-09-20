import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GameboardService } from 'src/app/services/gameboard.service';
import { TeamsService } from 'src/app/services/teams.service';
import { IBoard } from 'src/app/models/gameboard.model';
import { ITeam } from 'src/app/models/teams.model'
import { isNgTemplate } from '@angular/compiler';

@Component({
  selector: 'app-gameboard',
  templateUrl: './gameboard.component.html',
  styleUrls: ['./gameboard.component.css']
})
export class GameboardComponent implements OnInit {

  boards: any;
  teams: any;
  slot: any;
  


  constructor(private gameboardService: GameboardService, private teamsService: TeamsService, private router: Router) {  }

  ngOnInit(): void {
    this.gameboardService.getNewBoard().subscribe((data: IBoard) => {
      console.log(data);
      this.boards = data;
    })
  }

  setSlot(slot: any): void {
    this.slot = slot

  }

  colorMapping(color: any) {

    switch(color){
        case 'R' || 1: {
            return "red"
        }
        case 'Y' || 2: {
            return "yellow"
        }
      }
    return "white"
}
  onTurn(slot: any){
    this.gameboardService.updateBoard(slot, this.boards).subscribe((data: IBoard) => {
      console.log(data);
      this.boards = data;
    })
    this.router.navigate([''])
  }

  getSlot(): any{
    return this.slot
  }
}
