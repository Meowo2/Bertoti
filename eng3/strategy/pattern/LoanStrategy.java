//STRATEGY PATTERN - Interface
public interface LoanStrategy {
    boolean canBorrow();
    String getClientType();
}
