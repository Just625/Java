import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {
  @Input()
  backgroundColor;
  @Input()
  progressColor;
  @Input()
  progress;

  constructor() {
  }

  ngOnInit() {
    this.loading();
  }

  loading() {
    let interval = setInterval(() => {
      // Chuyen progress ve` dang so roi` cong them 5
      this.progress = +this.progress + 5;
      if (this.progress === 100) {
        clearInterval(interval);
      }
    }, 1000);
  }
}
