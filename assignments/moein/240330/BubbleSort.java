public class BubbleSort {
   public static void main(String[] args) {
      int num[] = { 7, 5, 3, 12, 9, 10 };
      int size = num.length;
     
      for (int i = 0; i < size -1; i++) {
         for (int j = 0; j < size - i -1; j++) {
            if (num[j] > num[j + 1]) {
               int temp = num[j];
               num[j] = num[j + 1];
               num[j + 1] = temp;

            }
         }
      }
      // Display the array
      for (int i = 0; i < size; i++) {
         System.out.println(num[i] );
      }
   }
}