import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  getProducts() {
    return [
      { id: 1, name: 'منتج 1', price: 100 },
      { id: 2, name: 'منتج 2', price: 200 },
      { id: 3, name: 'منتج 3', price: 300 },
    ];
  }
}
