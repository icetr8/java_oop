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
public class suinanAALabExerP214 {
    public static void main(String[] args) {
        int[][] data = {{3, 2, 5},
        {1, 4, 4, 8, 13},
        {9, 1, 0, 2},
        {0, 2, 6, 3, -1, -8}};
        
        // declare the max and the min
        // compute the sum
        int min = data[0][0];
        int max = data[0][0];
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                if (min > data[row][col]) {
                    min = data[row][col];
                }
                if (max < data[row][col]) {
                    max = data[row][col];
                }
            }
        }
        // write out the results
        System.out.println("Max is : " + max + "\nMin is : " + min);
       
    }
}
