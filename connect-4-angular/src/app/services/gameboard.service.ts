import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IBoard } from '../models/gameboard.model';
import { ITeam } from '../models/teams.model';


@Injectable({
    providedIn: 'root',
})
export class GameboardService{
    private BASEURL = "http://localhost:9090/board";
 

    constructor(private http: HttpClient){}

    getNewBoard(): Observable<IBoard>{
        return this.http.get<IBoard>(
            `${this.BASEURL}/1`)
    }
    
    updateBoard(slot: any, data: IBoard): Observable<IBoard> {
        return this.http.post<IBoard>(`${this.BASEURL}/${slot}`,
        data)
    }
}