public class Overloading_type_param {

    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String args[]){

        System.out.println(sum(3,4));
        System.out.println(sum(3.2f,3.8f));


    }
    
}
