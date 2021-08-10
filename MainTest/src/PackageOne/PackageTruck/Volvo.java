package PackageOne.PackageTruck;

public class Volvo extends Truck {

    @Override
    public void gas() {
        System.out.println("Volvo газует");
    }

    @Override
    public void brake() {
        System.out.println("Volvo тормозит");

    }

    @Override
    public void placeTruck() {
        System.out.println("У Volvo  толкьо пассажирское перевозки");

    }

    @Override
    public void mechanicTruck() {
        System.out.println("У Volvo  механическая коробка передач");

    }
}
