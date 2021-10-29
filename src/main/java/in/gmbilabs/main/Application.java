package in.gmbilabs.main;

import in.gmbilabs.solution.Solution;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for total test cases needs to be run
        System.out.println("Enter number of test cases:");
        int T = sc.nextInt();

        // Create array to hold the input test arrays and then to process these arrays later
        int[][] inputArrs = new int[T][];
        int i = 0;

        // Iterate for total number of test cases to take input arrays
        while (T-- > 0) {
            System.out.println("Enter total number of elements for " + (i + 1) + " test case: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter elements for " + (i + 1) + " test case: (space separated)");
            for (int iTmp = 0; iTmp < n; iTmp++) {
                arr[iTmp] = sc.nextInt();
            }

            // Insert the input array in array holder
            inputArrs[i++] = arr;
        }

        // Iterate through all the input arrays one by one and process
        for (int iTmp = 0; iTmp < inputArrs.length; iTmp++) {
            // Call Solution.maxCheeseInKg() method to calculate the max cheese a mouse can eat
            // Print the result for each input array
            try {
                System.out.println("Output for input: " + (iTmp + 1));
                System.out.println(Solution.maxCheeseInKg(inputArrs[iTmp]));
            } catch (Exception exp) {
                System.err.println("Exception while processing " + (iTmp + 1) + " input");
                exp.printStackTrace();
            }
        }
    }
}
