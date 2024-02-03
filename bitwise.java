
public class bitwise {

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        /*
         * 1----> Binary AND &
         * 0&0=0
         * 0&1=0
         * 1&0=0
         * 1&1=1
         * 
         * 
         * 2---->Binary or |
         * 0|0=0
         * 0|1=1
         * 1|0=1
         * 1|1=1
         * 
         * 
         * 3---->Binary XOR ^
         * 0^0=0
         * 0^1=1
         * 1^0=1
         * 1^1=0
         * 
         * 
         * 4---->Binary one's complement ~
         * ~o=1
         * ~1=0
         * 
         * 
         * 5--->Binary left shift <<
         * 000101100
         * a<<b(2)
         * 010110000
         * a<<b= a*2 to power b---formula
         * 
         * 
         * 
         * 6---->Binary Right Shift >>
         * 00100100
         * a>>b(2)
         * 00001001
         * a>>b=a/2 to power b----formula
         */

        /*
         * OPERATIONS
         * 1- Get ith bit
         * 2- Set ith bit
         * 3- Clear ith bit
         */
    }
}
