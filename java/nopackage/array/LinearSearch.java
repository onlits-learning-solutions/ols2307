import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = { 34, 10, 5, 89, 12 };
        int size = nums.length;
        System.out.print("Enter search value: ");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();
        scanner.close();
        int i;
        for (i = 0; i < size; i++) {
            if (nums[i] == searchValue) {
                System.out.println(searchValue + " found at index " + i + ".");
                break;
            }
        }
        if (i == size)
            System.out.println("Search value not found! ");
    }
}
