package PackageOne.PackageJeep;

public class Hummer extends Jeep {

    @Override
    public void gas() {
        System.out.println("Hummer газует ");
    }

    @Override
    public void brake() {
        System.out.println("Hummer тормозит ");

    }

    @Override
    public void driveHummer() {
        System.out.println("Hummer едет вперед ");

    }

    @Override
    public void lengthHummer() {
        System.out.println("Длина Hummer-а 5.85м");
    }


}
