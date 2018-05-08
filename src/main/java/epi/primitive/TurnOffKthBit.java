package epi.primitive;

public class TurnOffKthBit
{
    public static void main(String[] args)
    {
        int kthInput = 5;
        int input = 50;
        turnOffkthBit(input,kthInput);

    }

    private static void turnOffkthBit(int input, int kthInput)
    {
        int x = (input & ~(1 << (kthInput - 1))); // set kth bit to 0
        int p = (x | (1 << (kthInput - 1)));     // set kth bit to 1
        int q = (p ^ (1 << (kthInput - 1)));     // toggle kth bit to 1 and 0
        System.out.println(Integer.toString(input,2));
        System.out.println(Integer.toString(x,2) + " "+x);
        System.out.println(Integer.toString(p,2) + " "+p);
        System.out.println(Integer.toString(q,2) + " "+q);
        System.out.println(x + " "+ p +" "+q);

    }
}
