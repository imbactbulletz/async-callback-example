package callback.java;

public class Main {
    public static void main(String[] args) {
        NetworkClient<String> networkClient = new NetworkClient<>("the result!");

        System.out.println("Calling fetchData() with networkClient..");
        networkClient.fetchData(
                // anonimna funkcija koja se poziva kada se podaci dohvate
                // ulazni/izlazni parametar ove funkcije mora da odgovara metodi interfejsa
                // koji se ocekuje (NetworkRequestFinishedCallback)
                (result) -> {
                    System.out.println("Result fetched: " + result);
                }
        );

        System.out.println("Proceeding with the program flow..");
    }
}
