#include <stdio.h>
#include <stdlib.h>

#define MAX 10

void messagebox(char *message);
void display(int nums[], int size);        //readonly parameter

int main(void)
{
    int nums[MAX], size = 0, op;
    while (1)
    {
        printf("MAIN MENU\n");
        printf("1. Display array (travarsal)\n");
        printf("Enter choice (0 to exit): ");
        scanf("%d", &op);
        switch (op)
        {
        case 0:
            exit(0);
            break;
        case 1:
            display(nums, size);
            break;
        default:
            messagebox("Invalid Option!");
        }
    }
}

void messagebox(char *message)
{
    printf("\n+------------------------+\n");
    printf("%s\n", message);
    printf("+------------------------+\n\n");
}

void display(int nums[], int size)
{
    if(size == 0)               // print the size of nums
    {
        messagebox("Array is empty!");
        return;
    }
    
    for (int i = 0; i < size; i++)
    {
        
    }
    
}