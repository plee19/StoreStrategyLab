package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;
    /*
    * I was unsure whether changing "char discountType" to "DiscountStrategy discountStrategy" was necessary, but
    * didn't want to change the main method, so I moved the switch/case into the constructor to initialize Customer
    * with a char.
    */
    public Customer(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        switch(discountType) {
            case 'd':
            case 'D':
                this.discountStrategy = new NormalDiscountStrategy();
                break;
            case 'L':
            case 'l':
                this.discountStrategy = new LiquidationStrategy();
                break;
            case 'S':
            case 's':
                this.discountStrategy = new SaleStrategy();
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return discountStrategy.getBillAmount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountStrategy=" + discountStrategy +
                '}';
    }
}
