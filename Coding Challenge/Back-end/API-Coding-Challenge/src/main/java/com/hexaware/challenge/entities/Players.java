package com.hexaware.challenge.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Players implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="playerSeq",initialValue = 50,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "playerSeq")
	private int playerId;
	
	
	private String playerName;
	
	@NotNull
	private int playerJerseyNumber;
	
	@Pattern(regexp = "^(Batsman|Bowler|Keeper|All-Rounder)$")
	private String playerRole;
	
//	@Min(value= 1,message = "Total matches played count is necessary and should be more than 1 ")
//	@Max(value = 400,message = "Total Matches should be less than 400")
	private int playerTotalMatches;
	
//	@NotBlank(message = "Give Team Name in which player is playing.")
	private String playerTeamName;
	
//	@NotBlank(message = "Country Name should not be blank.")
	private String countryName;
	private String playerDescription;


	public Players(int playerId, @NotBlank(message = "Player Name should not be Null or blank.") String playerName,
			int playerJerseyNumber, @NotBlank(message = "Player Role in a team not be blank.") String playerRole,
			int playerTotalMatches,
			@NotBlank(message = "Give Team Name in which player is playing.") String playerTeamName,
			@NotBlank(message = "Country Name should not be blank.") String countryName, String playerDescription) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerJerseyNumber = playerJerseyNumber;
		this.playerRole = playerRole;
		this.playerTotalMatches = playerTotalMatches;
		this.playerTeamName = playerTeamName;
		this.countryName = countryName;
		this.playerDescription = playerDescription;
	}


	public Players() {
		super();
	
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getPlayerJerseyNumber() {
		return playerJerseyNumber;
	}


	public void setPlayerJerseyNumber(int playerJerseyNumber) {
		this.playerJerseyNumber = playerJerseyNumber;
	}


	public String getPlayerRole() {
		return playerRole;
	}


	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}


	public int getPlayerTotalMatches() {
		return playerTotalMatches;
	}


	public void setPlayerTotalMatches(int playerTotalMatches) {
		this.playerTotalMatches = playerTotalMatches;
	}


	public String getPlayerTeamName() {
		return playerTeamName;
	}


	public void setPlayerTeamName(String playerTeamName) {
		this.playerTeamName = playerTeamName;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getPlayerDescription() {
		return playerDescription;
	}


	public void setPlayerDescription(String playerDescription) {
		this.playerDescription = playerDescription;
	}
	
	
	

}
