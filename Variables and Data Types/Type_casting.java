

public class Type_casting {

    public static void main(String args[]){

        // Type Casting in Java is the forced conversion of one type of data to another with Data Loss
        // Also called as Explicit/Lossy conversion or Narrowing
        // Checks for Data Compatibility but allows data loss


        float a = 10.25f;
        int b = (int) a;

        System.out.println(b);


        long d =  12;
        float f = d;
        System.out.println(d);


    }
    
}
