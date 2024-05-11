import java.util.Arrays;

/**
 * @author Priyansu Sahoo
 * @created 11-05-2024 - 03:56 pm
 */
public class MultiDimensionMain {
    public static void main(String[] args) {
        int[][][] arr = new int[2][][];
        arr[0] = new int[2][];
        arr[1] = new int[2][];

        arr[0][0] = new int[3];
        arr[0][1] = new int[1];

        arr[1][0] = new int[1];
        arr[1][1] = new int[3];

        arr[0][0][0] = 1;
        arr[0][0][1] = 2;
        arr[0][0][2] = 3;

        arr[0][1][0] = 4;

        arr[1][0][0] = 5;

        arr[1][1][0] = 6;
        arr[1][1][1] = 7;
        arr[1][1][2] = 8;


        System.out.println(Arrays.deepToString(arr));
    }
}
