//Empresa: PODE fazer empréstimo.
public class EmpresaStrategy implements LoanStrategy {

    @Override
    public boolean canBorrow() {
        return true;
    }

    @Override
    public String getClientType() {
        return "Empresa";
    }
}
