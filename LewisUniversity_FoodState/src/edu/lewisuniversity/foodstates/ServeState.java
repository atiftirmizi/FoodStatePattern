package edu.lewisuniversity.foodstates;

import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

public class ServeState implements State{

	public void action(Context currentContext) {
		System.out.println("The Food is in Serving State");
		currentContext.setState(this);
	}
	
	public void steps() {
		System.out.println("This is the crucial step of the process and the serves the order.");
	}
	
	public String toString(){
		return "Serving Food.";
	}

}
