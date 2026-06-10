import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        
       // runLinkList();
        //runQueue();
        //runStack();
        //Ejercicio 1 //
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String invertido = ejercicio1.invertString(texto);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertido);
        System.out.println("-----------------");
        //Ejercicio 2 //
        Ejercicio2 ejercicio2 = new Ejercicio2();
        String palabra1 = "radar";
        String palabra2 = "computacion";

        System.out.println(ejercicio2.esPalindromo(palabra1));
        System.out.println(ejercicio2.esPalindromo(palabra2));
    }

    private static void runStack() {
        //Stack<String> pila = new Stack();
        ArrayDeque<String> pila = new ArrayDeque<>();
        pila.push("Jose");
        pila.push("Andres");
        pila.push("Ana");
        pila.push("Maria");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());

        System.out.println(pila.peek());
        System.out.println(pila.size());

        System.out.println(pila.pop());
        System.out.println(pila.size());

        while(!pila.isEmpty()){
            String cliente = pila.pop();
            System.out.println("Atendi a: " + cliente); 

            System.out.println(pila.size());
        }

    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek());
        System.out.println(cola.size());
        System.out.println(cola.poll());
        System.out.println(cola.poll());
        System.out.println(cola.size());


        while(!cola.isEmpty()){
            String cliente = cola.poll();
            System.out.println("Atendi a: " + cliente); 
        }
    
       
    }

    private static void runLinkList() {
        LinkedList<String> nombres  = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        String primero = nombres.getFirst();
        System.out.println(primero);
        System.out.println(nombres.getFirst());

        System.out.println(nombres.get(4));


        System.out.println(nombres.getLast());


    }
}
