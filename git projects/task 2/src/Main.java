public class Main {

    public static void main(String[] args) {
        ReportFactory factory = new FinancialFactory();
        factory.createFinancialReport();
        factory.createCashFLowReport();
        factory.createBalanceReport();
    }
}
