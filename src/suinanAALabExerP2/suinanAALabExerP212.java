/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExerP2;

/**
 *
 * @author suinan
 */
public class suinanAALabExerP212 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
        {1, 4, 4, 8, 13},
        {9, 1, 0, 2},
        {0, 2, 6, 3, -1, -8}};
        // declare the sum
        // compute the sums for each row
        for (int row = 0; row < data.length; row++) {
        // initialize the sum
        // compute the sum for this row
        int sum = 0;
            for (int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
        // write the sum for this row
            System.out.println("sum of row : " + sum);
        }
    }
}
