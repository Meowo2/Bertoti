//ANTI-PATTERN - Loja
import java.util.List;

public class Store {

    private final String name;

    public Store(String name) {
        this.name = name;
    }

    public void launchProduct(String productName, List<Consumer> consumers) {
        System.out.println("\n[" + name + "] Produto lançado: " + productName);

        for (Consumer consumer : consumers) {
            if (consumer.isWantsNotification()) {
                consumer.receiveNotification(productName);
            }
        }
    }
}
