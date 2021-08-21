/* Your task is to remove all duplicate words from a string, leaving only single (first) words entries.
 Example:
   Input:
       'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'
   Output:
       'alpha beta gamma delta'
 This algoritm must run in time n*/

import java.util.*;

public class UniqueWords {
    
    public static String[] removeDuplicateWords(String[] input){

        HashSet<String> set = new HashSet<>(); // HashSet para guardar palabras únicas.

        for(String  word : input){ // Visitamos cada  elemento del array 1 vez O(n) donde n es el largo del array.

            if(!set.contains(word)){ // Busca en el HashSet O(1).

                set.add(word); // Agregar al HashSet O(1).
            
            }

        }

        String[] clean = new String[set.size()]; // Creamos el array que vamos a regresar del mismo tamaño que nuestro HashSet.

        set.toArray(clean); // Convertir el HashSet a Array de Strings es O(a) donde a es el tamaño del HashSet.

        return clean;

    }

    // Time Complexity: O(n) donde n es el largo del array de entrada.

    // Public class para probar:
    public static void main(String args[]){

        String[] input = new  String[]{"alpha", "beta", "beta", "gamma", "gamma", "gamma", "delta", "alpha", "beta", "beta", "gamma", "gamma", "gamma", "delta"};

        String[] output = removeDuplicateWords(input);

        System.out.println(Arrays.toString(output));

    }

}
