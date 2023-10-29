import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        // call printFib() with num as argument
        printFib(num);
    }
    public static void printFib(int num) {
        if (num == 1) {
            System.out.println("1");
        } else if (num == 2) {
            System.out.println("1, 1");
        } else {
            String fibString = "";
            int[] fib = new int[num + 1];
            fib[0] = 1;
            fib[1] = 1;
            for (int i = 2; i < num; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            for (int i = 0;i < fib.length-1;i++){
                fibString += fib[i] + "";
                if (i != fib.length-2){
                    fibString += ",";
                }
            }
            System.out.print(fibString);
        }
    }
}
