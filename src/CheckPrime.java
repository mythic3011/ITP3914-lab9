import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        // import scanner as input
        Scanner input = new Scanner(System.in);
        // init variable
        int num;
        // ask user number to check is it prime
        System.out.print("?");
        num = input.nextInt();
        // check if it is prime
        if(checkPrime(num)){
            System.out.print(num + " is a prime number");
        }else{
            System.out.print(num + " is not a prime number");
        }
    }
    // check return true if it is prime
    public static boolean checkPrime(int num) {
        // divisible by 2
        return num % 2 != 0;
    }
}