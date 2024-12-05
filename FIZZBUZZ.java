public class FIZZBUZZ { // Declara una clase pública llamada FIZZBUZZ. Es la entrada principal de nuestro programa.
    public FIZZBUZZ() {  // Constructor de la clase FIZZBUZZ. Aunque no se usa en este programa, se define de forma explícita.
    }

    public static void main(String[] var0) { // Método principal donde comienza la ejecución del programa.
       for(int var1 = 1; var1 <= 100; ++var1) { // Bucle `for` que recorre los números del 1 al 100.
          // La variable `var1` comienza en 1, se incrementa en 1 por cada iteración y termina cuando es mayor que 100.

          if (var1 % 3 == 0 && var1 % 5 == 0) { // Comprueba si `var1` es divisible entre 3 Y entre 5 al mismo tiempo.
             System.out.println("FIZBUZZ"); // Si la condición es verdadera, imprime "FIZBUZZ".
          } else if (var1 % 3 == 0) { // Si no es divisible entre ambos, verifica si es divisible solo entre 3.
             System.out.println("FIZZ"); // Si es divisible entre 3, imprime "FIZZ".
          } else if (var1 % 5 == 0) { // Si no es divisible entre 3, verifica si es divisible solo entre 5.
             System.out.println("BUZZ"); // Si es divisible entre 5, imprime "BUZZ".
          } else { // Si ninguna de las condiciones anteriores se cumple:
             System.out.println(var1); // Imprime el número actual (`var1`).
        }
       } // Cierra el bucle `for`. Se repite hasta que `var1` llega a 100.

    } // Cierra el método `main`.
 } // Cierra la clase FIZZBUZZ.