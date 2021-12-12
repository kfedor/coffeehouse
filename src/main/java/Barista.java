import java.util.UUID;

public class Barista {

    public void executeOrder() throws InterruptedException {
        Order order = new Order();
        while (order.ordersQueue().size() > 0) {
            UUID orderNumber = order.ordersQueue().poll().getOrderNumber();
            System.out.println("Заказ № " + orderNumber + " готов к выдаче!");
        }
    }
}
