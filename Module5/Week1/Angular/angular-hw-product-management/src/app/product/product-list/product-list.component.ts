import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  productDelete: Product = {};
  productEdit: Product = {};
  products: Product[] = [{
    id: 1,
    name: 'Creed of Omniscience',
    price: 10,
    description: '+15% Experience Bonus'
  },
    {
      id: 2,
      name: 'Paw of Lucius',
      price: 25,
      description: '+10 Strength\n' +
        '+20 Attack Speed'
    },
    {
      id: 3,
      name: 'Rhyzik\'s Eye',
      price: 150,
      description: '+15 Strength\n' +
        '+15 Agility\n' +
        '+15 Intelligence\n' +
        '+15 Health Regeneration\n' +
        '+15 Mana Regeneration'
    }];
  isCreateFormShow = false;
  isEditFormShow = false;
  isDeleteFormShow = false;

  // Ẩn hiện create form, edit form, delete form
  onOffCreateForm() {
    if (this.isCreateFormShow === false) {
      this.isCreateFormShow = true;
    } else {
      this.isCreateFormShow = false;
    }
  }

  onOffEditForm(id: number) {
    if (this.isEditFormShow === false) {
      // c1: chỉ truyền sang dữ liệu, cần nút update và @output ở bên product-update để xử lí
      // const pCurrent: Product = this.findProductById(id);
      // this.productEdit.id = pCurrent.id;
      // this.productEdit.name = pCurrent.name;
      // this.productEdit.price = pCurrent.price;
      // this.productEdit.description = pCurrent.description;
      // c2: Vì gán = nên cùng chiếu đến 1 đối tượng, thay đổi được thực hiện ở update sẽ thay đổi luôn trong list ban đầu
      this.productEdit = this.findProductById(id);
      this.isEditFormShow = true;
    } else {
      this.isEditFormShow = false;
    }
  }

  onOffDeleteForm(id: number) {
    if (this.isDeleteFormShow === false) {
      this.productDelete = this.findProductById(id);
      this.isDeleteFormShow = true;
    } else {
      this.isDeleteFormShow = false;
    }
  }
  hideEditForm(){
    this.isEditFormShow = false;
  }

  // Tìm product theo id
  findProductById(id: number): Product {
    for (const product of this.products) {
      if (product.id === id) {
        return product;
      }
    }
  }

  // Thêm mới 1 product
  addProduct(newProduct: Product) {
    this.products.push(newProduct);
    this.isCreateFormShow = false;
  }

  deleteProduct(id: number) {
    let i: number;
    for (const index in this.products) {
      if (this.products[index].id === id) {
        // tslint:disable-next-line:radix
        i = Number.parseInt(index);
        break;
      }
    }
    this.products.splice(i, 1);
    this.isDeleteFormShow = false;
  }

  constructor() {
  }

  ngOnInit() {
  }

}
