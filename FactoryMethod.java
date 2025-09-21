interface IFlavor {
    void MuffinFlavor();
}

class StrawberryFlavor implements IFlavor {
    public void MuffinFlavor() {
        System.out.println("Muffin with strawberry filling.");
    }
}

class ChocolateFlavor implements IFlavor {
    public void MuffinFlavor() {
        System.out.println("Muffin with chocolate filling");
    }
}

abstract class MuffinFactory {
    public abstract IFlavor createFlavor();

    public void bakeMuffin() {
        IFlavor flavor = createFlavor();
        flavor.MuffinFlavor();
    }
}

class StrawberryFlavorFactory extends MuffinFactory {
    public IFlavor createFlavor() {
        return new StrawberryFlavor();
    }
}

class ChocolateFlavorFactory extends MuffinFactory {
    public IFlavor createFlavor() {
        return new ChocolateFlavor();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {     
        MuffinFactory strawberryMuffin = new StrawberryFlavorFactory();
        strawberryMuffin.bakeMuffin();

        MuffinFactory chocolateMuffin = new ChocolateFlavorFactory();
        chocolateMuffin.bakeMuffin();
    }
}