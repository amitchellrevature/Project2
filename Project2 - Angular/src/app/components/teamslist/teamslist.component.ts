import { Component, OnInit } from '@angular/core';
import { ITeam } from 'src/app/models/teams.model';
import { TeamsService } from "src/app/services/teams.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-teamslist',
  templateUrl: './teamslist.component.html',
  styleUrls: ['./teamslist.component.css']
})
export class TeamslistComponent implements OnInit {


  teams: ITeam[] = [];

  constructor(private teamsService: TeamsService, private router: Router) { }

  ngOnInit(): void {
    this.teamsService.getTeams().subscribe((data: ITeam[]) => {
      console.log(data);
      this.teams = data;
    })
    
  }

  onHome(){
    this.router.navigate([''])
  }

}
