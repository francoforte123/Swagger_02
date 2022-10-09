package Swagger02.Entities;

public class ArithmeticOperation {

    private final String name;
    private final int minNumberOfOperands;
    private final String description;
    String[] properties;

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }



    public String getName() {
        return name;
    }

    public int getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }
}
