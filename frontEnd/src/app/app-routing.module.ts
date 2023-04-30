import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {FileComponent} from "./file-module/file.component";


const routes: Routes = [
  {
    path: 'file',component: FileComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
