import { Component } from '@angular/core';

@Component({
selector: 'app-product-list',
templateUrl: `<div style="display: flex; margin-left: 20px;">
<div style="flex: 5;">
<h1>Product List</h1>
<div
*ngFor="let product of products"
(click)="onSelectProduct(product)"
style="border: 1.5px solid black; text-align: center; margin-top: 2px; cursor: pointer;"
>
<h3>{{ product.name }}</h3>
<img src="{{ product.image }}" alt="{{ product.name }}" width="100px" />
</div>
</div>

<div style="flex: 7;">
<app *ngIf="selectedProduct" [product]="selectedProduct"></app>
</div>
</div>
`,
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
