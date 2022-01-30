/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jefer
 */
public class Ventana extends javax.swing.JFrame {

    //Declaracion de variables globales
    String[][] matrizDatos;
    int[] llaves;
    String[] letras;
    int encSep;
    Dispersion d;

    public Ventana() {
        this.setTitle("Dispersion");
        this.setResizable(false);
        initComponents();
        lLlaves.setVisible(false);
        lNombres.setVisible(false);
        bRetirar.setVisible(false);
        lCabezasListas.setVisible(false);
        lCursor.setVisible(false);
        lDisponible.setVisible(false);
        bMostrarTablas.setVisible(false);
        bBuscar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lCursor = new javax.swing.JLabel();
        lInfo = new javax.swing.JLabel();
        bAleatorio = new javax.swing.JButton();
        tLlaves = new javax.swing.JTextField();
        lInfo2 = new javax.swing.JLabel();
        tPrimo = new javax.swing.JTextField();
        lLlaves = new javax.swing.JLabel();
        lNombres = new javax.swing.JLabel();
        lLlavesM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tLlavesM = new javax.swing.JTextField();
        tNombresM = new javax.swing.JTextField();
        bRetirar = new javax.swing.JButton();
        bDispersar = new javax.swing.JButton();
        lEncSep = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tListaCabezas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatos = new javax.swing.JTable();
        lCabezasListas = new javax.swing.JLabel();
        lDisponible = new javax.swing.JLabel();
        bBuscar = new javax.swing.JButton();
        bMostrarTablas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCursor.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCursor.setForeground(new java.awt.Color(51, 51, 51));
        lCursor.setText("Grafica Cursor");
        getContentPane().add(lCursor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        lInfo.setText("numero de llaves a dispersar aleatoriamente:");
        getContentPane().add(lInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, -1, -1));

        bAleatorio.setText("Generar aleatoriamente");
        bAleatorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bAleatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAleatorioActionPerformed(evt);
            }
        });
        getContentPane().add(bAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 180, -1));

        tLlaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLlavesActionPerformed(evt);
            }
        });
        getContentPane().add(tLlaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 58, -1));

        lInfo2.setText("Numero Primo");
        getContentPane().add(lInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        tPrimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tPrimoFocusGained(evt);
            }
        });
        tPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrimoActionPerformed(evt);
            }
        });
        tPrimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPrimoKeyTyped(evt);
            }
        });
        getContentPane().add(tPrimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 58, -1));

        lLlaves.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lLlaves.setText("llaves: ");
        getContentPane().add(lLlaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 594, -1));

        lNombres.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lNombres.setText("nombres: ");
        getContentPane().add(lNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 612, -1));

        lLlavesM.setText("llaves:");
        getContentPane().add(lLlavesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setText("nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(tLlavesM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 447, -1));
        getContentPane().add(tNombresM, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 447, -1));

        bRetirar.setText("Retirar");
        bRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(bRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 141, -1));

        bDispersar.setText("Dispersar");
        bDispersar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDispersar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDispersarActionPerformed(evt);
            }
        });
        getContentPane().add(bDispersar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 140, -1));

        lEncSep.setText(" ");
        getContentPane().add(lEncSep, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, -1));

        tDatos.setVisible(false);
        tDatos.setVisible(false);
        jScrollPane2.setViewportView(tListaCabezas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 500, 190));

        tDatos.setVisible(false);
        tDatos.setVisible(false);
        jScrollPane1.setViewportView(tDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 700, 190));

        lCabezasListas.setFont(new java.awt.Font("TI-Nspire Sans", 1, 24)); // NOI18N
        lCabezasListas.setForeground(new java.awt.Color(51, 51, 51));
        lCabezasListas.setText("Cabezas de lista");
        getContentPane().add(lCabezasListas, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, -1));

        lDisponible.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lDisponible.setForeground(new java.awt.Color(255, 0, 0));
        lDisponible.setText("Proximo disponible: ");
        lDisponible.setVisible(false);
        getContentPane().add(lDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1005, 427, 233, -1));

        bBuscar.setText("Buscar");
        bBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(bBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 141, -1));

        bMostrarTablas.setText("Mostrar tabla");
        bMostrarTablas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bMostrarTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarTablasActionPerformed(evt);
            }
        });
        getContentPane().add(bMostrarTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 141, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAleatorioActionPerformed
        String encSep = tPrimo.getText();
        String llaves = tLlaves.getText();
        if ((llaves.equals(null) || llaves.equals("")) && (encSep.equals(null) || encSep.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete los campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (encSep.equals(null) || encSep.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (llaves.equals(null) || llaves.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de numero de llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(llaves) && !esNumerico(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico entero en los dos campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(llaves)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esPrimo(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "El numero ingresado no es primo (en el campo Enc Sep)", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else {
            this.encSep = Integer.parseInt(encSep);
            generarAleatoriamente(Integer.parseInt(llaves));
            setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
            lLlaves.setVisible(true);
            setValores(letras, "nombres", lNombres, this.tNombresM);
            lNombres.setVisible(true);
            lEncSep.setText(encSep);
            dispersion(this.encSep, this.llaves, this.letras);
        }
    }//GEN-LAST:event_bAleatorioActionPerformed

    private void bRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetirarActionPerformed
        String llave = tLlavesM.getText();
        System.out.println(llave);
        if (llaves.equals(null) || llaves.equals("") || !esNumerico(llave)) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llave, es el unico que se tiene en cuenta", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else {
            retirar(Integer.parseInt(llave));
            tLlavesM.setText("");
        }
    }//GEN-LAST:event_bRetirarActionPerformed

    private void bDispersarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDispersarActionPerformed
        String llaves = tLlavesM.getText();
        String nombres = tNombresM.getText();
        String encSep = tPrimo.getText();
        if ((llaves.equals(null) || llaves.equals("")) && (nombres.equals(null) || nombres.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete los campos", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
            tNombresM.setText("");
            tNombresM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (llaves.equals(null) || llaves.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
            tNombresM.setText("");
            tNombresM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (nombres.equals(null) || nombres.equals("")) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de nombres", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
            tLlavesM.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if ((encSep.equals(null) || encSep.equals(""))) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tPrimo.setText("");
            tPrimo.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esNumerico(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un valor numerico en el campo de encadenamiento separado", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else if (!esPrimo(encSep)) {
            JOptionPane.showMessageDialog(getContentPane(), "El numero ingresado no es primo (en el campo Enc Sep)", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlaves.setText("");
            tLlaves.requestFocus();
            lLlaves.setVisible(false);
            lNombres.setVisible(false);
        } else {
            if (registrarValores(llaves, nombres)==2) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese llaves numericas", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else if (registrarValores(llaves, nombres)==2) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese llaves numericas", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else if (this.llaves.length != this.letras.length) {
                JOptionPane.showMessageDialog(getContentPane(), "Ingrese la misma cantidad de llaves que de nombres de las llaves", "Atencion", JOptionPane.ERROR_MESSAGE);
                tLlavesM.setText("");
                tNombresM.setText("");
                tLlavesM.requestFocus();
                lLlaves.setVisible(false);
                lNombres.setVisible(false);
            } else {
                setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
                lLlaves.setVisible(true);
                setValores(letras, "nombres", lNombres, this.tNombresM);
                lNombres.setVisible(true);
                this.encSep = Integer.parseInt(encSep);
                lEncSep.setText(encSep);
                //Metodo de dispersion
                dispersion(this.encSep, this.llaves, this.letras);
            }

        }
    }//GEN-LAST:event_bDispersarActionPerformed

    private void tPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrimoActionPerformed

    }//GEN-LAST:event_tPrimoActionPerformed

    private void tPrimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPrimoKeyTyped

    }//GEN-LAST:event_tPrimoKeyTyped

    private void tPrimoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPrimoFocusGained

    }//GEN-LAST:event_tPrimoFocusGained

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        String llave = tLlavesM.getText();
        System.out.println(llave);
        if (llaves.equals(null) || llaves.equals("") || !esNumerico(llave)) {
            JOptionPane.showMessageDialog(getContentPane(), "Complete el campo de llave, es el unico que se tiene en cuenta", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else if (!buscarDato(Integer.parseInt(llave))) {
            JOptionPane.showMessageDialog(getContentPane(), "El dato no se encuentra", "Atencion", JOptionPane.ERROR_MESSAGE);
            tLlavesM.setText("");
        } else {
            buscar(Integer.parseInt(llave));
            tLlavesM.setText("");
            bMostrarTablas.setVisible(true);
            bBuscar.setVisible(false);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bMostrarTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarTablasActionPerformed
        mostrarTablas();
        bMostrarTablas.setVisible(false);
    }//GEN-LAST:event_bMostrarTablasActionPerformed

    private void tLlavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLlavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLlavesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAleatorio;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bDispersar;
    private javax.swing.JButton bMostrarTablas;
    private javax.swing.JButton bRetirar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lCabezasListas;
    private javax.swing.JLabel lCursor;
    private javax.swing.JLabel lDisponible;
    private javax.swing.JLabel lEncSep;
    private javax.swing.JLabel lInfo;
    private javax.swing.JLabel lInfo2;
    private javax.swing.JLabel lLlaves;
    private javax.swing.JLabel lLlavesM;
    private javax.swing.JLabel lNombres;
    private javax.swing.JTable tDatos;
    private javax.swing.JTable tListaCabezas;
    private javax.swing.JTextField tLlaves;
    private javax.swing.JTextField tLlavesM;
    private javax.swing.JTextField tNombresM;
    private javax.swing.JTextField tPrimo;
    // End of variables declaration//GEN-END:variables

    private boolean esNumerico(String llaves) {
        try {
            Integer.parseInt(llaves);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean esPrimo(String llaves) {
        // El 0, 1 y 4 no son primos
        if (Integer.parseInt(llaves) == 0 || Integer.parseInt(llaves) == 1 || Integer.parseInt(llaves) == 4) {
            return false;
        }
        for (int x = 2; x < Integer.parseInt(llaves) / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (Integer.parseInt(llaves) % x == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    private void generarAleatoriamente(int cantidad) {
        Random r = new Random();
        letras = new String[cantidad];
        llaves = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            llaves[i] = (int) (Math.random() * 200);
            String letras2 = "";
            for (int j = 0; j < 2; j++) {
                char c = (char) (r.nextInt(26) + 'a');
                letras2 += String.valueOf(c);
            }
            letras[i] = letras2;
        }

        ArrayList<Integer> datos = new ArrayList();
        for (int i = 0; i < llaves.length; i++) {
            datos.add(llaves[i]);
        }
        ArrayList<Integer> sinRep = generos(datos);

        llaves = new int[sinRep.size()];
        for (int i = 0; i < llaves.length; i++) {
            llaves[i] = sinRep.get(i);
        }
        if (llaves.length != cantidad) {
            generarAleatoriamente(cantidad);
        }
    }

    public static ArrayList<Integer> generos(ArrayList<Integer> generos) {
        ArrayList<Integer> sinrep = new ArrayList<>();
        for (int i = 0; i < generos.size(); i++) {
            if (!sinrep.contains(generos.get(i))) {
                sinrep.add(generos.get(i));
            } else {
                System.out.println("Repetida la " + generos.get(i));
            }
        }
        return sinrep;
    }

    private void setValores(String[] matriz, String valor, JLabel label, JTextField textField) {
        String cadena = "";
        String cadena2 = "";
        System.out.println(valor);
        cadena += valor + ": ";
        for (int i = 0; i < matriz.length; i++) {
            if (i == matriz.length - 1) {
                cadena2 += matriz[i];
                cadena += matriz[i];
            } else {
                cadena2 += matriz[i] + ",";
                cadena += matriz[i] + ",";
            }
        }
        label.setText(cadena);
        textField.setText(cadena2);
    }

    private String[] hacerString(int[] entrada) {
        String[] matriz = new String[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            matriz[i] = String.valueOf(entrada[i]);
        }
        return matriz;
    }

    private int registrarValores(String llaves, String nombres) {
        String[] partes1 = llaves.split(",");
        this.letras = new String[partes1.length];
        this.letras = nombres.split(",");
        this.llaves = new int[partes1.length];
        int[] llavesTemp = new int[partes1.length];
        for (int i = 0; i < partes1.length; i++) {
            llavesTemp = this.llaves;
            int linea =Integer.parseInt(partes1[i]);
            if (contains(llavesTemp, linea)) {
                return 1;
            } else if (esNumerico(partes1[i])) {
                this.llaves[i] = Integer.parseInt(partes1[i]);
            } else {
                return 2;
            }
        }

        return 0;
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    private void dispersion(int nPrimo, int[] valores, String[] letras) {
        d = new Dispersion(nPrimo, valores, letras);
        d.llenar();
        d.guardar();
        d.llenarMatriz();
        matrizDatos = d.crearMatriz();
        for (int i = 0; i < matrizDatos.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print(matrizDatos[i][j] + " ");
            }
        }

        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas, "c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        bRetirar.setVisible(true);
//        bBuscar.setVisible(true);
        proximoDisponible(llaves.length + 1);
    }

    //Creacion de la tabla
    private void crearModelo(String[][] matriz, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(matriz.length);
        modelo.setColumnCount(matriz[0].length);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tabla.setModel(modelo);
            }
        }
        tabla.setDefaultEditor(Object.class, null);
    }

    private void mostrarHeader(String[][] matriz, JTable tabla, String value) {
        if (value.equals("c")) {
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            String [] valor = new String[]{"Modulo","Cabeza","Lista"};
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(valor[i]);
            }
            tabla.repaint();
        } else if(value.equals("a")){
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(matriz[i][0]);
            }
            tabla.repaint();
        }else{
            JTableHeader head = tabla.getTableHeader();
            TableColumnModel cModelo = head.getColumnModel();
            TableColumn columna = null;
            for (int i = 0; i < matriz[0].length; i++) {
                columna = cModelo.getColumn(i);
                columna.setHeaderValue(i + 1 + "");
            }
            tabla.repaint();
        }

    }
    
    private void ponerVectDatos(String [][] matrizd, JTable tabla){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < matrizd.length; i++) {
            for (int j = 0; j < matrizd[0].length; j++) {
                tabla.setValueAt(matrizd[i][j], i, j);
            }
        }
        centrarDatos(tabla);
        tabla.setDefaultRenderer(String.class, centerRenderer);
        DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
        dtm.removeRow(0);
    }

    //Completar tabla matriz
    private void ponerDatos(String[][] matriz, JTable tabla) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                tabla.setValueAt(matriz[i][j], i, j);
            }
        }
        centrarDatos(tabla);
        tabla.setDefaultRenderer(String.class, centerRenderer);
    }

    private void retirar(int llave) {
        d.borrar(llave);
        matrizDatos = d.getMatriz();
        for (int i = 0; i < matrizDatos.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizDatos[i].length; j++) {
                System.out.print(matrizDatos[i][j] + " ");
            }
        }
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas, "c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        bRetirar.setVisible(true);
        borrarDatos(llaves, letras, llave);
        proximoDisponible(d.getPosicion() + 1);
    }

    private boolean buscarDato(int llave) {
        for (int i = 0; i < this.llaves.length; i++) {
            if (llave == llaves[i]) {
                return true;
            }
        }
        return false;
    }

    private void borrarDatos(int[] llaves, String[] letras, int llave) {
        ArrayList<Integer> ll = new ArrayList<Integer>();
        ArrayList<String> le = new ArrayList<String>();
        for (int i = 0; i < llaves.length; i++) {
            if (llave != llaves[i]) {
                ll.add(llaves[i]);
                le.add(letras[i]);
            }
        }
        this.letras = new String[le.size()];
        this.llaves = new int[ll.size()];
        for (int i = 0; i < this.llaves.length; i++) {
            this.llaves[i] = ll.get(i);
            this.letras[i] = le.get(i);
        }
        setValores(hacerString(this.llaves), "llaves", lLlaves, tLlavesM);
        setValores(this.letras, "nombres", lNombres, tNombresM);
        tLlavesM.setText("");
        tNombresM.setText("");
        lLlaves.setVisible(true);
        lNombres.setVisible(true);
    }

    private String[][] reDefinirMatriz(String[][] matrizDatos) {
        String[][] matriz = new String[matrizDatos.length - 1][matrizDatos[0].length - 1];
        for (int i = 0; i < matrizDatos.length - 1; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = matrizDatos[i + 1][j];
            }
        }
        return matriz;
    }

    private void proximoDisponible(int c) {
        lDisponible.setText("Proximo disponible: " + c);
        lDisponible.setVisible(true);
    }

    private void buscar(int a) {
        int numero = d.buscar(a);
        System.out.println("numero " + numero);
        String[][] matrizD = new String[4][1];
        String[][] matrizC = new String[1][3];
        for (int i = 0; i < matrizD.length; i++) {
            for (int j = 0; j < matrizD[0].length; j++) {
                matrizD[i][j] = matrizDatos[i][numero];
            }
        }

        numero = d.buscarC(a, tListaCabezas);
        System.out.println("numero cabeza" + numero);

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                matrizC[i][j] = String.valueOf(tListaCabezas.getValueAt(numero, j));
            }
        }
        crearModelo(matrizC, tListaCabezas);
        mostrarHeader(matrizC, tListaCabezas, "c");
        ponerDatos(matrizC, tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(matrizD, tDatos);
        mostrarHeader(matrizD, tDatos, "a");
        ponerVectDatos(matrizD, tDatos);
        tDatos.setVisible(true);
    }

    private void centrarDatos(JTable tabla) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int j = 0; j < tabla.getColumnCount(); j++) {
            tabla.getColumnModel().getColumn(j).setCellRenderer(centerRenderer);
        }
    }

    private void mostrarTablas() {
        crearModelo(d.matrizCabeza(), tListaCabezas);
        mostrarHeader(d.matrizCabeza(), tListaCabezas,"c");
        ponerDatos(d.matrizCabeza(), tListaCabezas);
        lCabezasListas.setVisible(true);
        lCursor.setVisible(true);
        tListaCabezas.setVisible(true);
        crearModelo(reDefinirMatriz(matrizDatos), tDatos);
        mostrarHeader(reDefinirMatriz(matrizDatos), tDatos, "");
        ponerDatos(reDefinirMatriz(matrizDatos), tDatos);
        tDatos.setVisible(true);
        bBuscar.setVisible(true);
    }

}
