import {Injectable} from '@angular/core';

import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';

@Injectable()
export class All{
  
  constructor(public http:Http){}
  private headers = new Headers({'Content-Type': 'application/json'});
  
  getAppointments()
  {
    
    return this.http.get("http://localhost:8080/appointments");
    
  }
}