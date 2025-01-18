import { Component } from '@angular/core';

@Component({
selector: 'app-root',
template:
`<div class="container">
<div class="product-list">
<div
*ngFor="let product of products"
class="product-item"
(click)="selectProduct(product)"
>
<h3>{{ product.name }}</h3>
<img [src]="product.image" alt="{{ product.name }}" />
</div>
</div>
<div class="product-details" *ngIf="selectedProduct">
<h2>{{ selectedProduct.name }}</h2>
<img [src]="selectedProduct.image" alt="{{ selectedProduct.name }}" />
<p>{{ selectedProduct.details }}</p>
</div>
</div>`
,
})
export class AppComponent {
products = [
{ name: 'منتج 1', image: 'https://via.placeholder.com/100', details: 'تفاصيل المنتج 1' },
{ name: 'منتج 2', image: 'https://via.placeholder.com/100', details: 'تفاصيل المنتج 2' },
{ name: 'منتج 3', image: 'https://via.placeholder.com/100', details: 'تفاصيل المنتج 3' },
{ name: 'منتج 4', image: 'https://via.placeholder.com/100', details: 'تفاصيل المنتج 4' }
];
selectedProduct = null;

selectProduct(product: any) {
    this.selectedProduct = product;
  }
}