public class Main {
    public static void main(String[] args) {
        System.out.println("Banco - Avaliação de Empréstimos\n");

        LoanEvaluator evaluator = new LoanEvaluator();

        System.out.println(evaluator.evaluate("ClienteComum"));
        System.out.println(evaluator.evaluate("Empresa"));
        System.out.println(evaluator.evaluate("Aposentado"));
        System.out.println(evaluator.evaluate("Estudante"));
    }
}
