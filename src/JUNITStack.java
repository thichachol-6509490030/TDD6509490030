import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test; 

class JUNITStack {

	@Test
	void test() {
		Stack s1 = new Stack();
		int size  = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	@Test
	void testPush() {
		Stack s2 = new Stack();
		s2.push(1);
		
		assertEquals(1, s2.Top());
	}
	
	  @Test
	    public void testLastInFirstOut() {
	        Stack stack = new Stack();
	        assertNull(stack.pop()); 

	        stack.push("Element 1");
	        stack.push("Element 2");

	        assertEquals("Element 2", stack.pop()); 
	        assertEquals(1, stack.getSize()); 
	        assertEquals("Element 1", stack.pop()); 
	        assertTrue(stack.isEmpty());
	  }
	  
	    @Test
	    public void testIsFull() {
	        Stack stack = new Stack();
	        stack.push(1);
	        stack.push(2);

	        assertEquals(2, stack.getSize());
	        assertTrue(stack.isFull());
	    }
}
