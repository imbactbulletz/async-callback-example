package lambda.kotlin

fun main() {
    // funkcije mozemo definisati kao promenljive
    val multiplication: (Int, Int) -> Int = { x,y -> x * y }
    val subtraction: (Int, Int) -> Int = { x,y -> x - y }

    // funkciju mozemo pozvati kao function() ili function.invoke() sa parametrima
    println(multiplication(3,2))
    println(subtraction(3,2))
}