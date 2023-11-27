public class trapped_rainwater {
    
    public static int trapped_water(int heights[]){
        
        int n = heights.length;
        int left_max[] = new int[n];
        int right_max[] = new int[n];
        int water = 0;

        //Left max array
        left_max[0] = heights[0];
        for(int i = 1; i < n; i++){

            left_max[i] = Math.max(left_max[i -1], heights[i]);
        }

        //Right max array
        right_max[n-1] = heights[n-1];
        for(int i = n-2; i >=0; i--){

            right_max[i] = Math.max(right_max[i+1], heights[i]);
        }

        for(int i =0; i < n; i++){

            int waterlevel = Math.min(left_max[i], right_max[i]);
            water += waterlevel - heights[i];
        }
        return water;

    }

    public static void main(String[] args) {
        
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println(trapped_water(heights));
    }
}
