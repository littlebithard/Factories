interface Shirt {
    void Sew();
}

interface Pants {
    void Sew();
}

class sewDressShirt implements Shirt {
    public void Sew() {
        System.out.println("The Dress-shirt was sewn");
    }
}

class sewDressPants implements Pants {
    public void Sew() {
        System.out.println("The Pants was sewn");
    }
}

class sewTShirt implements Shirt {
    public void Sew() {
        System.out.println("The T-shirt was sewn");
    }
}

class sewJeans implements Pants {
    public void Sew() {
        System.out.println("The Jeans was sewn");
    }
}

interface SewingFactory {
    Shirt createShirt();
    Pants createPants();
}

class DressSewingFactory implements SewingFactory {
    public Shirt createShirt() {
        return new sewDressShirt();
    }

    public Pants createPants() {
        return new sewDressPants();
    }
}

class BasicSewingFactory implements SewingFactory {
    public Shirt createShirt() {
        return new sewTShirt();
    }

    public Pants createPants() {
        return new sewJeans();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        DressSewingFactory dresses = new DressSewingFactory();
        Shirt dressShirt = dresses.createShirt();
        Pants dressPants = dresses.createPants();

        dressShirt.Sew();
        dressPants.Sew();

        System.out.println();

        BasicSewingFactory basics = new BasicSewingFactory();
        Shirt basicShirt = basics.createShirt();
        Pants basicPants = basics.createPants();

        basicShirt.Sew();
        basicPants.Sew();
    }
    
}
