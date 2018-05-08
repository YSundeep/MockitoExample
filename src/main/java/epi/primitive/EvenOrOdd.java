package epi.primitive;

public class EvenOrOdd
{
    public static void main(String args[])
    {
        int number = 10;

        if( (number&1) == 0){

            System.out.printf( number + " is even %n");

        } else{

            System.out.printf( number + " is odd %n");

        }
    }
}
