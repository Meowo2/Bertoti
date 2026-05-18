public class Main {
    public static void main(String[] args) {
        System.out.println("Banco - Avaliação de Empréstimos\n");

        LoanEvaluator evaluator = new LoanEvaluator(new ClienteComumStrategy());
        System.out.println(evaluator.evaluate());

        evaluator.setStrategy(new EmpresaStrategy());
        System.out.println(evaluator.evaluate());

        evaluator.setStrategy(new AposentadoStrategy());
        System.out.println(evaluator.evaluate());

        evaluator.setStrategy(new EstudanteStrategy());
        System.out.println(evaluator.evaluate());
    }
}
