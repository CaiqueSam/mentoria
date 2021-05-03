import { Component, OnInit } from '@angular/core';
import { Collaborator } from 'src/app/_models/collaborator';
import { CollaboratorService } from 'src/app/_services/collaborator.service';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']
})
export class CardsComponent implements OnInit {
  collaborators: Collaborator[];
  constructor(
    private collaboratorService: CollaboratorService
  ) { }

  ngOnInit(): void {
    this.loadCollaborators();
  }


  loadCollaborators() {
    console.log('Antes do subscribe');
    this.collaboratorService.getCollaborators().subscribe(res => {
      console.log('Resposta obtida: ', res);
    });
    console.log('Depois do subscribe');
  }

}
