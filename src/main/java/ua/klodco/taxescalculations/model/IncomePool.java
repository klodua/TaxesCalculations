package ua.klodco.taxescalculations.model;

import ua.klodco.taxescalculations.model.income.Income;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IncomePool {

    private final List<Income> incomes = new ArrayList<>();

    public void addIncome(Income income) {
        incomes.add(income);
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    }
