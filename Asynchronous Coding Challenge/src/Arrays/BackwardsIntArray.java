package Arrays;

import java.util.Arrays;

public class BackwardsIntArray {

    public static void main(String[] args) {

        int j = 0;
        int backwardsArray[] = new int[10];

        int[] intArray = {12, 657, 743, 89, 36, 6, 900, 54, 753, 234};

        for (int i = intArray.length - 1; i >= 0; i --) {
            backwardsArray[j] = intArray[i];
            j ++;
        }
        System.out.println(Arrays.toString(backwardsArray));


    }

}
