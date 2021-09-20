import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { GameboardService } from 'src/app/services/gameboard.service';
import { IBoard } from 'src/app/models/gameboard.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  boards: IBoard[]=[];

  constructor(private gameboardService: GameboardService, private router: Router) {  }

  ngOnInit(): void {
  }

  onGetBoard(){
    this.router.navigate(['/gameboard']);}
}
