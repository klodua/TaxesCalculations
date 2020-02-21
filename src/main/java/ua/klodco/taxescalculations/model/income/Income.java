package ua.klodco.taxescalculations.model.income;

public abstract class Income {

    private String model;
    private int incomeValue;
    private double taxRate;

    protected Income(String model, int incomeValue, double taxRate) {
        this.model = model;
        this.incomeValue = incomeValue;
        this.taxRate = taxRate;
    }

    public String getModel() {
        return model;
    }


    public int getIncomeValue() {
        return incomeValue;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
