package ch10;

public class _14_StackTest {
	public static void main(String[] args) {
		_14_MyStack stack = new _14_MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
