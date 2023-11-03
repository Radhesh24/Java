import java.util.*;

public class Assignment {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        // Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
        // these 3 numbers.
        // (Hint : Average of N numbers is sum of those numbers divided by N.

        

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int avg = (A + B + C)/3;

        System.out.println(avg); 





        // Question 2: In a program, input the side of a square. You have to output the area of the
        // square.
        // (Hint : area of a square is (side x side))



        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);




        // Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        // an eraser. You have to output the total cost of the items back to the user as their bill.
        // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)



        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int price = p+q+r;
        int gst = price * 18/100;
        int total = price + gst;

        System.out.println(total);



        





    }
    
}
