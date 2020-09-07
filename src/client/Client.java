package client;

import productionCosts.ProductionCosts;

import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private final String serverName = "localhost";
    private final int serverPort = 8080;
    private Socket socket = null;

    private ProductionCosts createProductionCostsObject() {
        float materialCost = 0.0f;
        float energyCost = 0.0f;
        float developmentCosts = 0.0f;
        float equipmentCosts = 0.0f;
        float salary = 0.0f;
        float businessExpenses = 0.0f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter material cost: ");
        materialCost = scanner.nextFloat();
        return new ProductionCosts(materialCost, energyCost, developmentCosts, equipmentCosts, salary, businessExpenses);
    }

    public Client() {
        try {
            socket = new Socket(serverName, serverPort);
            System.out.println("Connected to server " + socket.getRemoteSocketAddress());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            Object object = objectInputStream.readObject();
            System.out.println("Cost: " + object);

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
