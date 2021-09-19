import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IBoard } from '../models/gameboard.model';


@Injectable({
    providedIn: 'root',
})
export class GameboardService{
    private BASEURL = "http://localhost:9090/board";
 

    constructor(private http: HttpClient){}

    getNewBoard(): Observable<IBoard[]>{
        return this.http.get<IBoard[]>(`${this.BASEURL}`)
    }
    updateBoard(id: any, slot: any): Observable<IBoard[]>{
        return this.http.get<IBoard[]>(`${this.BASEURL}`)
    }
}