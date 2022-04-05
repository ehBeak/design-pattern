package abstractfactory.factory;

import abstractfactory.product.Ship;
import abstractfactory.product.WhiteShip;
import abstractfactory.partsfactory.ShipPartsFactory;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }


    @Override
    public Ship createShip() {
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.setAnchor(shipPartsFactory.createAnchor());
        whiteShip.setWheel(shipPartsFactory.createWheel());
        return whiteShip;
    }
}
