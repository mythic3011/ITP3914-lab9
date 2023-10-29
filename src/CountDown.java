import java.util.*;

public class CountDown {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        countDown(num);
    }

    public static void countDown(int num) {
        if (!(num == 0)) {
            System.out.print(num+ " ");
            countDown(num - 1);
        }
    }
}
