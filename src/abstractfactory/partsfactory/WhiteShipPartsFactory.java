package abstractfactory.partsfactory;

import abstractfactory.product.WhiteShip;
import abstractfactory.parts.Anchor;
import abstractfactory.parts.Wheel;
import abstractfactory.parts.WhiteAnchor;
import abstractfactory.parts.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {


    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        new WhiteShip();
        return new WhiteWheel();
    }
}
