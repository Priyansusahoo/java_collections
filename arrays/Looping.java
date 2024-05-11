/**
 * @author Priyansu Sahoo
 * @created 11-05-2024 - 10:36 pm
 */
public class Looping {
    public static void main(String[] args) {
        int[][] b = new int[2][3];

        for(int[] arr : b){ // for-each
            for (int ele : arr){
                System.out.print(ele + " ");
            }
            System.out.println("\n");
        }

        for(int i=0; i<b.length; i++) { // normal for loop
            for (int j=0; j<b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
