#include <iostream>

using namespace std;

class complex
{
private:
    float real;
    float imaginary;

public:
    void read()
    {
        cout << "Enter the real part of complex number: ";
        cin >> real;
        cout << "Enter the imaginary part of complex number: ";
        cin >> imaginary;
    }
    void display()
    {
        cout << "The number is " << real << " + " << imaginary <<"i" << endl;
    }
};

int main(void)
{
    //complex c;      //c is an object here (memory allocated statically)
    complex *c = new complex(); //c is pointer to object (memory allocated dynamically)
    c->read();
    c->display();
    return 0;
}