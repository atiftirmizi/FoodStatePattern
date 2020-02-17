package edu.lewisuniversity.foodstates;

import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

public class CompleteState implements State{

	public void action(Context currentContext) {
		System.out.println("The Food is in completed State");
		currentContext.setState(this);
	}
	
	public void steps() {
		System.out.println("This is the last step of the process and it completes the order.");
	}
	
	public String toString(){
		return "Completed Order.";
	}

}
