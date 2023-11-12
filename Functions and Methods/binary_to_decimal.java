public class binary_to_decimal {

    public static int bintodec(int binnum){

        int pow = 0;
        int dec = 0;

        while (binnum > 0){
            int lastdigit = binnum % 10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum / 10;
        }
        return dec;
    }
    public static void main(String args[]){
       System.out.println(bintodec(1010)); 
    }
}
