package com.gamingroom;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
/*
 * use to dcompare if the name exists
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Derived from the Entity class and needs to extend the Entity class
 */
public class Team extends Entity {
	
	/*
	 * list of active teams
	 */
	private static List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	/*
	 * construct new player instance
	 */
	public Player addplayer(String name) {
		
		/*
		 * local player instance
		 */
		Player player = null;
		
		/*
		 * iterate over players to look for existing players
		 */
		for (int i = 0; i < players.size() - 1; i++) {
			if (players.get(i).getName() == name) {
				player = players.get(i);
			}
		}
		
		/*
		 * if not found, make new player
		 */
		if (player == null) {
			GameService service = GameService.getInstance();
			
			player = new Player(service.getNextPlayerId(), name);
			players.add(player);
		}
		
		return player;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
