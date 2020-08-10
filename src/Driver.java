
public class Driver {
	public static void main(String[] agrs) {
		
		//Creates instances of the ArrayStack and LinkedStack classes
		ArrayStack array = new ArrayStack();
		LinkedStack link = new LinkedStack();
		
		//Uses the push method of both classes to assign numbers
		array.push(1);
		array.push(7);
		array.push(3);
		array.push(5);
		array.push(9);
		array.push(2);

		link.push(1);
		link.push(7);
		link.push(3);
		link.push(5);
		link.push(9);
		link.push(2);
		
		/*These loop pops out each int from the two stacks, and prints them.
		To do this, the while loop runs while the stack still has integers within it. This functions because the pop method removes an
		integer from the stack when it pops it out. This also functions on the assumption that the ArrayStack and LinkedStack are the same size.*/
		while(array.size() > 0) {
			System.out.println("ArrayStack: " + array.pop() + " || LinkedStack: " + link.pop());
		}
		
		//Reassigns the ints to the LinkedStack, for exercise 2.
		link.push(1);
		link.push(7);
		link.push(3);
		link.push(5);
		link.push(9);
		link.push(2);
		
		//Runs the removeBottomHalf method on the LinkedStack. 
		//The time complexity of this function is O(2n), where n is the number of integers within the stack.
		link.removeBottomHalf();
		
		//Outputs the halved LinkedStack
		while(link.size() > 0) {
			System.out.println(link.pop());
		}
		
	}
}
