public class Assignment {
    public static boolean not_unique(int nums[]){
        
        for(int i = 0; i < nums.length; i++){
            
            for(int j = i + 1; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int nums[] = {2,6,9,8};
        System.out.println(not_unique(nums));
    }
}
