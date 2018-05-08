package epi.primitive;

public class CountBits {

    public static void main(String ards[])
    {
        short numBits = 0;
        int x = 100;
        numBits = (short) (x & 1);

        while(x != 0)
        {
            numBits += ( x & 1);
            x >>>= 1;
            System.out.println("numBits "+numBits);
            System.out.println("x "+x);
        }
        //

    }
}
