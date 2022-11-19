import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CloneEven {

    public CloneEven() {
    }

    public int[] cloneEven(int[] a) {

        //checking for the null case
        if(a != null) {
            //initialize the pointers
            int end = a.length;
            int i = findIndexLastNumber(a);

            while(i >= 0) {
                if(a[i] % 2 == 0) {
                    a[--end] = a[i];
                    a[--end] = a[i];
                }
                else {
                    a[--end] = a[i];
                }
            i--;
            }
        }
        else {
            System.out.print("The array is null");
        }

    return a;
    }



    @Test
    public void testCloneEven() {
        //normal-mix
        assertArrayEquals(new int[] {2,2,4,4,1,0,0,3},cloneEven(new int[] {2,4,1,0,3,-1,-1,-1}));

        //all odd
        assertArrayEquals(new int[] {1,3,5,7}, cloneEven(new int[] {1,3,5,7}));

        //all even
        assertArrayEquals(new int[] {2,2,4,4,6,6,8,8},cloneEven(new int[] {2,4,6,8,-1,-1,-1,-1}));

        //empty array
        assertArrayEquals(new int[] {}, cloneEven(new int[] {}));

        //single element even
        assertArrayEquals(new int[] {10,10}, cloneEven(new int[] {10,-1}));

        //single element odd
        assertArrayEquals(new int[] {3}, cloneEven(new int[] {3}));


    }

    //helper function
    /*
     * [1,2,3,4,-1,-1]
     *
     * @return The index of the last number that is different from -1
     */
    public int findIndexLastNumber(int[] a) {
        int index = 0;

        while(index < a.length) {
            if(a[index] == -1) {
                return (index - 1);
            }
            index++;
        }

        return (index - 1);
    }

    @Test
    public void testFindIndexLastNumber() {
        assertEquals(3 , findIndexLastNumber(new int[] {1,2,3,4,-1,-1}));

        assertEquals(4 , findIndexLastNumber(new int[] {1,3,5,7,9}));

        assertEquals(0 , findIndexLastNumber(new int[] {1}));

        assertEquals(3, findIndexLastNumber(new int[] {1,2,3,5}));
    }
}
