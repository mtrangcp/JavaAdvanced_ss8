package xs.factory;

import xs.discount.DiscountStrategy;
import xs.discount.FirstTimeDiscount;
import xs.notification.NotificationService;
import xs.notification.PushNotification;
import xs.payment.MomoPayment;
import xs.payment.PaymentMethod;

public class MobileAppFactory implements SalesChannelFactory{
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new FirstTimeDiscount();
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new MomoPayment();
    }

    @Override
    public NotificationService createNotificationService() {
        return new PushNotification();
    }
}
