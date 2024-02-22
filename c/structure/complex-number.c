#include <stdio.h>
typedef struct complex
{
    float real;
    float imaginary;
} COMPLEX;


void read(COMPLEX *c)
{
    printf("Enter real part of complex number: ");
    scanf("%f", &c->real);
    printf("Enter imaginary part of complex number: ");
    scanf("%f", &c->imaginary);
}

void display(COMPLEX c)
{
    printf("The number is %1.2f + %1.2fi.\n", c.real, c.imaginary);
}

int main(void)
{
    COMPLEX c;
    read(&c);
    display(c);
    return 0;
}