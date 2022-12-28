public class String_usage {
    public static void main(String[] args){
        String message = "   Hello" + "!!!  ";
        System.out.print("To Lowercase :");
        System.out.println(message.toLowerCase());
        System.out.print("To Uppercase :");
        System.out.println(message.toUpperCase());
        System.out.print("Length of the string: ");
        System.out.println(message.length());
        System.out.print("Get Bytes = ");
        System.out.println(message.getBytes());
        System.out.print("After replacing ! with World =  ");
        System.out.println(message.replace("!", "World"));
        System.out.print("Index of l = ");
        System.out.println(message.indexOf('l'));
        System.out.print("Negative index = ");
        System.out.println(message.indexOf("ch"));
        System.out.println("Trimming the word = ");
        System.out.println(message.trim());

        System.out.println(message);
    }
}
