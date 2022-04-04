package factorymethod.v1.whiteship;

import factorymethod.v1.Ship;
import factorymethod.v1.ShipFactory;
import factorymethod.v1.whiteship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
