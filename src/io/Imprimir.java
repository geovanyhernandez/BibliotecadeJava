import java.io.PrintWriter;

public class Imprimir {

public static void main(String arg[]){

 PrintWriter pw = new PrintWriter(System.out, true);

 pw.println("Imprime una cadena de texto");

 int i = 15;

 pw.println("Imprime un entero " + i);

 double d = 6.0;

 pw.println("Imprime un double " + d);

 }

}

