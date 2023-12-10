import { Component } from '@angular/core';
import { Players } from 'src/app/model/Players';
import { PlayersServiceService } from 'src/app/service/players-service.service';

@Component({
  selector: 'app-get-all-players',
  templateUrl: './get-all-players.component.html',
  styleUrls: ['./get-all-players.component.css']
})
export class GetAllPlayersComponent {
 
  playerList:Players[]=[];
  constructor(private playerService: PlayersServiceService){}

  getAllPlayersData()
  {
    this.playerService.getAllPlayers().subscribe(players=>{this.playerList=players});
  
  }
}
