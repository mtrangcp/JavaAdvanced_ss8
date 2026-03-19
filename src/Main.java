import xs.factory.MobileAppFactory;
import xs.factory.POSFactory;
import xs.factory.SalesChannelFactory;
import xs.factory.WebsiteFactory;
import xs.service.OrderService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Website");
        System.out.println("2. Mobile App");
        System.out.println("3. POS");
        int choice = sc.nextInt();

        SalesChannelFactory factory = null;

        switch (choice) {
            case 1: factory = new WebsiteFactory(); break;
            case 2: factory = new MobileAppFactory(); break;
            case 3: factory = new POSFactory(); break;
            default:
                System.out.println("Sai lựa chọn");
                return;
        }

        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();

        OrderService service = new OrderService(factory);
        service.processOrder(price, quantity);

    }
}