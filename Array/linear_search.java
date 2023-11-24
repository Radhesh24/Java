public class linear_search {
    
    public static int linearsearch(int number[], int key){

        for(int i = 0; i < number.length; i++){

            if(number[i] == key){

                return i;
            }
            
        }
        return -1;
        
    }

    public static void main(String[] args) {

        int numbers[] = {5, 10, 15, 20};
        int key = 15;
        
        int result = linearsearch(numbers, key);
        if(result == -1){
            System.out.println("Match not found");
        }
        else{
            System.out.println("Match found at index "+ result);
        }
    }

}
