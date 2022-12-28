import java.util.Arrays;

public class Arrays_Java {
    public  static void main(String[] args){

        // "new" allocates memory
        //1D array
        int[] numbers = new int [5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(Arrays.toString(numbers));

        // 1D Array
        int[] numbers_1 = {1,2,3,4,5,5,6};
        System.out.println(numbers_1);
        System.out.print("Length of the array = ");
        System.out.println(numbers_1.length);

        // 1D Array
        int[] numbers_2 = {5,4,3,2,1};
        Arrays.sort(numbers_2);
        System.out.println(Arrays.toString(numbers_2));

        // 2D (or) Multidimensional Array
        System.out.println("2D Array~~");
        int [][] numbers_3 = new int[2][3];
        numbers_3[0][0]=1;
        System.out.println(Arrays.deepToString(numbers_3));

    }
}
