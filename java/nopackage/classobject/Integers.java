public class Integers {
    private int i;

    Integers add(Integers x) {
        Integers sum = new Integers();
        sum.i = this.i + x.i;
        return sum;
    }
    public static void main(String[] args) {
        Integers a = new Integers();
        Integers b = new Integers();
        Integers c;
        a.i = 10;
        b.i = 20;
        c = a.add(b);
        System.out.println("The sum is: " + c.i);
    }
}
