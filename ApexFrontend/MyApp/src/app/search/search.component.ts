import { Component } from '@angular/core';
import {
  FormGroup,
  FormControl,
  Validators,
  FormBuilder,
  FormArray
} from "@angular/forms";

import { Observable } from "rxjs/Rx";
import 'rxjs/add/operator/toPromise';
import {SearchAppointments,All} from '../service/index';

@Component({
  selector: 'search-appoints',
  templateUrl: './search.html',
  styleUrls: ['./search.css']
})
export class SearchAppointment {
    constructor(private searchAppointments:SearchAppointments, private all:All)
     {
       this.getAppointments();
     }

  appointments
  search(data) {
   this.searchAppointments.search(data).subscribe(res=>{
   this.appointments=res.json();
   
    });
    
  } 
  getAppointments() {
    this.all.getAppointments().subscribe(res=>{
    this.appointments=res.json();
    });
    
  }
}