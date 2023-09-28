/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2_Floricela;
//Importacion de Clases
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Flory
 */
public class Interfaz_class extends javax.swing.JFrame {
    
    //DECLARACIONES
    int cantidad_huevos;
    double monto_total;
    //Creo un objeto modelo del Table Model
    private static DefaultTableModel modelo_jtable = new DefaultTableModel (); 

    

    //Funcion para permitir solo valores numericos en las casillas
    public void validar_tecla_num (java.awt.event.KeyEvent evt){
        int tecla = evt.getKeyChar(); //Guardo la tecla introducida por el usuario
        boolean num = tecla>=48 && tecla <=57 || tecla == 8;// Creo boleano que contenga solo caracteres numericos y BS segun ASCII
        if (!num){ //Condiciono que si el boolean es false no guarde la tecla y envio mensaje a pantalla
            evt.consume();//Evito que se guarde lo que el usuario tecleo.
            JOptionPane.showMessageDialog(this,("Indique solo valores numericos"));
        }
    }
    
  
    /**
     * Creates new form Interfaz_class
     */
    public Interfaz_class() {
        initComponents();
        this.setLocationRelativeTo(null); //Coloco la ventana en el centro de la pantalla
        this.setTitle("Empresa CODOR_ FELIZ");// Le pongo título
        jTable_resultado_calculo.setModel(modelo_jtable);//Seteo el modelo para usar el constructor de DefaultTableModel
        //Creo las columnas en el modelo
        modelo_jtable.addColumn("Tipo de Saco");
        modelo_jtable.addColumn("Cantidad de Sacos");
        //Oculto casillas de descuento para permitirle al usuario elegir
        Label_huevos.setVisible(false);
        JText_cantidad_huevos.setVisible(false);
        Label_descuento.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_principal = new javax.swing.JPanel();
        Label_huevos = new javax.swing.JLabel();
        JText_cantidad_huevos = new javax.swing.JTextField();
        Label_indicar_clic = new javax.swing.JLabel();
        Separador1 = new javax.swing.JSeparator();
        Button_calculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_resultado_calculo = new javax.swing.JTable();
        Label_monto_pagar = new javax.swing.JLabel();
        Label_descuento = new javax.swing.JLabel();
        Label_indique = new javax.swing.JLabel();
        Label_polluelos = new javax.swing.JLabel();
        Label_jovenes = new javax.swing.JLabel();
        Label_adultos = new javax.swing.JLabel();
        JText_polluelos = new javax.swing.JTextField();
        JText_jovenes = new javax.swing.JTextField();
        JText_adultos = new javax.swing.JTextField();
        Label_subtotal = new javax.swing.JLabel();
        CheckBox_intercambiar_huevos = new javax.swing.JCheckBox();
        Label_total = new javax.swing.JLabel();
        Label_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_huevos.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        Label_huevos.setText("Indique la cantidad de huevos a intercambiar");

        JText_cantidad_huevos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JText_cantidad_huevosKeyTyped(evt);
            }
        });

        Label_indicar_clic.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        Label_indicar_clic.setForeground(new java.awt.Color(175, 48, 11));
        Label_indicar_clic.setText("De clic en el botón, para calcular la cantidad de sacos que debe comprar según la edad de las codornices. ");

        Button_calculo.setBackground(new java.awt.Color(51, 68, 84));
        Button_calculo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Button_calculo.setForeground(new java.awt.Color(255, 255, 255));
        Button_calculo.setText("Calcular");
        Button_calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_calculoActionPerformed(evt);
            }
        });

        jTable_resultado_calculo.setBackground(new java.awt.Color(201, 205, 211));
        jTable_resultado_calculo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTable_resultado_calculo.setForeground(new java.awt.Color(55, 73, 91));
        jTable_resultado_calculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo de Alimento", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable_resultado_calculo);

        Label_monto_pagar.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        Label_monto_pagar.setText("El monto a pagar es de:");

        Label_descuento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Label_descuento.setForeground(new java.awt.Color(189, 88, 34));
        Label_descuento.setText("Descuento:");

        Label_indique.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        Label_indique.setForeground(new java.awt.Color(175, 48, 11));
        Label_indique.setText("Indique la cantidad de Codornices en la granja");

        Label_polluelos.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        Label_polluelos.setText("Polluelos:");

        Label_jovenes.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        Label_jovenes.setText("Jóvenes:");

        Label_adultos.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        Label_adultos.setText("Adultos:");

        JText_polluelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_polluelosActionPerformed(evt);
            }
        });
        JText_polluelos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JText_polluelosKeyTyped(evt);
            }
        });

        JText_jovenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JText_jovenesActionPerformed(evt);
            }
        });
        JText_jovenes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JText_jovenesKeyTyped(evt);
            }
        });

        JText_adultos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JText_adultosKeyTyped(evt);
            }
        });

        Label_subtotal.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Label_subtotal.setForeground(new java.awt.Color(102, 102, 102));
        Label_subtotal.setText("Subtotal:");

        CheckBox_intercambiar_huevos.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        CheckBox_intercambiar_huevos.setText("¿Desea intercambiar huevos?");
        CheckBox_intercambiar_huevos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_intercambiar_huevosActionPerformed(evt);
            }
        });

        Label_total.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Label_total.setForeground(new java.awt.Color(51, 153, 0));
        Label_total.setText("Total:");

        Label_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/codorniz.png"))); // NOI18N

        javax.swing.GroupLayout Panel_principalLayout = new javax.swing.GroupLayout(Panel_principal);
        Panel_principal.setLayout(Panel_principalLayout);
        Panel_principalLayout.setHorizontalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Separador1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addComponent(Label_polluelos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JText_polluelos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(Label_jovenes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JText_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Label_adultos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JText_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addComponent(CheckBox_intercambiar_huevos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_huevos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JText_cantidad_huevos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_indicar_clic)
                            .addGroup(Panel_principalLayout.createSequentialGroup()
                                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_principalLayout.createSequentialGroup()
                                        .addComponent(Label_image)
                                        .addGap(240, 240, 240))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_principalLayout.createSequentialGroup()
                                        .addComponent(Label_monto_pagar)
                                        .addGap(45, 45, 45)))
                                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_subtotal)
                                    .addComponent(Label_total)
                                    .addComponent(Label_descuento))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_calculo)
                .addGap(289, 289, 289))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_indique)
                .addGap(178, 178, 178))
        );
        Panel_principalLayout.setVerticalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_indique)
                .addGap(18, 18, 18)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_polluelos)
                    .addComponent(Label_jovenes)
                    .addComponent(Label_adultos)
                    .addComponent(JText_polluelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JText_jovenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JText_adultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox_intercambiar_huevos)
                    .addComponent(Label_huevos)
                    .addComponent(JText_cantidad_huevos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_indicar_clic)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Button_calculo)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Panel_principalLayout.createSequentialGroup()
                                .addComponent(Label_monto_pagar)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(Label_descuento, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Label_total)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JText_polluelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_polluelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JText_polluelosActionPerformed

    private void JText_jovenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JText_jovenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JText_jovenesActionPerformed

    private void JText_polluelosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JText_polluelosKeyTyped
      //Llamo a la funcion que permite solo caracteres y BS
      validar_tecla_num (evt);   
    }//GEN-LAST:event_JText_polluelosKeyTyped
