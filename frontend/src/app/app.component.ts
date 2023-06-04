import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';
  
  researchForm = new FormGroup({
    location: new FormControl('', Validators.required),
    period: new FormControl('', Validators.required),
    time: new FormControl(null, Validators.required),
    budget: new FormControl(null)
  })

  constructor(
    private http: HttpClient
  ) {}

  onSubmit() {
    return this.http.post('http://localhost:8080/tours', this.researchForm.value).subscribe({
      next: () => console.warn('good'),
      error: (err: any) => console.warn(err)
    });
  }
}
