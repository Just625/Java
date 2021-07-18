import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  @Input() productDelete: Product;
  @Output() deleteProductEvent = new EventEmitter<number>();

  deleteProduct(id: number) {
    this.deleteProductEvent.emit(this.productDelete.id);
  }

  constructor() {
  }

  ngOnInit() {
  }

}
