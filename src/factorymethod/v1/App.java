package factorymethod.v1;

import factorymethod.v1.blackship.BlackShipFactory;
import factorymethod.v1.whiteship.WhiteShipFactory;

public class App {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("whiteShip", "keesun@mail.com");
        Ship blackShip = new BlackShipFactory().orderShip("blackShip", "keesun@mail.com");
    }
}
