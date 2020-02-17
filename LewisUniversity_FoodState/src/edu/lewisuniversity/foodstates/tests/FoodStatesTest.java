package edu.lewisuniversity.foodstates.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.lewisuniversity.foodstates.CompleteState;
import edu.lewisuniversity.foodstates.OrderState;
import edu.lewisuniversity.foodstates.PrepareState;
import edu.lewisuniversity.foodstates.ServeState;
import edu.lewisuniversity.foodstates.context.Context;
import edu.lewisuniversity.foodstates.states.State;

class FoodStatesTest {
	static OrderState orderState;
	static PrepareState prepareState;
	static ServeState serveState;
	static CompleteState completeState;
	
	Context currentContext;
	
	//Instatiating the Order Objects
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		orderState = new OrderState();
		prepareState = new PrepareState();
		serveState = new ServeState();
		completeState = new CompleteState();
	}

	
	@BeforeEach
	void setUp() throws Exception {
		currentContext = new Context();
		
	}

	//Testing the Order State
	@Test
	void testOrderState() {
		currentContext.setState(orderState);
		State currentState = currentContext.getState();
		assertEquals("Ordering Food.", currentState.toString());
	}
	//Testing the Preparing State
	@Test
	void testPrepareState() {
		currentContext.setState(prepareState);
		State currentState = currentContext.getState();
		assertEquals("Preparing Food.", currentState.toString());
	}
	
	//Testing the Preparing State
	@Test
	void testServeState() {
		currentContext.setState(serveState);
		State currentState = currentContext.getState();
		assertEquals("Serving Food.", currentState.toString());
	}
	
	//Negatively Testing the Completiong State
	@Test
	void testCompleteState() {
		currentContext.setState(completeState);
		State currentState = currentContext.getState();
		assertNotEquals("Serving Food.", currentState.toString());		
	}
	
	//Testing the steps
	@Test
	void testCompleteStateSteps() {
		currentContext.setState(completeState);
		State currentState = currentContext.getState();
		assertNotNull(currentState.toString());		
	}
	

	@AfterEach
	void tearDown() throws Exception {
		currentContext.setState(null);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		orderState = null;
		prepareState = null;
		serveState = null;
		completeState = null;
	}


}
