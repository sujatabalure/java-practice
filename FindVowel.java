import java.util.Scanner;

//write a program to check vowel in a string

public class FindVowel {

    Boolean Vowel(String str1) {

        String inputString = str1.toLowerCase();
        int len = str1.length();
        for (int i = 0; i < len - 1; i++) {
            char ch = inputString.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u')

                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string ");
        String S = input.nextLine();
        FindVowel Str = new FindVowel();
        Boolean str1 = Str.Vowel(S);
        System.out.print("Entered string has Vowel  in it " + str1);

        input.close();
    }
}
