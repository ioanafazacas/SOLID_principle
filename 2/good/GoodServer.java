package good;

public class GoodServer {
    public void reactToClient(Client_I client) {
        System.out.println("sunt "+client.getClass());
    }
}
