//ANTI-PATTERN - Consumidor
public class Consumer {

    private final String name;
    private final boolean wantsNotification;

    public Consumer(String name, boolean wantsNotification) {
        this.name = name;
        this.wantsNotification = wantsNotification;
    }

    public String getName() {
        return name;
    }

    public boolean isWantsNotification() {
        return wantsNotification;
    }

    public void receiveNotification(String productName) {
        System.out.println("  → " + name + " foi notificado: \"" + productName + "\" está disponível!");
    }
}
