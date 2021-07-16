import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  color = 'black';

  constructor() {
  }

  ngOnInit() {
  }

  changeColor(newColor) {
    switch (newColor) {
      case '#67DFCD': {
        this.color = '#67DFCD';
        break;
      }
      case '#0E594E': {
        this.color = '#0E594E';
        break;
      }
      case '#23D9BD': {
        this.color = '#23D9BD';
        break;
      }
      case '#295952': {
        this.color = '#295952';
        break;
      }
      case '#22ADA3': {
        this.color = '#22ADA3';
        break;
      }
    }
  }
}
