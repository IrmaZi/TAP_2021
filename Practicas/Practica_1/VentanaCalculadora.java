

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaCalculadora extends javax.swing.JFrame {

    /** 
     * 
     *
     */
    private static final long serialVersionUID = 1L;
    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "null";
    private boolean activado = true;
    private boolean punto = true;

    public VentanaCalculadora() {
        initComponents();
        setSize(300, 400);
        setLocationRelativeTo(null);//Iniciará en medio de mi pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Panel = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNumeros = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        btn_Raiz = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_multiplicar = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_cambiarSigno = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        Panel.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        Panel.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNumeros.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        Panel.add(etiquetaNumeros, gridBagConstraints);

        botonC.setBackground(new java.awt.Color(239, 239, 195));
        botonC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(botonC, gridBagConstraints);

        btn_Raiz.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Raiz.setText("√ ");
        btn_Raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_Raiz, gridBagConstraints);

        btn_dividir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_dividir.setText("/");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_dividir, gridBagConstraints);

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_borrar, gridBagConstraints);

        btn_7.setBackground(new java.awt.Color(204, 204, 255));
        btn_7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_7, gridBagConstraints);

        btn_8.setBackground(new java.awt.Color(204, 204, 255));
        btn_8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_8, gridBagConstraints);

        btn_9.setBackground(new java.awt.Color(204, 204, 255));
        btn_9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_9, gridBagConstraints);

        btn_multiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_multiplicar.setText("X");
        btn_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_multiplicar, gridBagConstraints);

        btn_4.setBackground(new java.awt.Color(204, 204, 255));
        btn_4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_4, gridBagConstraints);

        btn_5.setBackground(new java.awt.Color(204, 204, 255));
        btn_5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_5, gridBagConstraints);

        btn_6.setBackground(new java.awt.Color(204, 204, 255));
        btn_6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_6, gridBagConstraints);

        btn_resta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_resta.setText("-");
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_resta, gridBagConstraints);

        btn_1.setBackground(new java.awt.Color(204, 204, 255));
        btn_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_1, gridBagConstraints);

        btn_2.setBackground(new java.awt.Color(204, 204, 255));
        btn_2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_2, gridBagConstraints);

        btn_3.setBackground(new java.awt.Color(204, 204, 255));
        btn_3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_3, gridBagConstraints);

        btn_suma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_suma.setText("+");
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_suma, gridBagConstraints);

        btn_cambiarSigno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_cambiarSigno.setText("±");
        btn_cambiarSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_cambiarSigno, gridBagConstraints);

        btn_0.setBackground(new java.awt.Color(204, 204, 255));
        btn_0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_0, gridBagConstraints);

        btn_punto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_punto, gridBagConstraints);

        btn_igual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        Panel.add(btn_igual, gridBagConstraints);

        Menu.setText("Usos");
        Menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Menu.add(jSeparator1);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Menu.add(Salir);

        barraMenu.add(Menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {                                      

        System.exit(0);
    }                                     

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "4";//entonces cadena numeros solamente vale 4
        } else {
            cadenaNumeros += "4";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "1";//entonces cadena numeros solamente vale 1
        } else {
            cadenaNumeros += "1";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "2";//entonces cadena numeros solamente vale 2
        } else {
            cadenaNumeros += "2";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "3";//entonces cadena numeros solamente vale 3
        } else {
            cadenaNumeros += "3";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "5";//entonces cadena numeros solamente vale 5
        } else {
            cadenaNumeros += "5";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "6";//entonces cadena numeros solamente vale 1
        } else {
            cadenaNumeros += "6";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "7";//entonces cadena numeros solamente vale 1
        } else {
            cadenaNumeros += "7";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "8";//entonces cadena numeros solamente vale 1
        } else {
            cadenaNumeros += "8";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
            cadenaNumeros = "9";//entonces cadena numeros solamente vale 1
        } else {
            cadenaNumeros += "9";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }                                     

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (cadenaNumeros != "") {
            if (etiquetaNumeros.getText() == "0") {//si ecuentra que hay un cero adelante 
                cadenaNumeros = "0";//entonces cadena numeros solamente vale 1
            } else {
                cadenaNumeros += "0";//pero si se ds cuenta que no hay un cero al inicio, hay muchos numeros entonces concatena el numero con esos números
            }
            etiquetaNumeros.setText(cadenaNumeros);
            activado = true;
        }

    }                                     

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);// el string lo transformamos a double y se guarda en la variable número 1
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false;
            punto = true;
        }

    }                                        

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double numero2;
        if (operacion.equals("null")) {
            etiquetaNumeros.setText(cadenaNumeros);
        } else if (operacion.equals("sumar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 + numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("restar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 - numero2;
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("multiplicar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = (numero1 * numero2);
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("dividir")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = (numero1 / numero2);
            etiquetaNumeros.setText(String.format("%.2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        }

        etiquetaMuestra.setText("");
        activado = true;
    }                                         

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (punto == true) {
            if (cadenaNumeros == "") {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);

            punto = false;
        }
    }                                         

    private void btn_cambiarSignoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros; //Si es diferente de negativo se le agrega un negativo
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());// si es negativo, corta la cadena 
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }                                                

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int tamanio = cadenaNumeros.length();
        if (tamanio > 0) { //Se comprueba el tamaño
            if (tamanio == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);//se borra elementos por la derecha  
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }                                          

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (activado == true) {//comprueba si la variable booleana es verdadero
            numero1 = Double.parseDouble(cadenaNumeros);// el string lo transformamos a double y se guarda en la variable número 1
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false;
            punto = true;
        }
    }                                         

    private void btn_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (activado == true) {//comprueba si la variable booleana es verdadero
            numero1 = Double.parseDouble(cadenaNumeros);// el string lo transformamos a double y se guarda en la variable número 1
            etiquetaMuestra.setText(cadenaNumeros + " * ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false;
            punto = true;
        }
    }                                               

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (activado == true) {//comprueba si la variable booleana es verdadero
            numero1 = Double.parseDouble(cadenaNumeros);// el string lo transformamos a double y se guarda en la variable número 1
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false;
            punto = true;
        }
    }                                           

    private void btn_RaizActionPerformed(java.awt.event.ActionEvent evt) {                                         

        numero1 = Double.parseDouble(cadenaNumeros);// el string lo transformamos a double y se guarda en la variable número 1
        etiquetaMuestra.setText("sqrt (" + cadenaNumeros + ")");
        //cadenaNumeros = "";
        resultado = Math.sqrt(numero1);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);

        punto = true;
    }                                        

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {                                       
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        cadenaNumeros = "";
        operacion = "null";
        activado = true;
        punto = true;
    }                                      

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //  Logger.getLogger(Ventana_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu Menu;
    private javax.swing.JPanel Panel;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonC;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_Raiz;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cambiarSigno;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multiplicar;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration                   
}