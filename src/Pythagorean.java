import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        // import scanner as input
        Scanner input = new Scanner(System.in);
        // init variable
        int[] abc = new int[3];
        // ask for input
        System.out.print("a?");
        abc[0] = input.nextInt();
        System.out.print("b?");
        abc[1] = input.nextInt();
        System.out.print("c?");
        abc[2] = input.nextInt();
        if(isPythagorean(abc)){
            System.out.print("This is a Pythagorean triple.");
        }else {
            System.out.print("This is not a Pythagorean triple.");
        }
    }
    public static boolean isPythagorean(int[] abc) {
        boolean is = false;
        int max = abc[0];
        int a = 0,b = 0,c = 0;
        // find max value and assign it to max aka c
        for (int i = 0; i < 3; i++) {
            if (abc[i] > max) {
                max = abc[i];
            }
        }
        // assign a and b
        for (int i = 0; i < 3; i++) {
            if (abc[i] != max) {
                if (a == 0) {
                    a = abc[i];
                } else {
                    b = abc[i];
                }
            }
        }
        // check if it is a pythagorean triple
        double ab = Math.pow(a, 2) + Math.pow(b, 2);
        if (ab == Math.pow(max, 2)) {
            is = true;
        } else {
            is = false;
        }
        return is;
    }
}