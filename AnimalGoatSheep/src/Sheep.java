class Sheep extends Animal {
    private double b;

    public Sheep(int age, double weight, double b) {
        super(age, weight);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double computePrice(double c) {
        double p;
        double w = getWeight();
        int a = getAge();
        p = Math.pow((w * w) / (a + this.b), c);
        return p;
    }
}