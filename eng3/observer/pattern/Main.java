public class Main {
    public static void main(String[] args) {
        Store store = new Store("TechStore");

        Consumer alice = new Consumer("Alice");
        Consumer bob   = new Consumer("Bob");
        Consumer carol = new Consumer("Carol");

        //querem saber do lançamento
        store.subscribe(alice);
        store.subscribe(bob);

        System.out.println("Lançamento do Produto A");
        store.launchProduct("Smartphone X");

        //cancela a inscrição antes do próximo lançamento
        System.out.println("Bob cancelou a inscrição.");
        store.unsubscribe(bob);

        //se inscrever para o próximo lançamento
        System.out.println("Carol se inscreveu.");
        store.subscribe(carol);

        System.out.println("Lançamento do Produto B");
        store.launchProduct("Notebook Pro");
    }
}
