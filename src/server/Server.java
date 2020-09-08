package server;

import productionCosts.ProductionCosts;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port = 8080;
    private Socket socket = null;
    private ServerSocket serverSocket = null;

    public Server() {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + serverSocket.getLocalPort());

            socket = serverSocket.accept();
            System.out.println("Client " + socket.getRemoteSocketAddress() + " connected to server");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            Object object = objectInputStream.readObject();
            ProductionCosts productionCosts = (ProductionCosts) object;
            float cost = calculateProductionCost(productionCosts);
            objectOutputStream.writeFloat(cost);

            objectInputStream.close();
            objectInputStream.close();;
            socket.close();

        }
        catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    private float calculateProductionCost(ProductionCosts productionCosts) {
        return productionCosts.getMaterialCost() + productionCosts.getEnergyCost() +
                productionCosts.getDevelopmentCosts() + productionCosts.getEquipmentCosts() +
                productionCosts.getSalary() + productionCosts.getBusinessExpenses();
    }

    public static void main(String[] args) {
        Server server = new Server();
    }
}
