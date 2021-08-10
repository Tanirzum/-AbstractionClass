package PackageOne.PackageTest;

import PackageOne.PackageJeep.*;
import PackageOne.PackageSedan.*;
import PackageOne.PackageTruck.*;

public class Test {
    public static void main(String[] args) {

        Jeep jeep = new Hummer();
        Sedan sedan = new Mercedes();
        Truck truck = new Volvo();

        jeep.driveHummer();
        jeep.lengthHummer();

        System.out.println();

        sedan.engine();
        sedan.wd4();

        System.out.println();

        truck.placeTruck();
        truck.mechanicTruck();

    }
}
