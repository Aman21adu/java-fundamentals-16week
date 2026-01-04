import java.util.Scanner;

public class MiniSelectionSort {

    private static int indexOfSmallest(int[] a, int start) {
        int index = start;
        for (int i = start + 1; i < a.length; i++) {
            if (a[i] < a[index]) {
                index = i;
            }
        }
        return index;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Before: ");
        for (int x : nums) System.out.print(x + " ");
        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            int smallest = indexOfSmallest(nums, i);
            swap(nums, i, smallest);
        }

        System.out.print("After : ");
        for (int x : nums) System.out.print(x + " ");
        System.out.println();
    }
}
