package maazashraf.assign;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {34, 10, 5, 89, 12};
        int size = nums.length;

        // Sorting Logic
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap if the element at j is greater than the element at j+1
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
    }
}
