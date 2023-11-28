import { Component } from '@angular/core';
import { Product } from 'src/app/model/product';
import { GetProductService } from 'src/app/services/get-product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {
[x: string]: any;
  productList: Product[] = [];

  constructor(private productService: GetProductService) {

  }

  getAll() {

    this.productService.getAllProducts().subscribe(
      (list) => {
        this.productList=list
      });
  }
}
