public class max_sum_subarray {
    
    public static void bruteforce(int numbers[]){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){

            for(int j = i; j < numbers.length; j++){

                int curr_sum = 0;
                for(int k = i; k <= j; k++){

                    curr_sum += numbers[k];
                
                    if(max < curr_sum ){
                        max = curr_sum;
                    }
                }
            }
        }
        System.out.println("Max sum subarray is : "+ max);
    }
    public static void main(String[] args) {
        
        int numbers[] = {1,-2,6,-1,3};
        bruteforce(numbers);
    }
}
