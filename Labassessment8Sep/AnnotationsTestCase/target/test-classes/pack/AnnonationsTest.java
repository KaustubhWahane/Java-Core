package pack;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnnonationsTest {
	
	@Beforeclass
	public void beforeClass() {
		System.out.println("I am beforeClass");
	}
	
	@Afterclass
	public void beforeClass() {
		System.out.println("I am beforeClass");
	}
	
	@Beforeeach
	public void beforeEach() {
		System.out.println("I am beforeEach");
	}
	
	@Test
	public void test() {
		assertEquals (2, 2);
	}
	
	@Aftereach
	public void afterEach() {
		System.out.println("I am afterEach");
	}
	
	

}
