import {Component, OnInit} from '@angular/core';
import {Calculator} from '../calculator';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  calculator: Calculator = {};

  constructor() {
  }

  ngOnInit() {
  }

  getResult() {
    switch (this.calculator.operator) {
      case '+': {
        this.calculator.result = this.calculator.number1 + this.calculator.number2;
        break;
      }
      case '-': {
        this.calculator.result = this.calculator.number1 - this.calculator.number2;
        break;
      }
      case '*': {
        this.calculator.result = this.calculator.number1 * this.calculator.number2;
        break;
      }
      case '/': {
        this.calculator.result = this.calculator.number1 / this.calculator.number2;
        break;
      }
    }
  }
}
