import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> stack;
	public static final int MAX_SIZE = 2;
	
	public Stack() {
		stack = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
			if(stack.size() == 0)
				return true;
			else
				return false;
	
	}

	@Override
	public int getSize() {
		return stack.size();
	}
	
	@Override
	public void push(Object elm) {
			stack.add(elm);

	}
	
	@Override
	public Object Top() {
		return stack.get(stack.size()-1);
	}
	
	@Override
	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return stack.remove(stack.size()-1);
	}
	
	@Override
	public boolean isFull() {
        return stack.size() == MAX_SIZE;
    }

}
