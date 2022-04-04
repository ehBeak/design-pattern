package factorymethod.v1.blackship;

import factorymethod.v1.Ship;
import factorymethod.v1.ShipFactory;
import factorymethod.v1.blackship.BlackShip;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
