//Estudante: NÃO pode fazer empréstimo.
public class EstudanteStrategy implements LoanStrategy {

    @Override
    public boolean canBorrow() {
        return false;
    }

    @Override
    public String getClientType() {
        return "Estudante";
    }
}
