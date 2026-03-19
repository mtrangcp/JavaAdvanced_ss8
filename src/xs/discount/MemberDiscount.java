package xs.discount;

public class MemberDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return  amount * 0.95;
    }
}
