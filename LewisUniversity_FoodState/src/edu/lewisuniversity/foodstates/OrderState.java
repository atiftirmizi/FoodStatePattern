package edu.lewisuniversity.foodstates;

import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

public class OrderState implements State{
	
	
	public void action(Context currentContext) {
		System.out.println("The Food is in Order State");
		currentContext.setState(this);
	}
	
	public void steps() {
		System.out.println("This is the first step of the process and the server takes the order.");
	}
	
	public String toString(){
		System.out.println("Ordering Food.");
		return "Ordering Food.";
	}
}
