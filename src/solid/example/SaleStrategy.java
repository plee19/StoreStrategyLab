package solid.example;

public class SaleStrategy implements DiscountStrategy {
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}
