package org.fibonacci;

public class Fibonacci {

    static public long Fibonacci(int n)
    {
        // le deuxieme terme est egal a 1
        if(n == 2)
            return 1;
        else if(n == 1) // le premier terme est egal a 0
            return 0;
        else // sinon on retourne la somme des deux derniers termes
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
