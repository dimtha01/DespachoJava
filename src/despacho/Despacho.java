package despacho;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Despacho {
    public static int numFilas() throws IOException{
        int fila = 0;
        Scanner leerDespacho = new Scanner(new File("Despacho.txt"));
        while (leerDespacho.hasNextLine()) {
            leerDespacho.nextLine();
            fila++;      
        }
        leerDespacho.close();
        return fila;
    }
    public static int numCol() throws IOException{
        int fila = numFilas();
        int col = 0;
        Scanner leerDespacho = new Scanner(new File("Despacho.txt"));
        while (leerDespacho.hasNext()) {
            leerDespacho.next();
            while (leerDespacho.hasNextDouble()) {
                leerDespacho.nextDouble();
                col++;
            } 
        }
        leerDespacho.close();
        col = col / fila;
        
        return col;
    }
public static void rellenarArray(String[] clientes,double[][] valores) throws IOException{

    Scanner leerDespacho = new Scanner(new File("Despacho.txt"));
    for (int i = 0; i < clientes.length; i++) {
        clientes[i] = leerDespacho.next();
        for (int j = 0; j < valores[0].length; j++) {
            valores[i][j] = leerDespacho.nextDouble();
        }
    }
    leerDespacho.close();
}


}
