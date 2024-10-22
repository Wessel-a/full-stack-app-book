import { Component, inject } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HousingLocationComponent } from '../book-location/housing-location.component';
import { BookLocation } from '../booklocation';
import { BookService } from '../book.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CommonModule,
    HousingLocationComponent
  ],
  template: `
    <section>
      <form>
        <input type="text" placeholder="Filter by book" #filter>
        <button class="primary" type="button" (click)="filterResults(filter.value)">Search</button>
      </form>
    </section>
    <section class="results">
      <app-book-location
        *ngFor="let bookLocation of filteredBookList"
        [bookLocation]="bookLocation">
      </app-book-location>
    </section>
  `,
  styleUrls: ['./home.component.css'],
})

export class HomeComponent {
  bookLocationList: BookLocation[] = [];
  bookService: BookService = inject(BookService);
  filteredBookList: BookLocation[] = [];

  constructor() {
    this.bookService.getAllBookLocations().then((bookLocationList: BookLocation[]) => {
      this.bookLocationList = bookLocationList;
      this.filteredBookList = bookLocationList;
    });
  }

  filterResults(text: string) {
    if (!text) {
      this.filteredBookList = this.bookLocationList;
      return;
    }

    this.filteredBookList = this.bookLocationList.filter(
      bookLocation => bookLocation?.titel.toLowerCase().includes(text.toLowerCase())
    );
  }
}
