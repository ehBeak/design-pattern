package factorymethod.v2.blackship;

import factorymethod.v2.DefaultShipFactory;
import factorymethod.v2.Ship;

public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
