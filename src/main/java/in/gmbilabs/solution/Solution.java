package in.gmbilabs.solution;

public class Solution {

    /**
     * Function to return max cheese in Kg such that no two consecutive cheese blocks are eaten by the mouse
     * <p> Solution approach:
     *     <ul>Loop through all the array elements and maintain two summations include and exclude</ul>
     *     <ul>Where:
     *          <ul>Include = Max sum including previous element</ul>
     *          <ul>Exclude = Max sum excluding the previous element</ul>
     *     </ul>
     *     <ul>At the end return Max(include, exclude)</ul>
     * </p>
     * @param arr - Input array of cheese blocks
     * @return maxCheeseInKg - Return max cheese in Kg
     */
    public static int maxCheeseInKg(int [] arr) {

        int include = arr[0];
        int exclude = 0;
        int excludeTmp = 0;

        for (int iTmp = 1; iTmp < arr.length; iTmp++) {

            // Get current max sum excluding ith array element
            excludeTmp = Math.max(include, exclude);

            // Get current max sum including ith array element
            include = exclude + arr[iTmp];
            exclude = excludeTmp;
        }

        // Return max of include and exclude
        return Math.max(include, exclude);
    }
}
