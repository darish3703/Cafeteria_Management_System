public class FinallyBlock{
    public static void main(String args[]){
        try{
            //array out of bounds error
            int a1[] = new int[2];
            System.out.println("acces element three: "+a1[3]);
 
            //zero division
            int a=30,b=3,c=3;
            int result=a/(b-c);
            System.out.println(result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
            System.out.println("Out of the block");
        }
        catch(ArithmeticException e1){
            System.out.println("Exception thrown: "+e1);
            System.out.println("Cannot divide with 0");
        }
        finally{
            System.out.println("result");
        }
    }
}
