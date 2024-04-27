#include <stdio.h>

int main(void)
{
    int *a;
    printf("%p\n", &a);
    printf("%d bytes\n", sizeof(a));
    return 0;
}