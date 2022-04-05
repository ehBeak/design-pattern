package abstractfactory;


import abstractfactory.factory.WhiteShipFactory;
import abstractfactory.partsfactory.WhiteShipPartsFactory;
import abstractfactory.product.Ship;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory(new WhiteShipPartsFactory())
                .orderShip("whiteShip", "keesun@mail.com");

        System.out.println("whiteShip.getAnchor().getClass() = " + whiteShip.getAnchor().getClass());
        System.out.println("whiteShip.getWheel().getClass() = " + whiteShip.getWheel().getClass());

    }
}
