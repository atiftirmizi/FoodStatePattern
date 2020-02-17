package edu.lewisuniversity.foodstates.context;

import edu.lewisuniversity.foodstates.states.State;

public class Context {
	
	private State state;
	
	public Context() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
