import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator_Project {
    public Double Calculator(String inputExp) {
        // Implements FIFO approach
        Queue<String> operations;
        Queue<String> numbers;

        // If an expression is like 4+2-3 splits like [ +   - ]
        String numbersArr[] = inputExp.split("[-+*/]");
        // If an expression is like 4+2-3 splits like [ 4   2   3 ]
        String operationalArr[] = inputExp.split("[0-9]");

        // Array is homogeneous whereas list is heterogeneous
        // converting array to list and finally to linkedList
        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(operationalArr));

        Double res = Double.parseDouble(numbers.poll());
        Double final_result = 0.0;


        while (!(numbers.isEmpty())) {
            String opr = operations.poll();
            Operate operate;
            switch (opr) {
                case "+":
                    operate = new Add();
                    break;
                case "-":
                    operate = new Subtract();
                    break;
                case "*":
                    operate = new Multiply();
                    break;
                case "/":
                    operate = new Divide();
                    break;
                default:
                    continue;

            }
            Double num = Double.parseDouble(numbers.poll());
            final_result = operate.getResult(res, num);
        }

        return final_result;
    }


        public static void main(String[] args){

            try {
                // 1. Get Input from user
                final String input_Exp = Read_Input.read();

                // 2. Calculate output - Need to create object as its inside Static Method
                Calculator_Project objCalc = new Calculator_Project();

                // 3. Print Calculated Output
                System.out.println("Answer: " + objCalc.Calculator(input_Exp));

            } catch (Exception e) {
                System.out.println("Invalid input expression. Please try again.");
            }


        }



}
