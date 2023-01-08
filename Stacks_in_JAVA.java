import java.util.Stack;

public class Stacks_in_JAVA {
    public static void main(String[] args) {

        // Stack inserts the data based on LIFO approach
        Stack<String> stringStack = new Stack<>();
        stringStack.add("India");
        stringStack.add("America");
        stringStack.add("Australia");
        stringStack.add("Singapore");
        System.out.println(stringStack);
        stringStack.push("Japan");
        System.out.println(stringStack);
        String popped_Element = stringStack.pop();
        System.out.println("Popped element is = " + popped_Element);
        System.out.println("Stack after popping the element: ");
        System.out.println(stringStack);
        System.out.println("Capacity of Stack array = " + stringStack.capacity());
        System.out.println("First Element is: " + stringStack.firstElement());
        System.out.println("Last Element is: " + stringStack.lastElement());
        System.out.println("Index of Australia is = " + (stringStack.indexOf("Australia")+1));
        System.out.println("Size of the Stack is = " + stringStack.size());
        System.out.println(stringStack.contains("Japan"));// Returns boolean value
        System.out.println(stringStack.contains("India"));// Returns boolean value
        // [India, America, Australia, Singapore] reads the data from right to left
        System.out.println(stringStack.search("America"));
        // Stack at Index 3 is Singapore
        System.out.println("Element at Index 3 = " + stringStack.elementAt(3));
        System.out.println("Is Stack empty?: " + stringStack.isEmpty());
        stringStack.clear();
        System.out.println("Is Stack empty Now?: " + stringStack.isEmpty());
        System.out.println(stringStack.getClass());

    }
}
