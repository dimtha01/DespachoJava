package despacho;
public class Principal {
    public static void main(String[] args) throws Exception {
        int fila = Despacho.numFilas();
        int col = Despacho.numCol();
        String[] clientes = new String[fila];
        double[][] valores = new double[fila][col];
        Despacho.rellenarArray(clientes, valores);
        System.out.println("Filas = " + fila);
        System.out.println("Colunas = " + col);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Clientes :" + clientes[i]);
        }
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                System.out.print(valores[i][j] + " ");
                
            }
            System.out.println();

        }
    }
}
