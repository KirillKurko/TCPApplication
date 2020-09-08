package productionCosts;

import java.util.Scanner;

public class ProductionCostsCreator {

    private Scanner scanner;

    public ProductionCostsCreator() {
        scanner = new Scanner(System.in);
    }

    public ProductionCosts createProductionCostsObject() {

    }

    private float getMaterialCostFromInput() {
        float materialCost = 0.0f;
        System.out.println("Enter material cost: ");
        materialCost = scanner.nextFloat();
        return materialCost;
    }

}
