package callback.java;

public class NetworkClient<T> {

    private T simulatedResult;

    public NetworkClient(T simulatedResult) {
        this.simulatedResult = simulatedResult;
    }

    /**
     * Simulira dohvatanje podatka sa mreze tako sto pokrece novi thread, spava kako bi simulirao kasnjenje odziva,
     * a zatim poziva funkciju interfejsa koji je prosledjen.
     *
     * @param callback interfejs cija se funkcija poziva kada je podatak dohvacen
     */
    public void fetchData(NetworkRequestFinishedCallback callback) {
        new Thread(() -> {
            try {
                Thread.sleep(1000);
                callback.onNetworkRequestCompleted(simulatedResult);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
