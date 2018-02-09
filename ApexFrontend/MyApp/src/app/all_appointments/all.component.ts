import { Component } from '@angular/core';
import { Observable } from "rxjs/Rx";
import 'rxjs/add/operator/toPromise';
import {All} from '../service/index';

@Component({
  selector: 'all-appointmens',
  templateUrl: './all.html',
  styleUrls: ['./all.css']
})
export class AllComponent {

  constructor(private all:All) {
    this.getAppointments();
   }
 
   appointments;
   getAppointments() {
     this.all.getAppointments().subscribe(res=>{
     this.appointments=res.json();
     });
     
   }
}