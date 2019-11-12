//1. WAP to illustrate Constructor Overloading and
// Constructor Chaining.

class Container // constructor overload
{
    double width, height, length;

    Container() {
        width = height = length = 0;
    }

    Container(double len) {
        width = height = length = len;
    }

    Container(double w, double h, double d) {
        width = w;
        height = h;
        length = d;
    }

    double volume() {
        return width * height * length;
    }
}

class ConstChain // constructor chaining
{
    ConstChain() {
        this(2);
        System.out.println("constructor 1 -> 0 parameters");
    }

    ConstChain(int a) {
        this(2, 3);
        System.out.println("constructor 2 -> 1 parameters");
    }

    ConstChain(int a, int b) {
        System.out.println("constructor 3 -> 2 parameters");
        System.out.println(a * b);
    }
}

public class T2_1 {
    public static void main(String args[]) {
        Container b1 = new Container();
        Container b2 = new Container(2);
        Container b3 = new Container(2, 3, 4);
        double vol1 = b1.volume();
        double vol2 = b2.volume();
        double vol3 = b3.volume();
        System.out.println(vol1);
        System.out.println(vol2);
        System.out.println(vol3);

        new ConstChain();
    }
}