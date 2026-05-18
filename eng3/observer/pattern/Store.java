import java.util.ArrayList;
import java.util.List;

//OBSERVER PATTERN - Loja
public class Store implements ProductSubject {

    private final String name;
    private final List<ProductObserver> observers = new ArrayList<>();

    public Store(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(ProductObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(ProductObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String productName) {
        for (ProductObserver observer : observers) {
            observer.onProductAvailable(productName);
        }
    }

    public void launchProduct(String productName) {
        System.out.println("\n[" + name + "] Produto lançado: " + productName);
        notifyObservers(productName);
    }
}
