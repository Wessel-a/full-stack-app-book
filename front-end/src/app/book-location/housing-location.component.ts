import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BookLocation } from '../booklocation';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-book-location',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule
  ],
  template: `
    <section class="listing">
      <img class="listing-photo" [src]="bookLocation.afbeeldingURL" alt="Exterior photo of {{bookLocation.titel}}">
      <h2 class="listing-heading">{{ bookLocation.titel }}</h2>
      <p class="listing-location">{{ bookLocation.auteur}}</p>
    </section>
  `,
  styleUrls: ['./housing-location.component.css'],
})

export class HousingLocationComponent {

  @Input() bookLocation!: BookLocation;

}
