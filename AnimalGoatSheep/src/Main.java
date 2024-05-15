class Main {
    public static void main(String[] args) {

        Animal s, g;
        s = new Sheep(3, 37, 8.6);
        g = new Goat(2, 15);
        double avg = g.computePrice(0.59) + s.computePrice(0.34);
        avg = (avg / 2.0);
        System.out.println("Result = " + avg);
    }
}