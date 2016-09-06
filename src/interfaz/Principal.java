/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author lguerrer17
 */
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Persona> v = new ArrayList();
    
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtPnombre = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        txtPapellido = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLmpiar = new javax.swing.JButton();
        cmdListadomujeres = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPingresadas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar personas");
        setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Identificacion");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Primer nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Primer apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtIdentificacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, -1));

        txtPnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPnombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, -1));

        lblSexo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblSexo.setText("Sexo");
        jPanel2.add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtPapellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPapellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 60, -1));

        cmbSexo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Indefinido" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 170, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        cmdMostrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        cmdLmpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLmpiar.setText("Limpiar");
        cmdLmpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLmpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLmpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        cmdListadomujeres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdListadomujeres.setText("Listado de mujeres");
        cmdListadomujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdListadomujeresActionPerformed(evt);
            }
        });
        jPanel3.add(cmdListadomujeres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personas ingresadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPingresadas.setEditable(false);
        txtPingresadas.setColumns(20);
        txtPingresadas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPingresadas.setRows(5);
        jScrollPane1.setViewportView(txtPingresadas);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 290, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 330, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        // TODO add your handling code here:
        Persona p;
        long identificacion;
        String primer_nombre, primer_apellido;
        
        identificacion = Long.parseLong(txtIdentificacion.getText());
        primer_nombre = txtPnombre.getText();
        primer_apellido = txtPapellido.getText();
        String sexo = cmbSexo.getSelectedItem().toString();
        
        p = new Persona(identificacion, primer_nombre, primer_apellido, sexo);
        v.add(p);
        Helper.mensaje(this, "Persona agregada exitosamente", "Información", 1);
        
        txtIdentificacion.setText("");
        txtPapellido.setText("");
        txtPnombre.setText("");
        cmbSexo.setSelectedItem(0);
        txtIdentificacion.requestFocusInWindow();

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtPnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPnombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();
            
            evt.consume();
        }
    }//GEN-LAST:event_txtPnombreKeyTyped

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        String aux;
        txtPingresadas.setText("");
        if (v.isEmpty()) {
            txtPingresadas.append("No hay personas que mostrar");
            txtIdentificacion.requestFocusInWindow();
        } else {
            for (int i = 0; i < v.size(); i++) {
                aux = "Persona No. " + (i + 1) + "\n"
                        + "Identificación: " + v.get(i).getIdentificacion() + "\n"
                        + "Primer nombre: " + v.get(i).getPrimer_nombre() + "\n"
                        + "Primer apellido: " + v.get(i).getPrimer_apellido() + "\n"
                        + "Sexo: " + v.get(i).getSexo() + "\n";
                txtPingresadas.append(aux);
            }
        }

    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLmpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLmpiarActionPerformed
        // TODO add your handling code here:
        int op;
        op = Helper.mensaje(this, "¿Seguro que desea borrar todos los objetos?", "Pregunta", 3);
        if (op == JOptionPane.YES_OPTION) {
            v.clear();
            txtIdentificacion.setText("");
            txtPapellido.setText("");
            txtPnombre.setText("");
            txtPingresadas.setText("");
            cmbSexo.setSelectedItem(0);
            txtIdentificacion.requestFocusInWindow();
        }
    }//GEN-LAST:event_cmdLmpiarActionPerformed

    private void txtPapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPapellidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPapellidoKeyTyped

    private void cmdListadomujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdListadomujeresActionPerformed
        // TODO add your handling code here:
        String aux;
        txtPingresadas.setText("");
        if (v.isEmpty()) {
            txtPingresadas.append("No hay personas que mostrar");
            txtIdentificacion.requestFocusInWindow();
        } else {
            for (int i = 0; i < v.size(); i++) {
                if (v.get(i).getSexo().equalsIgnoreCase("Femenino")) {
                    aux = "Persona No. " + (i + 1) + "\n"
                            + "Identificación: " + v.get(i).getIdentificacion() + "\n"
                            + "Primer nombre: " + v.get(i).getPrimer_nombre() + "\n"
                            + "Primer apellido: " + v.get(i).getPrimer_apellido() + "\n"
                            + "Sexo: " + v.get(i).getSexo();
                    txtPingresadas.append(aux);
                }
            }
        }
    }//GEN-LAST:event_cmdListadomujeresActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdListadomujeres;
    private javax.swing.JButton cmdLmpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPapellido;
    private javax.swing.JTextArea txtPingresadas;
    private javax.swing.JTextField txtPnombre;
    // End of variables declaration//GEN-END:variables
}
