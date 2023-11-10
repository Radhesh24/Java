import java.util.*;

public class product {
    public static int product2no(int a, int b){
        int product = a * b;
        return product;
    }

    public static void main(String args[] ){

        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int product = product2no(n1, n2);

        System.out.println(product);
    }
}
