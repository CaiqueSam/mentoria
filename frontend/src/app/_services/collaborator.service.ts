import { Injectable } from '@angular/core';
import { Collaborator } from '../_models/collaborator';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class CollaboratorService {

  constructor(
    private http: HttpClient;
  ) { }

  getCollaborators(): Observable<Collaborator[]> {
    const url = ""
    this.http.get();
  }
}

