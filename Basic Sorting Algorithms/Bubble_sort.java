public class Bubble_sort {
    
    public static void bubble(int arr[]){

        for(int turns = 0; turns < arr.length -1; turns++ ){

            for(int j = 0; j < arr.length-1-turns; j++ ){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printarr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 4, 1};
        bubble(arr);
        printarr(arr);
    }
}
