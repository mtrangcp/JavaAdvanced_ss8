package xs.discount;

public class WebsiteDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.9;
    }
}
