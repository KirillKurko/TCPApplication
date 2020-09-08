package client;

import productionCosts.ProductionCosts;
import productionCosts.ProductionCostsCreator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    private final String serverName = "localhost";
    private final int serverPort = 8080;
    private Socket socket = null;
    private ProductionCostsCreator productionCostsCreator;

    public Client() {
        try {
            socket = new Socket(serverName, serverPort);
            System.out.println("Connected to server " + socket.getRemoteSocketAddress());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            productionCostsCreator = new ProductionCostsCreator();

            ProductionCosts productionCosts = productionCostsCreator.createProductionCostsObject();
            objectOutputStream.writeObject(productionCosts);
            objectOutputStream.flush();

            float cost = objectInputStream.readFloat();
            System.out.println("Cost: " + cost);

            objectInputStream.close();
            objectOutputStream.close();
            socket.close();
        }
        catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client();
    }
}
