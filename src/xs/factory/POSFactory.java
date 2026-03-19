package xs.factory;

import xs.discount.DiscountStrategy;
import xs.discount.MemberDiscount;
import xs.notification.NotificationService;
import xs.notification.PrintReceipt;
import xs.payment.CODPayment;
import xs.payment.PaymentMethod;

public class POSFactory implements SalesChannelFactory {
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new MemberDiscount();
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new CODPayment();
    }

    @Override
    public NotificationService createNotificationService() {
        return new PrintReceipt();
    }
}
