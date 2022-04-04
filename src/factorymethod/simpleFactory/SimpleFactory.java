package factorymethod.simpleFactory;

import factorymethod.v1.blackship.BlackShip;
import factorymethod.v1.whiteship.WhiteShip;

public class SimpleFactory {// ex) Calendar

    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip();
        } else if (name.equals("blackShip")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
