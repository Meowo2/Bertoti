//STRATEGY PATTERN - Context
public class LoanEvaluator {

    private LoanStrategy strategy;

    public LoanEvaluator(LoanStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(LoanStrategy strategy) {
        this.strategy = strategy;
    }

    public String evaluate() {
        String type = strategy.getClientType();
        if (strategy.canBorrow()) {
            return type + ": PODE fazer empréstimo.";
        } else {
            return type + ": NÃO pode fazer empréstimo.";
        }
    }
}
