package lambda.java;

import kotlin.jvm.functions.Function2;

/**
 * FunctionalInterface samo nagovestava kompajleru da interfejs ne sme imati vise od jednog metoda jer ce biti koriscen
 * kao pokazivac samo jednu lambda funkciju.
 */
@FunctionalInterface
interface Operable {
    int operate(int x, int y);
}

/**
 * Da se podsetimo - lambde u Javi su anonimne funkcije, tj., funkcije koje nemaju ime.
   Uglavnom se koriste na mestima gde su nam potrebne kratke funkcije koje nisu bas vezane za biznis logiku klase
   koja ih koristi. Posto nema smisla da im se dodeljuje ime i da se definisu kao funkcije klase, definisemo ih na mestu
   na kom ih koristimo i cuvamo reference na njih pomocu interfejsa.

   Potpis lambde je definisan na sledeci nacin:
    1. ulazni parametri moraju biti navedeni unutar () zagrada
    2. -> operator sledi nakon ulaznih parametara i oznacava da sledi telo funkcije
    3. telo funkcije:
        -
    Dakle:
    (ulazniParametar1, ulazniParametar2, ..., ulazniParametarN) -> {
        // telo funkcije
        // povratni tip ukoliko postoji
    }
 */
public class Main {

    public static void main(String[] args) {
        // ulazni i povratni tip lambde moraju odgovarati metodi interfejsa kojem je dodeljujemo

        // Ugradjen Javin interfejs koji ima 2 ulazna parametra
        Function2<Integer,Integer, Integer> multiplication = (x, y) -> x * y;

        // Rucno pravljeni interfejs koji radi istu stvar kao ugradjeni funkcionalni interfejs, samo malo semanticki lepse
        Operable subtraction = (x, y) -> x - y;

        System.out.println(multiplication.invoke(3, 2));
        System.out.println(subtraction.operate(3,2));
    }
}
