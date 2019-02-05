import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Program that iteratively or recursively finds and displays the Fibonacci sequence numbers up
 * to a certain value specified by the user
 */

public class Main {

    public static void main(String[] args) {
//Integer that holds the value up to which the user would like to see the Fibonacci sequence
        int fibNum;
        //Integer that holds the user's choice
        int choice = 0;
        //While loop that repeats the program until the user chooses to exit
        while(choice != 3) {
            System.out.println("Enter the number up to which you would like to see the Fibonacci sequence ==> ");
            Scanner input = new Scanner(System.in);
            fibNum = input.nextInt();

                System.out.println("Enter 1 to find the sequence recursively. Enter 2 to find the sequence iteratively. Enter 3 to exit the program. ==> ");
                choice = input.nextInt();


        if(choice == 1) {
            System.out.println("The first " + fibNum + " Fibonacci numbers are: ");
            Long x = System.nanoTime();
            for (int i=0; i < fibNum; i++) {
                System.out.println(recursiveFibonacci(i));

            }
            Long y = System.nanoTime();
            Long rTime = (y-x);

            System.out.println("rtime is "+ rTime);

        }
       else if(choice == 2) {

            Long e = System.nanoTime();
            iterativeFibonacci(fibNum);
            Long r = System.nanoTime();
            Long iTime = (r-e);
            System.out.println("itime is "+ iTime);


        }

        else {

            System.out.println("Invalid input.");

        }

        }





    }

    public static int recursiveFibonacci(int x){
        //Method that recursively finds the Fibonacci sequence number of a certain value

         if (x == 0){
            return 0;
        }
        else if(x == 1 || x == 2){
            return 1;
        }
        else {
            return recursiveFibonacci(x - 1) + recursiveFibonacci(x - 2);
        }
    }

        public static void iterativeFibonacci(int x){
            //Method that iteratively finds and displays the Fibonacci sequence numbers up to a certain value
        int prevNum = 0;
        int nextNum = 1;
        System.out.println("The first " + x + " Fibonacci numbers are: ");

            for(int i = 0; i<x; i++){
                System.out.println(prevNum + " ");

                int sum = prevNum + nextNum;
                prevNum = nextNum;
                nextNum = sum;
            }

        }



}
