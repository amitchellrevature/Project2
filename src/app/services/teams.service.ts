import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ITeam } from '../models/teams.model';


@Injectable({
    providedIn: 'root',
})
export class TeamsService{
    private BASEURL = "http://localhost:9090/api/teams";
 

    constructor(private http: HttpClient){}

    getTeams(): Observable<ITeam[]>{
        return this.http.get<ITeam[]>(`${this.BASEURL}`)
    }
}