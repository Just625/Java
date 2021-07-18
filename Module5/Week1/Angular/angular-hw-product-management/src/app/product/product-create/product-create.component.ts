import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {
  @Output() newProductEvent = new EventEmitter<Product>();
  pCreate: Product = {};

  addNewProduct() {
    this.newProductEvent.emit(this.pCreate);
  }

  constructor() {
  }

  ngOnInit() {
  }

}
