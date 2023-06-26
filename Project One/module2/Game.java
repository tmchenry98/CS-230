package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

/**
 * To inherit the Entity class, we extend the Game class
 * @author Tanya McHenry
 *
 */
public class Game extends Entity {
	
	
	/*
	 * a list of active teams
	 */
	private static List<Team> teams = new ArrayList<Team>();
		
	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * Construct a new team instance
	 */
	public Team addTeam(String name) {
		
		/*
		 * a local team 
		 */
		Team team = null;
		
		/*
		 * iterate over teams for exisiting names
		 */
		for (int i = 0; i < teams.size() - 1; i++) {
			if (teams.get(i).getName() == name) {
				team = teams.get(i);
			}
		}
		
		/*
		 * if not found, make new team and add to list
		 */
		if (team == null) {
			GameService service = GameService.getInstance();
			
			team = new Team(service.getNextPlayerId(), name);
			teams.add(team);
		}
		
		/*
		 * return new or existing game instance
		 */
		return team;
	}

	@Override
	public String toString() {
		
		return "Game [id=" + id + ", name=" + name + "]";
	}

}
