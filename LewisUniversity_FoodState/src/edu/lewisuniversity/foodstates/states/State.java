package edu.lewisuniversity.foodstates.states;

import edu.lewisuniversity.foodstates.context.Context;

public interface State {
	public void action(Context orderContext);
}
