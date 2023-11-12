public class decimal_to_binary {
    public static int dectobin(int dec){

        int pow = 0;
        int bin = 0;

        while(dec > 0){
            int rem = dec % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            dec = dec/2;

        }
        return bin;
    }

    public static void main(String args[]){
        System.out.println(dectobin(10));
    }
}
