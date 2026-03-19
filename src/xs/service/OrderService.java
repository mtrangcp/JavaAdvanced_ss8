package xs.service;

import xs.discount.DiscountStrategy;
import xs.factory.SalesChannelFactory;
import xs.notification.NotificationService;
import xs.payment.PaymentMethod;

public class OrderService {
    private DiscountStrategy discount;
    private PaymentMethod payment;
    private NotificationService notification;

    public OrderService(SalesChannelFactory factory) {
        this.discount = factory.createDiscountStrategy();
        this.payment = factory.createPaymentMethod();
        this.notification = factory.createNotificationService();
    }

    public void processOrder(double price, int quantity) {
        double total = price * quantity;

        double finalPrice = discount.applyDiscount(total);
        System.out.println("Sau giảm giá: " + finalPrice);

        payment.pay(finalPrice);
        notification.notifyUser("Đơn hàng thành công");
    }
}
