package com.hexaware.challenge.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.challenge.entities.Players;

@Repository
public interface PlayerRepository extends JpaRepository<Players, Integer> {

	Optional<Players> findByPlayerName(String playerName);
	
	@Query("select player.playerTotalMatches from Players player order by player.playerTotalMatches DESC")
	public List<Integer> getTotalMatchesSorted( );
	



}
