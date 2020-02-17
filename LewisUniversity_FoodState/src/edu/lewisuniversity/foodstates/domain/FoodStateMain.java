package edu.lewisuniversity.foodstates.domain;

import edu.lewisuniversity.foodstates.OrderState;
import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

public class FoodStateMain {

	public static void main(String[] args) {
		OrderState orderState = new OrderState();
		Context currentContext = new Context();
		
		currentContext.setState(orderState);
		State currentState = currentContext.getState();
		currentState.action(currentContext);
		currentState.toString();
	}

}
