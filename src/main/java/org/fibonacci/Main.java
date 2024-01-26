package org.fibonacci;
import java.lang.System;
import java.util.Scanner;
import org.fibonacci.Fibonacci;

public class Main {
    public static void main(String[] args) {

        // On affiche le message d'invite a entrer le nombre de termes
        System.out.println("Entrez le nombre de termes pour calculer la serie de Fibonacci:");
        Scanner scanneur = new Scanner(System.in);

        // On lit le nombre de termes
        int n = scanneur.nextInt();

        System.out.println("La serie est:");

        // On prend le temps present
        long debut = System.currentTimeMillis();

        // Calcul de chaque terme de Fibonacci dans une boucle
        for(int i = 1; i <= n; i++)
        {
            long valeurFibonacci = Fibonacci.Fibonacci(i);
            System.out.print(valeurFibonacci + ", ");
        }

        // On cherche le temps a la fin du calcul
        long fin = System.currentTimeMillis();
        // Le temps de calcul est la difference entre la fin et le debut
        long duree = fin - debut;

        System.out.println();
        // On affiche le temps de calcul
        System.out.println("Le temps de calcul de la serie est: " + Long.toString(duree) + " milliseconds");
    }
}