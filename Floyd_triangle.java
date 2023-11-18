public class Floyd_triangle {
    
    public static void floyd_traingle(int n){
        int counter = 1;
        for(int i = 1; i<= n; i++){
            

            for(int j =1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        floyd_traingle(4);
    }
}
