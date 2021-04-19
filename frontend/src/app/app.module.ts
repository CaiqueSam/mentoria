import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CardsComponent } from './_sections/cards/cards.component';
import { NormalCardComponent } from './_components/normal-card/normal-card.component';
import { InfoTextComponent } from './_components/info-text/info-text.component';

@NgModule({
  declarations: [
    AppComponent,
    CardsComponent,
    NormalCardComponent,
    InfoTextComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
