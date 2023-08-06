/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Display;

import Clases.Carrito;
import Clases.Conexion;
import Clases.Productos;
import Data.DataProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class JCarrito extends javax.swing.JFrame {

    /**
     * Creates new form JCarrito
     */
    public JCarrito() {
        initComponents();
        llenarProductos();
        cargarTablaCarrito();
        ButtonGroup btnAnnadir;
        btnAnnadir = new ButtonGroup();
       

    }

    private void llenarProductos() {

        DataProductos dtProductos = new DataProductos();
        ArrayList<Productos> listaProductos = dtProductos.getProductos();

        cboProductos.removeAllItems();

        for (int i = 0; i < listaProductos.size(); i++) {
            cboProductos.addItem(listaProductos.get(i).getDescripcion());

        }
    }

    public void limpiar() {
        cboProductos.getSelectedIndex();
        lblDisponible.getText();
        TxtPrecio.setText("");
        TxtIva.setText("");
        Txt_IncEnvio.setText("");
        TxtTotal.setText("");
        //      btnAnnadir.clearSelection();

    }

    private void cargarTablaCarrito() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCarrito.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int column;
        int[] width = {10, 40, 50, 60, 80, 90};
        for (int i = 0; i < tblCarrito.getColumnCount(); i++) {
            tblCarrito.getColumnModel().getColumn(i).setPreferredWidth(width[i]);
        }
        try {
            Connection connection = Conexion.getConexion();
            ps = connection.prepareStatement("SELECT Descripcion,Cantidad,Precio,Iva, Envio, Total FROM Carrito");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            column = rsmd.getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[column];
                for (int index = 0; index < column; index++) {
                    row[index] = rs.getObject(index + 1);

                }
                modeloTabla.addRow(row);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jL_CarritoTitulo = new javax.swing.JLabel();
        cboProductos = new javax.swing.JComboBox<>();
        jS_Cantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        TxtPrecio = new javax.swing.JTextField();
        TxtIva = new javax.swing.JTextField();
        Txt_IncEnvio = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        txtValorPrecio = new javax.swing.JTextField();
        TxtValorIva = new javax.swing.JTextField();
        TxtValorIncEnvio = new javax.swing.JTextField();
        TxtValorTotal = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblDisponible = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jL_CarritoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_CarritoTitulo.setText("Carrito de compras");

        cboProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));
        cboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductosActionPerformed(evt);
            }
        });

        jS_Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jS_Cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jS_Cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarrito);

        TxtPrecio.setText("Precio");

        TxtIva.setText("Iva");

        Txt_IncEnvio.setText("Incluir Envio");

        TxtTotal.setText("Total");

        TxtValorIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorIvaActionPerformed(evt);
            }
        });

        TxtValorIncEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorIncEnvioActionPerformed(evt);
            }
        });

        TxtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtValorTotalActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblDisponible.setBorder(javax.swing.BorderFactory.createTitledBorder("Disponible"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jL_CarritoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jS_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtPrecio)
                            .addComponent(TxtIva)
                            .addComponent(Txt_IncEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(TxtTotal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValorIva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValorIncEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_CarritoTitulo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboProductos)
                    .addComponent(jS_Cantidad)
                    .addComponent(lblDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValorIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_IncEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValorIncEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboProductosActionPerformed

    private void TxtValorIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorIvaActionPerformed
//DEBO AGREGAR EL VALOR DEL IVA
        int iva = (int) 0.15;

        TxtIva.setText(String.valueOf(iva));
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorIvaActionPerformed

    private void TxtValorIncEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorIncEnvioActionPerformed
        int envio = 5000;

        Txt_IncEnvio.setText(String.valueOf(envio));

// TODO add your handling code here:
    }//GEN-LAST:event_TxtValorIncEnvioActionPerformed

    private void TxtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtValorTotalActionPerformed

        int suma = 0;

// Obtener los valores numéricos de los campos de texto
        int valorIva = Integer.parseInt(TxtIva.getText());
        int valorIncEnvio = Integer.parseInt(Txt_IncEnvio.getText());

// Realizar la suma
        suma = valorIva + valorIncEnvio;

        // TODO add your handling code here:
    }//GEN-LAST:event_TxtValorTotalActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ImageIcon icono = new ImageIcon("src\\main\\java\\Imagenes\\anadir-al-carrito.png");
        btnAgregar.setIcon(icono);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         JLogin jLogin =new JLogin();
        jLogin.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(JCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCarrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtIva;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtValorIncEnvio;
    private javax.swing.JTextField TxtValorIva;
    private javax.swing.JTextField TxtValorTotal;
    private javax.swing.JTextField Txt_IncEnvio;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JLabel jL_CarritoTitulo;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSpinner jS_Cantidad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisponible;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextField txtValorPrecio;
    // End of variables declaration//GEN-END:variables
}
