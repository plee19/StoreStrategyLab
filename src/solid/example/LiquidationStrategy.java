package solid.example;

public class LiquidationStrategy implements DiscountStrategy {
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
