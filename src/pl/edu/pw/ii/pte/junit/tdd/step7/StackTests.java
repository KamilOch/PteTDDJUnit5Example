package pl.edu.pw.ii.pte.junit.tdd.step7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;

public class StackTests {

	@Test
	public void newlyCreatedStackIsEmpty() {
		Stack s = new Stack();

		assertTrue(s.isEmpty());
	}

	@Test
	public void afterPushStackIsNoLongerEmpty() {
		Stack s = new Stack();

		s.push(1);

		assertFalse(s.isEmpty());
	}

	@Test
	public void afterPushAndPopStackIsEmptyAgain() {
		Stack s = new Stack();

		s.push(1);
		s.pop();

		assertTrue(s.isEmpty());
	}

	@Test
	public void emptyStackThrowsOnPop() {
		assertThrows(
		EmptyStackException.class,
		()->{
			Stack s = new Stack();
			s.pop();
			}
		);
	}

	@Test
	public void popReturnsWhatWasPushed() {
		Stack s = new Stack();

		s.push(1234);

		assertEquals(1234, s.pop());
	}

	@Test
	public void stackDoesNotBecomeEmptyWhenThereWasLessPopThanPush() {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.pop();

		assertFalse(s.isEmpty());
	}

	@Test
	public void lastPopReturnsFirstPushedValue() {
//		Stack s = new Stack();
//
//		s.push(1);
//		s.push(2);
//		s.pop();
//
//		assertEquals(1, s.pop());
	}
}
