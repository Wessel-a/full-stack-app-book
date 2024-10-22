import { Injectable } from '@angular/core';
import { BookLocation } from './booklocation';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  url = 'http://localhost:8080/api/book/list';

  async getAllBookLocations(): Promise<BookLocation[]> {
    const data = await fetch(this.url);

    if (!data.ok) {
      console.error('Failed to fetch housing locations:', data.statusText);
      return [];
    }

    const jsonData = await data.json();
    console.log(jsonData);
    return jsonData ?? [];
  }
}
