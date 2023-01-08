import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;


public class Stream {
    public static void main(String[] args) {

// Create a collection
// Dynamically allocates the memory
// Old Method
//        ArrayList<Integer> numberList = new ArrayList<>();
//        numberList.add(10);
//        numberList.add(20);
//        numberList.add(30);
//        numberList.add(40);
//        numberList.add(50);

    // New method to collect the dat [Within a line]
    List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60);
    List<Integer> evenNumberList;
    List<String> string = Arrays.asList("JAVA", "PYTHON", "C++", "REACTJS");
    List<Character> chars = Arrays.asList('a', 'b', 'c', 'y', 'z');
    List<String> findString;

    // Filter the collection without using the stream [Enhanced for loop]
//        for(int i : numberList){
//            if (i % 2 == 0)
//                evenNumberList.add(i);
//        }
//        System.out.println(evenNumberList);

    // Crated a collection to store the data filtered by Stream
    // New method to add the collection into a stream and process the object [In the stream] and get the output
    // Data Processed by using Lambda function
    evenNumberList = numberList.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumberList);

    int sum_1 = numberList.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum_1 = " + sum_1);
    int sum = numberList.stream().reduce(0, Integer::sum);
    System.out.println("Sum = " + sum);

    findString = string.stream().toList();
    System.out.println(findString);
    findString =string.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
    System.out.println(findString);
    findString = new ArrayList<>(string);
    System.out.println(findString);
    findString = string.stream().sorted().collect(Collectors.toList());
    System.out.println(findString);
    long countString = string.size();
    System.out.println("Number of Strings = " + countString);
    String findSTR = String.valueOf(string.stream().findAny());
    System.out.println("FindSTR = " + findSTR);
    Character maxChar = chars.stream().max(Comparator.comparing(Character::charValue)).get();
    System.out.println("Max char is = " + maxChar);
    Character minChar = chars.stream().min(Comparator.comparing(Character::charValue)).get();
    System.out.println("Min char is = " + minChar);

    Object[] toArray = string.toArray();
    System.out.println(Arrays.toString(toArray));
    Object[] toArray_1 = string.stream().filter(s -> s.startsWith("P")).toArray();
    System.out.println(Arrays.toString(toArray_1));

    findString = string.stream().map(String::toLowerCase).collect(Collectors.toList());
    System.out.println("To lower case: " + findString);
    List<Integer> length = string.stream().map(String::length).toList();
    System.out.println("Length = " + length);
    Optional<String> new_String = string.stream().findFirst();
    System.out.println("FindFirst = " + new_String);
    
    }
}
