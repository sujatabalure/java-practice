class Isprime
{
    boolean prime(int num)
    {  
        int i=0;          
        for(i=2; num%i!=0; i++)
        {
	     }
	     if(i == num)
	     {
	        return true;
    	  } 
	      else
	     {
	       return false ;
	      }   
     }
    
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter a number");
	    int num = sc.nextInt();
		    
	    Isprime obj1 = new Isprime();
	    boolean obj2 = obj1.prime(num);
	    
	    System.out.println( num + " is a prime number " + obj2 );
	         

	}
}
