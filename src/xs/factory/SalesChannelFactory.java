package xs.factory;

import xs.discount.DiscountStrategy;
import xs.notification.NotificationService;
import xs.payment.PaymentMethod;

public interface SalesChannelFactory {

    DiscountStrategy createDiscountStrategy();
    PaymentMethod createPaymentMethod();
    NotificationService createNotificationService();

}
