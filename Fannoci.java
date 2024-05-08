 class Fabb {
    /**
     * @param args
     */
    public static void main(String[] args){
    int num1 = 0;
    int num2 =1; 
    int num3 =0;
    int count =10;
    System.out.println(num1);
    System.out.println(num2);
        for(int i=0; i<count; i++)
        {
            num3 =num1+ num2;
            num1 =num2;
            num2= num3;
            System.out.println(num3);
        }
    }
}
//*public class Fannoci{
    
    //Fabb obj1 = new Fabb();
    //int num3 = obj1.Fab();
    //System.out.println(num1);
    //System.out.println(num2);
    //System.out.println(num3);

//}}*//
