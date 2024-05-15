class Goat extends Animal {
    public Goat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public double computePrice(double c) {
        double p;
        double w = getWeight();
        int a = getAge();
        p = Math.pow((w * w) / a, c);
        return p;
    }
}