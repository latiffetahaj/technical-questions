
/**
 * Level: Medium
 * Given an array of integers, find the shortest sub array, that if sorted, results in the entire array being sorted.
 * For example:[1,2,4,5,3,5,6,7] --> [4,5,3] - If you sort from indices 2 to 4, the entire array is sorted.
 * [1,3,5,2,6,4,7,8,9] --> [3,5,2,6,4] -  If you sort from indices 1 to 5, the entire array is sorted.
 *
 *
 * /*
 * @author Latif Fetahaj
 * @version 1.0
 *
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */

public class UnSortedSubArray {

    public static void unsortedSubArray(int[] a) {

        //traversing the array from both ends to find
        //first dip from the left side
        //first bump from the right side

        int start = 0;
        int end = a.length - 1;

        //first dip from the left side
        int i = 0;
        while(i < a.length && a[i+1] >= a[i]) {
            start++;
            i++;
        }

        //first bump from the right side
        int j= a.length -1;
        while(j > 0 && a[j-1] <= a [j]) {
            end--;
            j--;
        }

        //find the min and max in the interval [start,end]
        int min = a[start];
        int max = a[start];

        for(int idx = start; idx <= end; idx++) {
            if(a[idx] < min)
                min = a[idx];

            if(a[idx] > max)
                max = a[idx];
        }

        while(start > 0 && a[start - 1] > min) {
            start--;
        }

        while(end < (a.length - 1) && a[end + 1] < max) {
            end++;
        }

        System.out.println(start);
        System.out.println(end);
    }



    public static void main(String[] args) {

        int array[] = {1,2,3,4,6,8,7,5,9};

        unsortedSubArray(array);

    }

}