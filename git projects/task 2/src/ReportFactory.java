public interface ReportFactory {

    IFinancialReport createFinancialReport();
    ICashFlowReport createCashFLowReport();
    IBalanceReport createBalanceReport();

}
