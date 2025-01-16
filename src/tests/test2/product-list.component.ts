import { Component } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
})
export class ProductListComponent {
  selectedProduct: any = null;

  products = [
    { id: 1, name: 'Camera', description: 'Camera Description', image: 'assets/camera.jpg' },
    { id: 2, name: 'Laptop', description: 'Laptop Description', image: 'assets/laptop.jpg' },
    { id: 3, name: 'Shampoo', description: 'Shampoo Description', image: 'assets/camera.jpg' }
  ];

  onSelectProduct(product: any) {
    this.selectedProduct = product;
  }
}
