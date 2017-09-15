/**
 * Created by wtjun on 2017/9/14.
 */
public class DecimalTo24 {
    final static char[] digits = {
            'B','C','D','F','G',
            'H','J','K','M','P',
            'Q','R','T','V','W',
            'X','Y','2','3','4',
            '6','7','8','9'
    };
    public static void main(String[] args) {

    }
    public String encode(int val ,int shift){
        if(val<24){
            return String.valueOf(digits[val]);
        }

        return  "";
    }
    public  int  decode(String val){

        return  1;
    }
}
