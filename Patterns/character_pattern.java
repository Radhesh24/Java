import java.util.*;

public class character_pattern {

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        char c = 'A';

        for (int line = 1; line <= n; line++){

            for (int j = 1; j<= line; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
            
        }


        
    }
    
}
