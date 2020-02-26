package callback.kotlin

fun main() {
    val networkClient: NetworkClient<String> = NetworkClient("the result")

    println("Calling fetchData() with networkClient..")
    networkClient.fetchData { result -> println("Result fetched: $result") }
    println("Proceeding with the program flow..")
}