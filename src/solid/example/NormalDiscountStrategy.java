package solid.example;

public class NormalDiscountStrategy implements DiscountStrategy {
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
