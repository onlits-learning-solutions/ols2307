#include <stdio.h>
int main(void)
{
    int nums[10] = {78, 101, 5, 96, 23, 32, 999, 2, 65, 43};
    printf("The array elements are as follows:\n");
    for(int i=0; i<10; i++) {
        printf("%d\n", nums[i]);
    }
    return 0;
}