

public class Burger {
    String bun;
    String cheese;
    String greens;
}

class ClassicBurger extends Burger {
    String mayonnaise;
    String meat;

    void Clburger() {
        System.out.println("ClassicBurger: " + "bun " + "cheese " + "greens " + "mayonnaise " + "meat");
    }
}

class DietBurger extends Burger {
    String meat;

    void Dtburger() {
        System.out.println("DietBurger: " + "bun " + "cheese " + "greens " + "meat");
    }
}

class DoubleMeatBurger extends Burger {
    String mayonnaise;
    String doubleMeat;

    void DMBurger() {
        System.out.println("DoubleMeatBurger: " + "bun " + "cheese " + "greens " + "mayonnaise " + "doubleMeat");
    }
}

class BurgerMain {
    public static void main(String[] args) {
        ClassicBurger classicBurger = new ClassicBurger();
        classicBurger.Clburger();
        DietBurger dietBurger = new DietBurger();
        dietBurger.Dtburger();
        DoubleMeatBurger doubleMeatBurger = new DoubleMeatBurger();
        doubleMeatBurger.DMBurger();

    }
}


