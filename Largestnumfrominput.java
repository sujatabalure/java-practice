import java.util.Scanner;

class Largestnumfrominput {
    public static void main(String[] args) {

        Scanner inputnumber = new Scanner(System.in);

        System.out.println("enter first number: ");
        int num1 = inputnumber.nextInt();
        System.out.println("enter 2nd number: ");
        int num2 = inputnumber.nextInt();
        System.out.println("enter third number: ");
        int num3 = inputnumber.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greator than " + num2 + " and " + num3);
        } else if (num2 > num3) {

            System.out.println(num2 + " is greator than " + num1 + " and " + num3);

        } else if (num3 > num1) {
            System.out.println(num3 + " is greator than " + num2 + " and " + num1);

        } else {
            System.err.println(" all are equal");
        }
        inputnumber.close();
    }

}