import {Injectable} from '@angular/core';

import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';
import 'rxjs/add/operator/map';
@Injectable()
export class SearchAppointments{

  constructor(public http:Http){}
  private headers = new Headers({'Content-Type': 'application/json'});

  search(data)
  {
    return this.http.get("http://localhost:8080/appointments/"+data);

  }
}