public class Pizzashop {
    private int pizza_price = 320;
    private int drink_price = 40;
    private int fries_price = 100;
    int total = 0;
    static int tk = 0;

    public Pizzashop() {
        System.out.println("Welcome to pizzashop");
    }

    public void order(int a) {
        System.out.println("You ordered " + a + " pizzas");
        total += pizza_price * a;
        tk += total;
        System.out.println("Total = " + total);
    }

    public void order(int a, int b) {
        System.out.println("You ordered " + a + " pizzas " + b + " drink");
        total += pizza_price * a + drink_price * b;
        tk += total;
        System.out.println("Total = " + total);
    }

    public void order(int a, int b, int c) {
        System.out.println("You ordered " + a + " pizzas " + b + " drink " + c + " frides");
        total += pizza_price * a + drink_price * b + fries_price * c;
        tk += total;
        System.out.println("Total = " + total);
    }


}

class Main {
    public static void main(String[] args) {
        Pizzashop p1 = new Pizzashop();
        Pizzashop p2 = new Pizzashop();
        Pizzashop p3 = new Pizzashop();

        p1.order(2, 4);
        p2.order(1, 2, 1);
        p3.order(3);
        System.out.println(Pizzashop.tk);
    }
}