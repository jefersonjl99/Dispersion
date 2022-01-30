package dispersion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jefer
 */
public class Dispersion {

    private int nPrimo;
    private int pos;
    private int[] cabezaListas, valores;
    private String[] letras;

    private int[][] matriz;
    private String[][] matrizSalida;
    ArrayList[] cabeza;

    public Dispersion(int nPrimo, int[] valores, String[] letras) {
        this.valores = valores;
        this.nPrimo = nPrimo;
        this.letras = letras;

        cabezaListas = new int[nPrimo];
        for (int i = 0; i < nPrimo; i++) {
            cabezaListas[i] = -1;
        }
    }
//Llena cabezaListas

    public void llenar() {
        for (int i = 0; i < valores.length; i++) {
            if (cabezaListas[valores[i] % nPrimo] == -1) {
                cabezaListas[valores[i] % nPrimo] = i + 1;
            }
        }
        System.out.println("salidaa cabezas:");
        for (int i = 0; i < cabezaListas.length; i++) {
            System.out.print(cabezaListas[i] + " ");
        }
        System.out.println("");
    }

    public void guardar() {
        cabeza = new ArrayList[cabezaListas.length];
        for (int i = 0; i < cabeza.length; i++) {
            cabeza[i] = new ArrayList();
        }
        for (int i = 0; i < valores.length; i++) {
            cabeza[valores[i] % nPrimo].add(valores[i]);
        }
    }

    public String[][] crearMatriz() {
        matrizSalida = new String[4][valores.length + 1];
        for (int i = 0; i < matrizSalida[0].length; i++) {
            matrizSalida[0][i] = (i + 1) + "";
            if (i + 1 > valores.length) {
                matrizSalida[1][i] = 0 + "";
                matrizSalida[2][i] = "";
            } else {
                matrizSalida[1][i] = valores[i] + "";
                matrizSalida[2][i] = letras[i];
            }
        }
        for (int i = 0; i < matriz[0].length; i++) {
            matrizSalida[3][i] = matriz[1][i] + "";
        }
        for (int i = 0; i < matrizSalida[0].length; i++) {
            if (matrizSalida[3][i] == null) {
                //matrizSalida[3][i] = (i + 2) + "";
            }
        }
        return matrizSalida;
    }

    public void llenarMatriz() {
        matriz = new int[2][valores.length + 1];
        for (int i = 0; i < valores.length + 1; i++) {
            matriz[1][i] = i + 2;
        }
        for (int i = 0; i < valores.length; i++) {
            matriz[0][i] = valores[i];
            for (int j = 0; j < cabeza[valores[i] % nPrimo].size(); j++) {
                if (valores[i] == (Integer) cabeza[valores[i] % nPrimo].get(j)) {
                    if (j + 1 >= cabeza[valores[i] % nPrimo].size()) {
                        matriz[1][i] = 0;
                    } else {
                        matriz[1][i] = buscar((Integer) cabeza[valores[i] % nPrimo].get(j + 1)) + 1;
                    }
                }
            }
        }
    }

    public int buscar(int valor) {
        int pos = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                pos = i;
            }
        }
        return pos;
    }

    int buscarC(int a, JTable tListaCabezas) {
        int pos = 0;
        String c = "";
        for (int j = 0; j < tListaCabezas.getRowCount(); j++) {
            for (int i = 0; i < hacerSplit(String.valueOf(tListaCabezas.getValueAt(j, 2))).length; i++) {
                c = hacerSplit(String.valueOf(tListaCabezas.getValueAt(j, 2)))[i];
                if (c.equals(String.valueOf(a))) {
                    pos = j;
                    break;
                }
            }
        }
        return pos;
    }

    public void borrar(int llave) {
        System.out.println("llave: " + llave);
        int posicion = 0;
        boolean encontro = false;
        for (int i = 0; i < matrizSalida[0].length; i++) {
            if (llave == Integer.parseInt(matrizSalida[1][i])) {
                System.out.println(matrizSalida[1][i]);
                posicion = i;
                encontro = true;
                System.out.println("Llave encontrada ");
                break;
            }
        }

        if (encontro) {
            int padre = Integer.parseInt(matrizSalida[3][posicion]);
            if (padre == 0) {
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (matrizSalida[1][i].equals("0")) {
                        matrizSalida[3][posicion] = matrizSalida[0][i];
                        break;
                    }
                }
                matrizSalida[1][posicion] = 0 + "";
                matrizSalida[2][posicion] = "";
            } else {
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (posicion + 1 == Integer.parseInt(matrizSalida[3][i])) {
                        matrizSalida[3][i] = String.valueOf(padre);
                    }
                }
                for (int i = 0; i < matrizSalida[0].length; i++) {
                    if (matrizSalida[1][i].equals("0")) {
                        matrizSalida[3][posicion] = matrizSalida[0][i];
                        break;
                    }
                }
                matrizSalida[1][posicion] = 0 + "";
                matrizSalida[2][posicion] = "";
            }
            pos = posicion;
            for (int i = 0; i < cabeza[llave % nPrimo].size(); i++) {
                if (cabeza[llave % nPrimo].get(i).equals(llave)) {
                    posicion = i;
                }
            }
            cabeza[llave % nPrimo].remove(posicion);
        } else {
            JOptionPane.showMessageDialog(null, "El elemento no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String[][] matrizCabeza() {
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabeza[i].isEmpty()) {
                cabezaListas[i] = -1;
            }
        }
        int red = 0;
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabezaListas[i] == -1) {
                red += 1;
            }
        }
        String[][] matrizCab = new String[cabezaListas.length - red][3];
        red = 0;
        for (int i = 0; i < cabezaListas.length; i++) {
            if (cabezaListas[i] != -1) {
                matrizCab[red][0] = i + ": ";
                matrizCab[red][1] = cabezaListas[i] + ": ";
                matrizCab[red][2] = "";
                for (int j = 0; j < cabeza[i].size(); j++) {
                    matrizCab[red][2] += cabeza[i].get(j) + " -> ";
                }
                matrizCab[red][2] = matrizCab[red][2].substring(0, matrizCab[red][2].length() - 4);
                red += 1;
            }
        }
        return matrizCab;
    }

    /**
     * @return the matrizSalida
     */
    public String[][] getMatriz() {
        return matrizSalida;
    }

    public int getPosicion() {
        return pos;
    }

    public void imprimirCabezas() {
        for (int i = 0; i < matrizCabeza().length; i++) {
            for (int j = 0; j < matrizCabeza()[0].length; j++) {
                System.out.println(matrizCabeza()[i][j]);
            }
        }
    }

    private String[] hacerSplit(String cadena) {
        String[] partes = cadena.split(" -> ");
        return partes;
    }
}
