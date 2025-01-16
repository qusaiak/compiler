import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ProductComponent } from './product.component';
import { ProductService } from '../product.service';

describe('ProductComponent', () => {
  let component: ProductComponent;
  let fixture: ComponentFixture<ProductComponent>;
  let mockProductService: ProductService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProductComponent],
      providers: [ProductService],
    }).compileComponents();

    fixture = TestBed.createComponent(ProductComponent);
    component = fixture.componentInstance;
    mockProductService = TestBed.inject(ProductService);
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should load products from the service', () => {
    const products = mockProductService.getProducts();
    expect(component.products.length).toBe(products.length);
  });

  it('should select a product on button click', () => {
    const product = { id: 1, name: 'منتج 1', price: 100 };
    component.selectProduct(product);
    expect(component.selectedProduct).toEqual(product);
  });
});
