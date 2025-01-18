import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { FormsModule } from "@angular/forms";

import { AppComponent } from "./app.component";
import { ExampleComponent } from "./example/example.component";

@NgModule({
declarations: [
AppComponent,
ExampleComponent
],
imports: [
BrowserModule,
FormsModule
],
template1: `<div class="container">
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
providers: [],

bootstrap: [AppComponent],
})
export class ProfilePhoto {


constructor(private renderer: Renderer2, private el: ElementRef) {
        super(id , name);
    }

    let name: string = "mk";
        name = "Angular Framework";


}