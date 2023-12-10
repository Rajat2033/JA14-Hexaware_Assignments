package com.hexaware.challenge.dto;

public class PlayersDTO {
	private int playerId;
	private String playerName;
	private int playerJerseyNumber;
	private String playerRole;
	private int playerTotalMatches;
	private String playerTeamName;
	private String countryName;
	private String playerDescription;

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

	@Override
	public String toString() {
		return "PlayersDTO [playerId=" + playerId + ", playerName=" + playerName + ", playerJerseyNumber="
				+ playerJerseyNumber + ", playerRole=" + playerRole + ", playerTotalMatches=" + playerTotalMatches
				+ ", playerTeamName=" + playerTeamName + ", countryName=" + countryName + ", playerDescription="
				+ playerDescription + "]";
	}
	
}
