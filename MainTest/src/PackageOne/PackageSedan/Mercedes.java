package PackageOne.PackageSedan;

public class Mercedes extends Sedan {
    @Override
    public void gas() {
        System.out.println("Mercedes газует");
    }

    @Override
    public void brake() {
        System.out.println("Mercedes тормозит");
    }

    @Override
    public void wd4() {
        System.out.println("У Mercedes сил 4wd ");
    }

    @Override
    public void engine() {
        System.out.println("У Mercedes обьем 3.5 ");
    }


}
