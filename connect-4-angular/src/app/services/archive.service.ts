import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IArchive } from '../models/archive.model';


@Injectable({
    providedIn: 'root',
})
export class ArchiveService{
    private BASEURL = "http://localhost:9090/archive";
 

    constructor(private http: HttpClient){}

    getArchive(): Observable<IArchive[]>{
        return this.http.get<IArchive[]>(`${this.BASEURL}`)
    }
}