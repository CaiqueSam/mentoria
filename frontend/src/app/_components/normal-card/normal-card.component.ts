import { Component, OnInit } from '@angular/core';
import { Collaborator } from 'src/app/_models/collaborator';

@Component({
  selector: 'app-normal-card',
  templateUrl: './normal-card.component.html',
  styleUrls: ['./normal-card.component.scss']
})
export class NormalCardComponent implements OnInit {

  collaborator: Collaborator;

  constructor() { }

  ngOnInit(): void {
    this.collaborator = new Collaborator();
    this.collaborator.name = 'Murilo';
    this.collaborator.function = 'Desenvolvedor';
    this.collaborator.team = 'Fábrica de Software';
    this.collaborator.years = 1;
    this.collaborator.months = 6;
  }

}
