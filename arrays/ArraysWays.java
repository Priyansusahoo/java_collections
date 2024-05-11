import java.util.Arrays;

/**
 * @author Priyansu Sahoo
 * @created 11-05-2024 - 07:25 pm
 */
public class ArraysWays {
    public static void main(String[] args) {
        int[] x; // declare

        int[] y = new int[3]; // declare & initialize

        for (int i : y) { // check default value i.e 0
            System.out.println(i);
        }

        /**
         * new multidimensional array (object) -> will refer to arrays.
         */
        int[][] b = new int[2][];
        System.out.println(STR."b[0] = \{b[0]}"); // object -> null
        System.out.println(STR."b[1] = \{b[1]}"); // object -> null

        System.out.println(Arrays.deepToString(b));

        // creation
        b[0] = new int[2]; // new array at b's 0 index
        b[1] = new int[2]; // new array at b's 1 index

        b[0][0] = 1;
        b[0][1] = 2;

        b[1][0] = 3;
        b[1][1] = 4;

        System.out.println(Arrays.deepToString(b));

        // initialization, declaration, creation
        int[][] c = {{1,2,3,4,5,6}, {7,8,9,10,11,12}};

        System.out.println(Arrays.deepToString(c)); // print c


        /**
         * 3D-Arrays
         */

        Object[][][] bankai = new Object[3][][];

        bankai[0] = new Object[2][];
        bankai[1] = new Object[2][];
        bankai[2] = new Object[2][];

        bankai[0][0] = new Object[1];
        bankai[0][1] = new Object[1];

        bankai[1][0] = new Object[1];
        bankai[1][1] = new Object[1];

        bankai[2][0] = new Object[1];
        bankai[2][1] = new Object[1];

        bankai[0][0][0] = new TestNodeObject("Priyansu");
        bankai[0][1][0] = new TestNodeObject("Thanos");

        bankai[1][0][0] = new TestNodeObject("milton");
        bankai[1][1][0] = new TestNodeObject("babu");

        bankai[2][0][0] = new TestNodeObject("haki");
        bankai[2][1][0] = new TestNodeObject("haakai");


        System.out.println(Arrays.deepToString(bankai));
    }
}
