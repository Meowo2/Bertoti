//Cliente Comum: NÃO pode fazer empréstimo.
public class ClienteComumStrategy implements LoanStrategy {

    @Override
    public boolean canBorrow() {
        return false;
    }

    @Override
    public String getClientType() {
        return "Cliente Comum";
    }
}
