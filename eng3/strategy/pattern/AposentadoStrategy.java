//Aposentado: PODE fazer empréstimo.
public class AposentadoStrategy implements LoanStrategy {

    @Override
    public boolean canBorrow() {
        return true;
    }

    @Override
    public String getClientType() {
        return "Aposentado";
    }
}
