package ua.klodco.taxescalculations.model.income;

import ua.klodco.taxescalculations.model.income.Income;

public class IncomeAdditional extends Income {

    public IncomeAdditional(String model, int incomeValue, double taxRate) {
        super( model, incomeValue, 25);
    }
}