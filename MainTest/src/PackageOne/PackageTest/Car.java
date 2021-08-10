package PackageOne.PackageTest;

public abstract class Car {

    private String model;
    private String color;

    public abstract void gas();

    public abstract void brake();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
