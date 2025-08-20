package STRING;

public class reverseInt {
    public int reverse(int x){
        int result = 0;

        while(x != 0){
            int remainder = x % 10;

            int temp = (result * 10)  + remainder;

            // result = 20 , remainder = 3
            // temp should be 203

            if((temp - remainder) / 10 != result){
                return 0;
            }
            // if (temp - remainder) / 10 = result

            x  = x/10;
            result = temp;
        }
        return result;
    }
}
