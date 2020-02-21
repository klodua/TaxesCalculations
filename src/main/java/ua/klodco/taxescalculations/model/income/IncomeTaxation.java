package ua.klodco.taxescalculations.model.income;

public final class IncomeTaxation {

    private static class IncomeTaxationPerson {
        private static final IncomeTaxation instance = new IncomeTaxation();
    }

    public static IncomeTaxation getInstance() {
        return IncomeTaxationPerson.instance;
    }

    private IncomeTaxation() {
    }

    public Income calculation(String taxesType, String model, int incomeValue, double taxRate) {
        Income income;

        switch (taxesType) {
            case "MAIN":
                income = new IncomeMain(model, incomeValue, taxRate);
                break;
            case "ADDITIONAL":
                income = new IncomeAdditional(model, incomeValue, taxRate);
                break;
            default:
                throw new IllegalArgumentException("Wrong type of taxes: " + taxesType);
        }
        return income;
    }
}
