public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // сумма кредита
        double interestRateYear = 9.99; // процентная ставка
        int loanTerm = 12; // срок кредита, в месяцах
        int paumentAmount = service.calculate(loanAmount, interestRateYear, loanTerm);
        System.out.println("Ежемесячный платеж по кредиту на " + loanTerm + " месяцев(-а) составит: " + paumentAmount + " рублей");
    }
}