import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {FileService} from "./service/file.service";

@Component({
  selector: 'app-file',
  templateUrl: './file.component.html',
  styleUrls: ['./file.component.css']
})
export class FileComponent implements OnInit {
  form: FormGroup;


  constructor(private fb: FormBuilder,
              private fileService: FileService) { }

  ngOnInit(): void {
    this.form = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  // buildForm() {
  //   this.form = new FormGroup({
  //     username: new FormControl(''),
  //     password: new FormControl(''),
  //   })
  // }
  login() {

  }

  onSubmit() {
  this.fileService.login(this.form.value).subscribe(data => {
    console.log(data);
  });
  }
  getList() {
    this.fileService.getListFile().subscribe(data => {
      console.log(data.content);
    })
  }
}
