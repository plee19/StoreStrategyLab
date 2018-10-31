package solid.example;

public class NoStrategy implements DiscountStrategy {
    public double getBillAmount(double billAmount) {
        return billAmount;
    }
}
