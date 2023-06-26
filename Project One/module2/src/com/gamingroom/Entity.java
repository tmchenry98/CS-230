package com.gamingroom;

/**
 * A simple class to hold the required attributes for child classes
 * @author Tanya McHenry
 *
 */

public class Entity {
	// All entities have an id and a name
	protected long id; 
	protected String name;
	
	//Protect the default constructor
	protected Entity() {}
	
	//Constructor with identifier and name
	public Entity (long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//method for returning id
	public long gedId() {
		return id;
	}
	
	// method for returning name
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", name" + name + "]";
	}

}
