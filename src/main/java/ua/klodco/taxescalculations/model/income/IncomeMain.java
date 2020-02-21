package ua.klodco.taxescalculations.model.income;

import ua.klodco.taxescalculations.model.income.Income;

public class IncomeMain extends Income {

    public IncomeMain(String model, int incomeValue, double taxRate) {
        super( model, incomeValue, 50);
    }
}
