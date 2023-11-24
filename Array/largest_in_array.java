public class largest_in_array {
    
    public static int largest(int number[]){

        int largest = 0;
        for(int i = 0; i < number.length; i++){
            if( largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        
        int numbers[] = {10, 20 , 30 , 40 ,50, 26, 24, 17};
        System.out.println("largest in array : " +largest(numbers));
    }
}
