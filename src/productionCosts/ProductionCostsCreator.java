package productionCosts;

import java.util.Scanner;

public class ProductionCostsCreator {

    private Scanner scanner;

    public ProductionCostsCreator() {
        scanner = new Scanner(System.in);
    }

    public ProductionCosts createProductionCostsObject() {
        float materialCost = getMaterialCostFromInput();
        float energyCost = getEnergyCostFromInput();
        float developmentCosts = getDevelopmentCostsFromInput();
        float equipmentCosts = getEquipmentCostsFromInput();
        float salary = getSalaryFromInput();
        float businessExpenses = getBusinessExpensesFromInput();
        return new ProductionCosts(materialCost, energyCost, developmentCosts, equipmentCosts, salary, businessExpenses);
    }

    private float getMaterialCostFromInput() {
        float materialCost;
        System.out.print("Enter material cost: ");
        materialCost = scanner.nextFloat();
        return materialCost;
    }

    private float getEnergyCostFromInput() {
        float energyCost;
        System.out.print("Enter energy cost: ");
        energyCost = scanner.nextFloat();
        return energyCost;
    }

    private float getDevelopmentCostsFromInput() {
        float developmentCosts;
        System.out.print("Enter development costs: ");
        developmentCosts = scanner.nextFloat();
        return developmentCosts;
    }

    private float getEquipmentCostsFromInput() {
        float equipmentCosts;
        System.out.print("Enter equipment costs: " );
        equipmentCosts = scanner.nextFloat();
        return equipmentCosts;
    }

    private float getSalaryFromInput() {
        float salary;
        System.out.print("Enter salary: ");
        salary = scanner.nextFloat();
        return salary;
    }

    private float getBusinessExpensesFromInput() {
        float businessExpenses;
        System.out.print("Enter business expenses: ");
        businessExpenses = scanner.nextFloat();
        return businessExpenses;
    }
}
