package OTHERS;

public class No_1_bits {
    public static int no_of_one_bits(int n){
        
        int counter = 0;
        int a = 1;

        for(int i=0;i<32;i++){
            if( (a & n) != 0){
                counter++;
            }
            a <<= 1;
            // a *=2;
        }
        return counter;
    }


public static void main(String[] args){
    int n = 3;
    int no = no_of_one_bits(n);
    System.out.println(no);
}
}