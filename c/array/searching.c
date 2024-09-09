#include <stdio.h>
int main(void)
{
    int nums[10] = {78, 101, 5, 96, 23, 32, 999, 2, 65, 43};
    int key;
    printf("Enter the value to search: ");
    scanf("%d", &key);
    for(int i=0; i<10; i++)
    {
        if(nums[i] == key)
        {
            printf("%d found at index %d.\n", key, i);
            return 0;
        }
    }
    printf("%d not found\n", key);
    return 0;
}