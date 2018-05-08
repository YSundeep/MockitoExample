import java.util.Arrays;
import java.util.Collections;

public class FirstProgram {
    public static void main(String[] args)
    {
        int[] array = {8,7,2,5,3,1};
        int[] array1 = array;
        Arrays.sort(array);
        for (int a : array) {
            System.out.print(a+" ");
            System.out.println();
        }
        for (int a : array1) {
            System.out.print(a+" ");
            System.out.println();
        }
        int result = 10;
        int low = 0;
        int high = array.length-1;

        while(low < high)
        {
            if(array[low] + array[high] < result) low++;
            else if(array[low] + array[high] > result) high--;
            else {
                System.out.println("pair found at : "+low+" and "+(high));
                break;
            }
        }

    }
}
