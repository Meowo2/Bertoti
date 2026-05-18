//OBSERVER PATTERN - Consumidor
public class Consumer implements ProductObserver {

    private final String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void onProductAvailable(String productName) {
        System.out.println("  → " + name + " foi notificado: \"" + productName + "\" está disponível!");
    }

    public String getName() {
        return name;
    }
}
