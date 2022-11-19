import static org.junit.Assert.assertArrayEquals;

import java.lang.Math;

import org.junit.Test;

/*
 * @author Latif Fetahaj
 * @version 1.0
 *
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */

public class SquareArray {

    public SquareArray(){

    }

    public int[] squareArray(int a[]) {

        if(a == null) {
            return null;
        }

        //allocate a new array to save the result
        int result[] = new int[a.length];

        //initial pointers
        int start = 0;
        int end = a.length - 1;
        int resultIdx = a.length - 1;

        while(start < end) {
            if(Math.abs(a[start]) > Math.abs(a[end])) {
                result[resultIdx] = a[start] * a[start];
                start++;
            }
            else {
                result[resultIdx] = a[end] * a[end];
                end--;
            }
            resultIdx--;
        }

        return result;
    }


    @Test
    public void testSquareArray() {
        assertArrayEquals(new int []{0,1,4,9,16,25}, squareArray(new int[] {-4,-2,1,0,3,5}));
        assertArrayEquals(null, squareArray(new int[] {}));
        assertArrayEquals(new int []{4,4}, squareArray(new int[] {2,2}));

    }

}
