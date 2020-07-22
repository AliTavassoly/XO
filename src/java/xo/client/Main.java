package xo.client;

import xo.data.DataBase;
import xo.model.XOClient;

public class Main {
    static String serverIP = "localhost";
    static int serverPort = 8000;

    public static XOClient client;

    public static void main(String[] args) {
        try {
            DataBase.load();
        } catch (Exception e){
            e.printStackTrace();
        }
        client = XOClient.makeNewInstance(serverIP, serverPort);
        //client.start();
        client.start();
    }
}
