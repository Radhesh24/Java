public class kadane {
    
    public static void kadanes(int numbers[]){

        int curr_sum = 0;
        int max = Integer.MIN_VALUE;
        int largest = numbers[0];
        int temp = 0;

        for(int i = 0; i < numbers.length; i++){
            
            if (numbers[i] >= 0){
                temp = 1;
                break;
            }
            
        }
        if(temp != 1){
            for(int i = 0; i < numbers.length; i++){

                if(largest < numbers[i]){
                    largest = numbers[i];
                }
            }
            max = largest;
        }

        else{

            for(int i = 0; i < numbers.length; i++){

                curr_sum = curr_sum + numbers[i];
                if( curr_sum < 0){
                    curr_sum = 0;
                }
            }
            max = Math.max(curr_sum,max);

        }
        System.out.println("Max subarray sum : "+max);
    }

    public static void main(String args[]){

        int numbers[] = {-9,-2,-6,-1,-3};
        kadanes(numbers);
    }
}
