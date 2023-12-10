package com.hexaware.challenge.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.hexaware.challenge.dto.PlayersDTO;
import com.hexaware.challenge.entities.Players;
import com.hexaware.challenge.exceptions.PlayerNotFoundException;
import com.hexaware.challenge.repository.PlayerRepository;

@Service
public class PlayersServiceImpl implements IPlayersService {

	Logger logger = LoggerFactory.getLogger(PlayersServiceImpl.class);

	@Autowired
	private PlayerRepository playerRepository;

	@Override
	public Players insertNewPlayer(PlayersDTO playersDTO) {
		Players players = new Players();
		players.setPlayerName(playersDTO.getPlayerName());
		players.setPlayerJerseyNumber(playersDTO.getPlayerJerseyNumber());
		players.setPlayerRole(playersDTO.getPlayerRole());
		players.setPlayerTotalMatches(playersDTO.getPlayerTotalMatches());
		players.setPlayerTeamName(playersDTO.getPlayerTeamName());
		players.setCountryName(playersDTO.getCountryName());
		players.setPlayerDescription(playersDTO.getPlayerDescription());
		playersDTO.setPlayerName(players.getPlayerName());
		playersDTO.setPlayerJerseyNumber(players.getPlayerJerseyNumber());
		playersDTO.setPlayerRole(players.getPlayerRole());
		playersDTO.setPlayerTotalMatches(players.getPlayerTotalMatches());
		playersDTO.setPlayerTeamName(players.getPlayerTeamName());
		playersDTO.setCountryName(players.getCountryName());
		playersDTO.setPlayerDescription(players.getPlayerDescription());
		System.out.println(playersDTO);
		logger.info("New Player with name " + players.getPlayerName() + " is added!!");
		return playerRepository.save(players);
	}

	@Override
	public Players updateExistingPlayer(PlayersDTO playerDTO, int playerId) {
		Optional<Players> playersOpt = playerRepository.findById(playerId);
		Players players = new Players();
		if (playersOpt.isPresent()) {
			players.setPlayerId(playerDTO.getPlayerId());
			players.setPlayerName(playerDTO.getPlayerName());
			players.setPlayerJerseyNumber(playerDTO.getPlayerJerseyNumber());
			players.setPlayerRole(playerDTO.getPlayerRole());
			players.setPlayerTotalMatches(playerDTO.getPlayerTotalMatches());
			players.setPlayerTeamName(playerDTO.getPlayerTeamName());
			players.setCountryName(playerDTO.getCountryName());
			players.setPlayerDescription(playerDTO.getPlayerDescription());
		} else {
			throw new PlayerNotFoundException(HttpStatus.NOT_FOUND, "Player with id:" + playerId + " is Not Found!!");
		}
		return playerRepository.save(players);
	}

	@Override
	public void deletePlayer(int playerId) {
		logger.warn("Player with Id :" + playerId + " is deleted!!");
		playerRepository.deleteById(playerId);

	}

	@Override
	public PlayersDTO getPlayerById(int playerId) {
		Players players = playerRepository.findById(playerId).orElse(new Players());
		PlayersDTO playerDTO = new PlayersDTO();
		playerDTO.setPlayerId(players.getPlayerId());
		playerDTO.setPlayerName(players.getPlayerName());
		playerDTO.setPlayerJerseyNumber(players.getPlayerJerseyNumber());
		playerDTO.setPlayerRole(players.getPlayerRole());
		playerDTO.setPlayerTotalMatches(players.getPlayerTotalMatches());
		playerDTO.setPlayerTeamName(players.getPlayerTeamName());
		playerDTO.setCountryName(players.getCountryName());
		playerDTO.setPlayerDescription(players.getPlayerDescription());
		logger.info("Player with id :" + playerId + "from " + playerDTO.getCountryName() + " is fetched!!!");
		return playerDTO;
	}

	@Override
	public List<Players> getAllPlayers() {
		logger.info("All the players Detailed are fetched!!!!");
		return playerRepository.findAll();
	}

	@Override
	public PlayersDTO getByPlayername(String playerName) {
		Players players = playerRepository.findByPlayerName(playerName)
				.orElseThrow(() -> new PlayerNotFoundException(HttpStatus.NOT_FOUND,
						"Player with name :" + playerName + " not found"));
		PlayersDTO playerDTO = new PlayersDTO();

		playerDTO.setPlayerId(players.getPlayerId());
		playerDTO.setPlayerName(players.getPlayerName());
		playerDTO.setPlayerJerseyNumber(players.getPlayerJerseyNumber());
		playerDTO.setPlayerRole(players.getPlayerRole());
		playerDTO.setPlayerTotalMatches(players.getPlayerTotalMatches());
		playerDTO.setPlayerTeamName(players.getPlayerTeamName());
		playerDTO.setCountryName(players.getCountryName());
		playerDTO.setPlayerDescription(players.getPlayerDescription());
		logger.info("Player with name " + playerName + " is fetched!!");
		return playerDTO;
	}

	@Override
	public List<Integer> getTotalMatchesSorted() {
		
		return playerRepository.getTotalMatchesSorted();
	}

	@Override
	public List<Players> getTotalMatchesInOrder()
	{
		return playerRepository.findAll(Sort.by(Direction.DESC,"playerTotalMatches"));
	}


}
