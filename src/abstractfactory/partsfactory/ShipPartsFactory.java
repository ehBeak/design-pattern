package abstractfactory.partsfactory;

import abstractfactory.parts.Anchor;
import abstractfactory.parts.Wheel;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
