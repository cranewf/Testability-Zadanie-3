public class CreditPaymentService {

    public double calculate(double percent, double months, double credit) {

        double fractionOfPercent = percent / 100;

        double payment = (credit * (fractionOfPercent / 12)) * (Math.pow((1 + (fractionOfPercent / 12)), months)) / ((Math.pow((1 + (fractionOfPercent / 12)), months)) - 1);

        return payment;
    }
}

