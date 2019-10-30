import java.util.Scanner;

public class Quiz {
    public static void main(String [] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter 20 numbers: ");

        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            int numInput = key.nextInt();
            input[i] = numInput;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(input[i] + " ");
        }

        //call the method and print the sum
        int total =  sumTotal(input);
        System.out.println(total);

    }//end of main method


        //Number 4 - Method for the Sum of the inputs
        public static int sumTotal(int[] input){

            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum = sum + input[i];
            }
           return sum;
        }//end of sumTotal method


    }//end of main class

