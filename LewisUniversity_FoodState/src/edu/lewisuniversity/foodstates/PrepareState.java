package edu.lewisuniversity.foodstates;

import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

public class PrepareState implements State{
	
	public void action(Context currentContext) {
		System.out.println("The Food is in Preparing State");
		currentContext.setState(this);
	}
	
	public void steps() {
		System.out.println("This is the first step of the process and the chefs prepares the orders.");
	}
	
	public String toString(){
		return "Preparing Food.";
	}

}
