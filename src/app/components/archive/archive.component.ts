import { Component, OnInit } from '@angular/core';
import { IArchive } from 'src/app/models/archive.model';
import { ArchiveService } from "src/app/services/archive.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-archive',
  templateUrl: './archive.component.html',
  styleUrls: ['./archive.component.css']
})
export class ArchiveComponent implements OnInit {

  archives: IArchive[] =[];

  constructor(private archiveService: ArchiveService, private router: Router) { }

  ngOnInit(): void {
    this.archiveService.getTeams().subscribe((data: IArchive[]) => {
      console.log(data);
      this.archives = data;
    })
  }

  onHome(){
    this.router.navigate([''])
  }
}
