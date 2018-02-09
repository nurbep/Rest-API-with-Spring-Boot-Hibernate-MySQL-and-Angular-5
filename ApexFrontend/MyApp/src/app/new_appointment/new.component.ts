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
import {AddAppointmentService} from '../service/index';

@Component({
  selector: 'add-appointment',
  templateUrl: './new.html',
  styleUrls: ['./new.css']
})
export class NewAppointment {
  myForm: FormGroup;
  constructor(private formBuilder: FormBuilder,private addAppointmentService:AddAppointmentService) {
    this.myForm = formBuilder.group({
        "date":["",Validators.required],
        "time":["",Validators.required],
        "description":["",Validators.required]
           
    });  
  }

  selected:boolean;
  data;
  addAppointment() {
    this.addAppointmentService.insert(this.myForm.value).subscribe(res=>{
   this.data=res.json();
   this.myForm.reset();
    });
    
  } 

  showSelected()
  {
      this.selected=!this.selected;
  }
}