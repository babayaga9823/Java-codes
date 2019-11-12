// 8. Write a simple generics class example with two type parameters.

class Generic<X, Y>
{
    X ob1;
    Y ob2;
    public Generic(X a, Y b) {
        ob1 = a;
        ob2 = b;
    }

    public void print() {
        System.out.println(ob1.getClass().getName() + " " + ob1);
        System.out.println(ob2.getClass().getName() + " " + ob2);
    }
}

class T2_8
{
    public static void main(String[] args) {
        Generic<Integer, String> g = new Generic<Integer, String>(123, "Hello");
        g.print();
    }
}