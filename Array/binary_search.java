public class binary_search {
    
    public static int binarysearch(int numbers[], int key){

        int start = 0;
        int end = numbers.length - 1;

        while( start <= end){
            int mid = (start + end)/2;
            
            if(numbers[mid] == key){
                return mid;
            }
            else if (numbers[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int numbers[] = {2, 4, 6, 8, 10};
        int key = 10;

        int result = binarysearch(numbers, key);
        if(result == -1){
            System.out.println("Match not found");
        }
        else{
            System.out.println("Match found at index :"+ result);
        }
    }
}
