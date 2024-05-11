
import java.util.Scanner;

class PallindromeReturn {

    Boolean reverseOfPallindrome(String s) {
        int i = 0;
        int len = s.length();
        
          /*char[] str = new char[len];
          char[] arr = new char[len];
          
          for (i=0 ; i<len ; i++){
          arr[i] = str[(len-i)-1];
          }
          i =0;
          if (arr[i] != str[(len-i)])
          return false;
          i++;*/    
         
         int j = len - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    } 

}

class Pallindrome {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String s = sc.nextLine();
        sc.close();
        PallindromeReturn obj1 = new PallindromeReturn();
        Boolean obj2 = obj1.reverseOfPallindrome(s);
        System.out.println("Entered string is a " + obj2);
    }
}