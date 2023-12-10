package com.hexaware.challenge.service;

import java.util.List;

import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entities.Players;

public interface IPlayersService {
	
	public Players insertNewPlayer(PlayersDTO playersDTO);
	public Players updateExistingPlayer(PlayersDTO playerDTO , int playerId);
	
	public void deletePlayer(int playerId);
	
	public PlayersDTO getPlayerById(int playerId);
	
	public List<Players> getAllPlayers();

	public PlayersDTO getByPlayername(String playerName);

	public List<Integer> getTotalMatchesSorted( );
	
	public List<Players> getTotalMatchesInOrder();
	
	

}
