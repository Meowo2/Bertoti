import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lançamento de Produto");

        Store store = new Store("TechStore");

        //quer notificação?
        Consumer alice = new Consumer("Alice", true);
        Consumer bob   = new Consumer("Bob",   true);
        Consumer carol = new Consumer("Carol", false);

        List<Consumer> consumers = Arrays.asList(alice, bob, carol);

        store.launchProduct("Smartphone X", consumers);

        // Para "cancelar" a inscrição de Bob é preciso recriar o objeto
        System.out.println("\n(Bob não quer mais notificações — precisa recriar o objeto)");
        Consumer bobSemNotificacao = new Consumer("Bob", false);
        List<Consumer> consumersAtualizados = Arrays.asList(alice, bobSemNotificacao, carol);

        store.launchProduct("Notebook Pro", consumersAtualizados);
    }
}
