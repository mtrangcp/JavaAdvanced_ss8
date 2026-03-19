package xs.factory;

import xs.discount.DiscountStrategy;
import xs.discount.WebsiteDiscount;
import xs.notification.EmailNotification;
import xs.notification.NotificationService;
import xs.payment.CreditCardPayment;
import xs.payment.PaymentMethod;

public class WebsiteFactory implements SalesChannelFactory{
    @Override
    public DiscountStrategy createDiscountStrategy() {
        return new WebsiteDiscount();
    }

    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }

    @Override
    public NotificationService createNotificationService() {
        return new EmailNotification();
    }
}
