public class sum_subarray {
    
    public static void subarray(int numbers[]){

        for(int i = 0; i < numbers.length; i++){

            for(int j = i; j < numbers.length; j++){

                int sum = 0;
                for(int k = i; k <= j; k++){

                    sum += numbers[k] ;
                    
                }
                System.out.print(sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}
