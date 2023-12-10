package com.hexaware.challenge.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entities.Players;
import com.hexaware.challenge.service.IPlayersService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/players")
public class PlayerRestController {

	Logger logger = LoggerFactory.getLogger(PlayerRestController.class);

	@Autowired
	private IPlayersService playerService;

	@PostMapping("/add/player")
	public Players addNewPlayer(@RequestBody PlayersDTO playersDTO) {
		
		System.out.println(playersDTO);
		return playerService.insertNewPlayer(playersDTO);
	}

	@GetMapping("/getallplayers")
	public List<Players> getAllPlayers() {
		return playerService.getAllPlayers();
	}

	@DeleteMapping("/delete/player/{playerId}")
	public String deletePlayerById(@PathVariable int playerId) {
		playerService.deletePlayer(playerId);
		return "Player with id"+playerId+" is deleted!!!";
	}

	@PutMapping("/updateplayer/{playerId}")
	public Players updatePlayerByid(PlayersDTO playersDTO, @PathVariable int playerId) {
		return playerService.updateExistingPlayer(playersDTO, playerId);
	}
	
	@GetMapping("/get/playerbyid/{playerId}")
	public PlayersDTO getPlayerById(@PathVariable int playerId)
	{
		return playerService.getPlayerById(playerId);
	}
	
	@GetMapping("/get/playerbyname/{playerName}")
	public PlayersDTO getPlayerByName(@PathVariable String playerName)
	{
		return playerService.getByPlayername(playerName);
	}
	@GetMapping("/gettotalmatchessorted")
	public List<Integer> getPlayerTotalMatchesSorted()
	{
		return playerService.getTotalMatchesSorted();
	}
	
	@GetMapping("/getplayerdatabymatches")
	public List<Players> getPlayersDataByTotalMatches()
	{
		return playerService.getTotalMatchesInOrder();
	}
	
}
