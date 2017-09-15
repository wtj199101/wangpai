/**
 * Created by wtjun on 2017/9/13.
 */

public class BinaryToDecimal {
    final static char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'a' , 'b' ,
            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };

    public static void main(String[] args) {

        System.out.println(DecimalValToBinary(11,1));
//        System.out.println(11>>>2);
//        int i=11;
//        int j = i & 0x8000;
//        int n=0;
//        while(j == 0){
//            n++;
//            i <<= 1;
//            j = i & 0x8000;
//        }
//        System.out.println(22528&0x8000);
//        System.out.println(45056&0x8000);
    }

    private static int DecimalValToBinary(int val,int shift) {
        int msg=Integer.SIZE-numberOfLeadingZeros(val);//32-5  27
        int chars = Math.max(((msg + (shift - 1)) / shift), 1);
        System.out.println("chars="+chars);
        char[] buf = new char[chars];

        formatUnsignedInt(val, shift, buf,  0, chars);
        String s = new String(buf);
        System.out.println(s);
        return  0;
    }

    private static int BinaryToDecimalVal(int i,int shift) {

        return 0;
    }


    public static int numberOfLeadingZeros(int i) {//1011
        // HD, Figure 5-6
        if (i == 0)
            return 32;
        int n = 1;
        if (i >>> 16 == 0) { n += 16; i <<= 16; }//n=17,i=1011 0000 0000 0000 00000
        if (i >>> 24 == 0) { n +=  8; i <<=  8; }//n=25 i=1011 24
        if (i >>> 28 == 0) { n +=  4; i <<=  4; }//n=29 i=28
        if (i >>> 30 == 0) { n +=  2; i <<=  2; }// !=0
        System.out.println(n);
        i=i >>> 31;
        n -= i;// 27  32-27 5  i=
        return n;
    }
    static int formatUnsignedInt(int val, int shift, char[] buf, int offset, int len) {
        int charPos = len;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            buf[offset + --charPos] = BinaryToDecimal.digits[val & mask];
            val >>>= shift;
        } while (val != 0 && charPos > 0);

        return charPos;
    }

}
