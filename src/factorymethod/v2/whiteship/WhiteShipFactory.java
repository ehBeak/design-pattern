package factorymethod.v2.whiteship;

import factorymethod.v2.DefaultShipFactory;
import factorymethod.v2.Ship;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
