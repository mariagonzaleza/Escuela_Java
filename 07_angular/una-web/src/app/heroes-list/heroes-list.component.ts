import { Component, OnInit } from '@angular/core';
import {HEROES} from '../model/array-heroes';
import {Hero} from '../model/hero';

@Component({
  selector: 'app-heroes-list',
  templateUrl: './heroes-list.component.html',
  styleUrls: ['./heroes-list.component.css']
})
export class HeroesListComponent implements OnInit {
  heroes: Hero[];
  constructor() {

   }

  ngOnInit() {
    this.heroes =HEROES;
  }

}
