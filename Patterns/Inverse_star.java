import java.util.*;

public class Inverse_star {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();  // To determine no of lines

    for (int line = 1; line <= n; line++ ){

        for (int star = 1; star <= n - line + 1; star++){

            System.out.print("*");
        }
        System.out.println();
    }

    }

    


    
}
