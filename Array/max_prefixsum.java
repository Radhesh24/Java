public class max_prefixsum {
    
    public static void prefixsum(int numbers[]){

        int prefix[] = new int[numbers.length];
        int curr_sum = 0;
        int max = Integer.MIN_VALUE;

        prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++){

            for(int j = i; j < numbers.length; j++){

                curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1];

                if(max < curr_sum ){
                max = curr_sum;
            }
            
            }
        }
        System.out.println("Max sum subarray is : "+ max);
    }

    public static void main(String[] args) {
        
        int numbers[] = {1,-2,6,-1,3};
        prefixsum(numbers);
    }
}
