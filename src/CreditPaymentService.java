public class CreditPaymentService {
    public int calculate(int loanAmmount, double interestRateYear, int loanTerm) {
        double interestRateMonth = interestRateYear / 12 / 100;
        double annuityRate = ((interestRateMonth * Math.pow((1 + interestRateMonth), loanTerm)) / ((Math.pow((1 + interestRateMonth), loanTerm) - 1)));
        double paymentAmount = loanAmmount * annuityRate;
        return (int) paymentAmount;
    }
}
