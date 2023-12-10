import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Players } from '../model/Players';

@Injectable({
  providedIn: 'root'
})
export class PlayersServiceService {

  constructor(private http:HttpClient) { }

  playerURL:string = 'http://localhost:8080/api/v1/players/';

  getAllPlayers():Observable<Players[]>{
    return this.http.get<Players[]>(this.playerURL+'getallplayers');
  }

 

  getPlayerSortedByTotalMatches():Observable<Players[]>{
    return this.http.get<Players[]>(this.playerURL+'getplayerdatabymatches');
  }
}
