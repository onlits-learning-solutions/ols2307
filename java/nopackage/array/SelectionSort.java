public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 34, 10, 5, 89, 12 };
        int size = nums.length;

        // Sorting Logic

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // Display the array
        for (int i = 0; i < size; i++) {
            System.out.println(nums[i]);
        }
    }
}
