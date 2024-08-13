#include <stdio.h>
#include <stdlib.h>

#define MAX 10

void messagebox(char *message);
void display(int nums[], int size); // readonly parameter
void insert(int nums[], int *size, int value, int index);
void delete(int nums[], int *size, int index);

int main(void)
{
    int nums[MAX], size = 0, op, value, index;

    while (1)
    {
        printf("MAIN MENU\n");
        printf("1. Display array (travarsal)\n");
        printf("2. Insert an element\n");
        printf("3. Delete and element\n");
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
        case 2:
            printf("Enter value: ");
            scanf("%d", &value);
            printf("Enter index(max:%d): ", size);
            scanf("%d", &index);
            insert(nums, &size, value, index);
            break;
        case 3:
            printf("Enter index: ");
            scanf("%d", &index);
            delete (nums, &size, index);
            break;
        case 41:
            messagebox("This is a hidden feature (easter egg)");
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
    if (size == 0)
    {
        messagebox("Array is empty!");
        return;
    }

    printf("The array contains the following number:\n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\n", nums[i]);
    }
}

void insert(int nums[], int *size, int value, int index)
{
    if (*size > MAX - 1)
    {
        messagebox("Overflow!");
        return;
    }

    if (index > *size)
    {
        messagebox("Invalid Index");
        return;
    }

    for (int i = *size; i > index; i--)
    {
        nums[i] = nums[i - 1];
    }

    nums[index] = value;
    (*size)++;

    messagebox("Insert successful!");
    printf("Value inserted at %p.\n", &nums[index]);
}

void delete(int nums[], int *size, int index)
{
    if (*size == 0)
    {
        messagebox("Array is empty!");
        return;
    }

    if (index >= *size)
    {
        messagebox("Invalid Index");
        return;
    }

    for (int i = index; i < *size; i++)
    {
        nums[i] = nums[i + 1];
    }
    (*size)--;

    messagebox("Delete successful!");
}