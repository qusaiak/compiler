import { Component } from '@angular/core';


import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
})
export class ProductComponent {
  products: any[] = [];
  selectedProduct: any;

  constructor(private productService: ProductService) {
    this.products = this.productService.getProducts();
  }

  selectProduct(product: any) {
    this.selectedProduct = product;
  }
}

