public class ProductionFactory implements ReportFactory{
    @Override
    public IFinancialReport createFinancialReport() {
        return new FinancialReport();
    }

    @Override
    public ICashFlowReport createCashFLowReport() {
        return new CashFlowReport();
    }

    @Override
    public IBalanceReport createBalanceReport() {
        return new BalanceReport();
    }
}
