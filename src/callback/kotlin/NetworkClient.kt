package callback.kotlin

class NetworkClient <T> (val simulatedResult: T) {

    fun fetchData(callback: (T) -> Unit) {
        Thread {
            Thread.sleep(1000)
            callback(simulatedResult)
        }.start()
    }
}