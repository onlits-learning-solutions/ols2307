#include <iostream>
using namespace std;

class Integer
{
    int i;

public:
    Integer()
    {
    }

    Integer(int i)
    {
        this->i = i;
    }

    Integer operator+(Integer x)        //operator overloading
    {
        Integer sum;
        sum.i = this->i + x.i;
        return sum;
    }

    int put()
    {
        return i;
    }
};

int main(void)
{
    Integer a(10), b(30), c;
    
    c = a + b;
    cout << "The sum is: " << c.put() << endl;
    return 0;
}