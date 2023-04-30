import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {AbstractControl} from "@angular/forms";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class FileService {
  url = "http://localhost:8080/login";
  token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbmh5ZXVlbSIsImlzcyI6ImJhY2tlbmRzdG9yeS5jb20iLCJpYXQiOjE2ODI4NTAxOTgsImV4cCI6MTY4MjkzNjU5OH0.e4EHtz7QsgHAWfxZa2xUxKNIkTvZggdo4qrKhTTBNQeT3sOrw0kY8gBZhooCxjqX3sEBnxJj-YoFaZ77CQMLiw"

  constructor(private httpClient: HttpClient) {

  }
  login(value: any) : Observable<any> {
    return this.httpClient.post(this.url,value);
  }
  getListFile() : Observable<any> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Authorization': `Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbmh5ZXVlbSIsImlzcyI6ImJhY2tlbmRzdG9yeS5jb20iLCJpYXQiOjE2ODI4NTA3NTgsImV4cCI6MTY4MjkzNzE1OH0.ETdiMv25uh3VdKRrn-hXcLEKzltAaS7fSyhnrV-zifQOtR2PZIyNGJQmAKkk0E6j_VUa_tmJ7bdyTKXR-Njopw`
      })
    };
    return this.httpClient.get("http://localhost:8080/api/unit/list",httpOptions)
  }
}
