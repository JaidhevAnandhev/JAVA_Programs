import java.util.*;

public class Collections_in_JAVA {
    public static void main(String[] args) {
        // String List in Java
        LinkedList<String> List = new LinkedList<>();
        List.add("A");
        List.add("B");
        List.remove(1);
        List.addFirst("C");
        List.addLast("D");
        List.add(2, "E");
        System.out.println(List);
        List.remove(2);
        System.out.println(List);
        List.removeFirst();
        List.removeLast();
        System.out.println(List);

        // Hashset in JAVA
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.remove(1);
        System.out.println("Hashset: ");
        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Hello");
        hashSet1.add("World");
        hashSet1.add("Remove this element");
        hashSet1.remove("Remove this element");
        // Displays the items in an array
        System.out.println(hashSet1);
        boolean bool = hashSet1.contains("Hello");
        System.out.println(bool);

        // Array List in JAVA
        // Accepts only Integer type not the String or other types
        ArrayList<Integer> Array_List = new ArrayList<>(5);

        // Input given by the user
        int i;
        System.out.print("Enter the elements :");
        for (i = 1; i <= 5; i++) {
            Array_List.add(i);
        }
        // Printing the elements
        System.out.println(Array_List);

        for (i = 0; i < Array_List.size(); i++){
            System.out.println(Array_List.get(i) + " ");
        }

        // Remove an element at the third index
        System.out.println("After removing the element at the index 3");
        Array_List.remove(3);

        // Printing the elements after removing the element at that particular index
        System.out.println(Array_List);

        for (i = 0; i < Array_List.size(); i++){
            System.out.println(Array_List.get(i) + " ");
        }

        // TreeSet in JAVA
        // Arranges the element in ascending order
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("A");
        System.out.println("TreeSet of String sorting: ");
        System.out.println(treeSet);

        // TreeSet of type Integer
        TreeSet<Integer> treeSet_1 = new TreeSet<>();
        treeSet_1.add(4);
        treeSet_1.add(3);
        treeSet_1.add(2);
        treeSet_1.add(1);
        System.out.println("TreeSet of Integer sorting: ");
        System.out.println(treeSet_1);

        // HashMaps in JAVA
        // It is used to store the key value pairs
        // Stores the key in string type and values as Integer
        // Result may be in any order
        HashMap<String, Integer> hashMap_1 = new HashMap<>();
        System.out.println("HashMap in JAVA.");
        hashMap_1.put("Jaidhev", 24);
        hashMap_1.put("Jaidhev", 25);
        hashMap_1.put("Jothi", 3);
        hashMap_1.put("Vibhav", (int) 3.1);

        // Just prints the key value pairs within the curly braces
        System.out.println(hashMap_1);
        System.out.println("Value of Key Jaidhev is " + hashMap_1.get("Jaidhev")); // Gets the value of that particular key

        // Prints the size of the HashMap
        System.out.println("Size of the Hash Map is = " + hashMap_1.size());

        // To check whether the Hash map the particular Key in it
        // This returns the boolean value
        System.out.println("Am I There ? = " + hashMap_1.containsKey("Jothi"));
        // To check whether the Hash map the particular Value in it
        // This returns the boolean value
        System.out.println("Does it contain value of Vibhav = " + hashMap_1.containsValue((int)3.1));

        // Get the values with detailed information using for loop
        // KeySet returns a set view of the keys contained in this map(hashMap_1)
        System.out.println("Displaying the Key value pairs in HashMap using keySet():");
        for(String Key : hashMap_1.keySet()){
            System.out.println("Key = " + Key + " and its value is = " + hashMap_1.get(Key));
        }

        // Other way to get the entry points of key value pairs in the HashMap
        System.out.println("Displaying the Key value pairs in HashMap using entrySet():");
        for(Map.Entry<String, Integer> entry : hashMap_1.entrySet()){
            System.out.println("Key = " + entry.getKey() + " and value is = " + entry.getValue());
        }

        // TreeMap in JAVA
        // Sorts the values given within the angular bracket in ascending order
        // Even if we give like <String, Integer> it will sort according to the value of Integer
        // in ascending order
        // All Map.Entry pairs returned by methods in this class and its views represent snapshots
        // of mappings at the time they were produced.
        // They do not support the Entry.setValue method.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Vibhav");
        treeMap.put(2, "Jothi");
        treeMap.put(1, "Jaidhev");
        System.out.println("Tree Map in JAVA given like <Integer, String>:");
        System.out.println(treeMap);

        // Even if given like <String, Integer> sorts the value based on the integer (Ascending order)
        TreeMap<String, Integer> treeMap_1 = new TreeMap<>();
        treeMap_1.put("Vibhav", 3);
        treeMap_1.put("Jothi", 2);
        treeMap_1.put("Jaidhev", 1);
        System.out.println("Tree Map in JAVA given like <String, Integer>:");
        System.out.println(treeMap_1);

    }
}
