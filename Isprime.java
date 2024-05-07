import java.util.Scanner;

class Isprimenum {
    boolean prime(int num) {
        int i = 0;
        for (i = 2; num % i != 0; i++) {
        }
        if (i == num) {
            return true;
        } else {
            return false;
        }
    }

}

public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        sc.close();

        Isprimenum obj1 = new Isprimenum();
        boolean obj2 = obj1.prime(num);

        System.out.println(num + " is a prime number " + obj2);

    }
}