//OBSERVER PATTERN - Interface do Sujeito
public interface ProductSubject {
    void subscribe(ProductObserver observer);
    void unsubscribe(ProductObserver observer);
    void notifyObservers(String productName);
}
