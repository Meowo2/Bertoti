//ANTI-PATTERN
public class LoanEvaluator {

    public boolean evaluate(String clientType) {
        if (clientType.equals("ClienteComum")) {
            return false;

        } else if (clientType.equals("Empresa")) {
            return true;

        } else if (clientType.equals("Aposentado")) {
            return true;

        } else if (clientType.equals("Estudante")) {
            return false;

        } else {
            return false;
        }
    }
}
