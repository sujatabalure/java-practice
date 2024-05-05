 class Arraynum
{
    int[] array(int a)
    {
        int len = 0;
        int acopy =a;
      
        while(a != 0)
        {
           a= a/10;
           len++;
           
        }
        
        int[] Arr = new int[len];
        
        for(int i=0; i<len ;i++)
        {
           Arr[i] =acopy %10;
           acopy = acopy/10;
        }
        
                return Arr;
        
    } 
    
        
}
public class Main
{
	public static void main(String[] args) {
	    int a =12345;
	    Arraynum obj1 = new Arraynum();
	    int[] obj2 = obj1.array(a);
	    
	    for (int i : obj2)
	    {
	        
	         System.out.println("a integer array is " + i);
	         
	    }
	   
	}
}
