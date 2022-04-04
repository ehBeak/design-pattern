package factorymethod.v2;

import factorymethod.v2.blackship.BlackShipFactory;
import factorymethod.v2.whiteship.WhiteShip;
import factorymethod.v2.whiteship.WhiteShipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "keesun@mail.com");
        client.print(new BlackShipFactory(), "blackShip", "keesun@mail.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        shipFactory.orderShip(name, email);
    }
}
