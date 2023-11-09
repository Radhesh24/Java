import java.util.*;

public class half_pyramid {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int line = 1; line<= n; line++){

            for (int i = 1; i<=line; i++){

                System.out.print(i);
            }
            System.out.println();
        }

    }
    
}
