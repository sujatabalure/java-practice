class subFactorial{
        
        int fac (int facnumber){
        for (int i = 4; i>0; i--) {

            facnumber = facnumber * i;
            
        }
        return facnumber;
    }
}

public class Factorial {
    public static void main(String[] args) {
        int facnumber = 5;
        subFactorial obj1 = new subFactorial();
        int obj2 = obj1.fac(facnumber);
        System.out.println("factorial of 5 is "  + obj2);

    }
}