//Llamo a las funciones KeyTyped para las casillas donde ocupo solicitar datos numéricos.
    private void JText_jovenesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JText_jovenesKeyTyped
        //Llamo a la funcion que permite solo caracteres y BS
      validar_tecla_num (evt); 
    }//GEN-LAST:event_JText_jovenesKeyTyped

    private void JText_adultosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JText_adultosKeyTyped
       //Llamo a la funcion que permite solo caracteres y BS
      validar_tecla_num (evt); 
    }//GEN-LAST:event_JText_adultosKeyTyped

    private void JText_cantidad_huevosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JText_cantidad_huevosKeyTyped
        //Llamo a la funcion que permite solo caracteres y BS
      validar_tecla_num (evt); 
    }//GEN-LAST:event_JText_cantidad_huevosKeyTyped

    private void Button_calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_calculoActionPerformed
       //Manejo de excepciones para que no se caiga el programa cuando el usuario no llena algún dato
    try { 
        //Limpio el Jtable, en caso de que el usuario teclee de nuevo calcular sin cerrar ventana.
        modelo_jtable.setRowCount(0);
        
        //Capturo la información de las casillas y las convierto a entero.
        String cantidad_p = JText_polluelos.getText();
        int cant_polluelos = Integer.parseInt(cantidad_p);
        String cantidad_j = JText_jovenes.getText();
        int cant_jovenes = Integer.parseInt(cantidad_j);
        String cantidad_a =JText_adultos.getText();
        int cant_adultos=  Integer.parseInt(cantidad_a);
 
        //Instancio la clase Codorniz para los polluelos
        Codorniz polluelos = new Codorniz(); 
        polluelos.setCantidad(cant_polluelos);
        polluelos.calcular_sacos_polluelos();//Llamo función para el cálculo de los sacos para polluelos.
        monto_total= polluelos.monto_total_sacos;//Extraigo el monto retornado para sumarlo con los demás.
        //Llamo a la función para mostrar la cantidad de sacos de polluelos
        polluelos.mostrar_informacion("Sacos de Crecimiento");
        modelo_jtable.addRow(Codorniz.informacion);//Añado línea adicional

        
        //Instancio la clase codorniz para los jóvenes
        Codorniz jovenes = new Codorniz();
        jovenes.setCantidad(cant_jovenes);
        jovenes.calcular_sacos_jovenes();
        monto_total= monto_total + jovenes.monto_total_sacos; //Sumo el monto anterior más el retornado en esta función.
        //Llamo a la función para mostrar la cantidad de sacos de jovenes
        jovenes.mostrar_informacion("Sacos de Desarrollo");
        modelo_jtable.addRow(Codorniz.informacion);//Añado una línea más en elJtable.

        
        //Instancio la clase Codorniz para los adultos
        Codorniz adultos =new Codorniz();
        adultos.setCantidad(cant_adultos);
        adultos.calcular_sacos_adultos();
        monto_total= monto_total + adultos.monto_total_sacos; //Sumo el monto anterior más el retornado en esta función.
        //Llamo a la función para mostrar la cantidad de sacos de adultos
        adultos.mostrar_informacion("Sacos de Mantenimiento");
        modelo_jtable.addRow(Codorniz.informacion);

        
        //Calculo para el descuento
        
        //Extracción y conversión de datos para el descuento brindados por usuario
        if (CheckBox_intercambiar_huevos.isSelected()){
        String cantidad_h = JText_cantidad_huevos.getText();
        cantidad_huevos = Integer.parseInt(cantidad_h);//Convierto el String a int para poder calcular según cantidad de huevos.
        }
        //Instacio la clase descuento y llamo a la función para hacer el cálculo correspondiente.
        Descuento Descuento = new Descuento();
        Descuento.setCantidad_huevos(cantidad_huevos);
        Descuento.calcular_descuento(monto_total);
        double descuento= Descuento.descuento; //Guardo el monto retornado por la función.
        
        //Muestro montos por pagar y descuento
        Label_subtotal.setText("Total por pagar sin descuento: ¢"+monto_total);
        Label_descuento.setText("Descuento: ¢"+descuento);
        double total_pagar = monto_total-descuento;
        Label_total.setText("Total por pagar: ¢"+total_pagar);

       } catch (Exception ERROR){
            JOptionPane.showMessageDialog(this, "A ocurrido un error inesperado, debe brindar toda la información","ERROR",JOptionPane.WARNING_MESSAGE);
         }
    }//GEN-LAST:event_Button_calculoActionPerformed
    
    
    private void CheckBox_intercambiar_huevosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_intercambiar_huevosActionPerformed
        // Mostrar y ocultar casillas, dependiendo si se desea intercambiar huevos por descuento
        if (CheckBox_intercambiar_huevos.isSelected()){
            Label_huevos.setVisible(true);
            JText_cantidad_huevos.setVisible(true);
            Label_descuento.setVisible(true);      
        } else {
            Label_huevos.setVisible(false);
            JText_cantidad_huevos.setVisible(false);
            Label_descuento.setVisible(false);
        }
    }//GEN-LAST:event_CheckBox_intercambiar_huevosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_class().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_calculo;
    private javax.swing.JCheckBox CheckBox_intercambiar_huevos;
    private javax.swing.JTextField JText_adultos;
    private javax.swing.JTextField JText_cantidad_huevos;
    private javax.swing.JTextField JText_jovenes;
    private javax.swing.JTextField JText_polluelos;
    private javax.swing.JLabel Label_adultos;
    private javax.swing.JLabel Label_descuento;
    private javax.swing.JLabel Label_huevos;
    private javax.swing.JLabel Label_image;
    private javax.swing.JLabel Label_indicar_clic;
    private javax.swing.JLabel Label_indique;
    private javax.swing.JLabel Label_jovenes;
    private javax.swing.JLabel Label_monto_pagar;
    private javax.swing.JLabel Label_polluelos;
    private javax.swing.JLabel Label_subtotal;
    private javax.swing.JLabel Label_total;
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JSeparator Separador1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_resultado_calculo;
    // End of variables declaration//GEN-END:variables
}