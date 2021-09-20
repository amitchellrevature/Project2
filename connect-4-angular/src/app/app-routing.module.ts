import {NgModule} from '@angular/core';
import { RouterModule, Routes} from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { TeamslistComponent } from './components/teamslist/teamslist.component';
import { ArchiveComponent } from './components/archive/archive.component';
import { GameboardComponent } from './components/gameboard/gameboard.component';

const routes: Routes=[
    {path: 'login', component: LoginComponent},
    {path: 'teamstats', component: TeamslistComponent},
    {path: 'boardarchive', component: ArchiveComponent},
    {path: 'gameboard', component: GameboardComponent},
    {path: '', component: HomeComponent}

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}