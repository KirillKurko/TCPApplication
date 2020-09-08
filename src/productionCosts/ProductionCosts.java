package productionCosts;

public class ProductionCosts implements java.io.Serializable {

    private float materialCost;
    private float energyCost;
    private float developmentCosts;
    private float equipmentCosts;
    private float salary;
    private float businessExpenses;

    public ProductionCosts() {
        materialCost = 0.0f;
        energyCost = 0.0f;
        developmentCosts = 0.0f;
        equipmentCosts = 0.0f;
        salary = 0.0f;
        businessExpenses = 0.0f;
    }

    public ProductionCosts(float materialCost, float energyCost, float developmentCosts,
                            float equipmentCosts, float salary, float businessExpenses) {
        this.materialCost = materialCost;
        this.energyCost = energyCost;
        this.developmentCosts = developmentCosts;
        this.equipmentCosts = equipmentCosts;
        this.salary = salary;
        this.businessExpenses = businessExpenses;
    }

    public ProductionCosts(ProductionCosts productionCosts) {
        materialCost = productionCosts.materialCost;
        energyCost = productionCosts.energyCost;
        developmentCosts = productionCosts.developmentCosts;
        equipmentCosts = productionCosts.equipmentCosts;
        salary = productionCosts.salary;
        businessExpenses = productionCosts.businessExpenses;
    }

    public float getMaterialCost() {
        return materialCost;
    }

    public float getEnergyCost() {
        return energyCost;
    }

    public float getDevelopmentCosts() {
        return developmentCosts;
    }

    public float getEquipmentCosts() {
        return equipmentCosts;
    }

    public float getSalary() {
        return salary;
    }

    public float getBusinessExpenses() {
        return businessExpenses;
    }

    public void setMaterialCost(float materialCost) {
        this.materialCost = materialCost;
    }

    public void setEnergyCost(float energyCost) {
        this.energyCost = energyCost;
    }

    public void setDevelopmentCosts(float developmentCosts) {
        this.developmentCosts = developmentCosts;
    }

    public void setEquipmentCosts(float equipmentCosts) {
        this.equipmentCosts = equipmentCosts;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBusinessExpenses(float businessExpenses) {
        this.businessExpenses = businessExpenses;
    }
}
