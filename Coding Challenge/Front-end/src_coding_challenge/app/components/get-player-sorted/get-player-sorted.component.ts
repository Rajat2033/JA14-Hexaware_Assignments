import { Component } from '@angular/core';
import { Players } from 'src/app/model/Players';
import { PlayersServiceService } from 'src/app/service/players-service.service';

@Component({
  selector: 'app-get-player-sorted',
  templateUrl: './get-player-sorted.component.html',
  styleUrls: ['./get-player-sorted.component.css']
})
export class GetPlayerSortedComponent {
  playerList:Players[]=[];
  constructor(private playerService: PlayersServiceService){}

  getAllPlayersData()
  {
    this.playerService.getPlayerSortedByTotalMatches().subscribe(players=>{this.playerList=players});
  
  }

}
