import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

@Data
public class Order {

    private UUID orderNumber;

    public Order(UUID orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Queue<Order> ordersQueue() throws InterruptedException {
        Queue<Order> orders = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Order order = new Order(UUID.randomUUID());
            orders.add(order);
            if (i % 10 == 0) {
                Thread.sleep(2000);
            }
        }
        return orders;
    }

    public Order() {

    }
}
