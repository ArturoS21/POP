/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Carba
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        System.out.println("hola mundo");
        System.out.println("soy arturo");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuLogistica = new javax.swing.JMenu();
        menuAlta = new javax.swing.JMenu();
        itemFletero = new javax.swing.JMenuItem();
        itemTrillador = new javax.swing.JMenuItem();
        itemBoletero = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemEjidoCampos = new javax.swing.JMenuItem();
        itemBoletas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POP");

        escritorio.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        menuLogistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lorry.png"))); // NOI18N
        menuLogistica.setText("LOGISTICA CAMPO Y ENTRADA DE ALMACEN");

        menuAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flag_red.png"))); // NOI18N
        menuAlta.setText("ALTA");

        itemFletero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        itemFletero.setText("FLETERO");
        menuAlta.add(itemFletero);

        itemTrillador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        itemTrillador.setText("TRILLADOR");
        menuAlta.add(itemTrillador);

        itemBoletero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/group_add.png"))); // NOI18N
        itemBoletero.setText("BOLETERO");
        menuAlta.add(itemBoletero);
        menuAlta.add(jSeparator1);

        itemEjidoCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/photo_add.png"))); // NOI18N
        itemEjidoCampos.setText("EJIDO Y CAMPOS");
        itemEjidoCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEjidoCamposActionPerformed(evt);
            }
        });
        menuAlta.add(itemEjidoCampos);

        itemBoletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_table.png"))); // NOI18N
        itemBoletas.setText("ASIGNACIÓN DE BOLETAS");
        menuAlta.add(itemBoletas);

        menuLogistica.add(menuAlta);

        jMenuBar1.add(menuLogistica);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paste_plain.png"))); // NOI18N
        jMenu2.setText("COORDINADOR");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEjidoCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEjidoCamposActionPerformed
        // TODO add your handling code here:
        ejidosyCampos ejc = new ejidosyCampos();
        escritorio.add(ejc);
        ejc.show();
    }//GEN-LAST:event_itemEjidoCamposActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemBoletas;
    private javax.swing.JMenuItem itemBoletero;
    private javax.swing.JMenuItem itemEjidoCampos;
    private javax.swing.JMenuItem itemFletero;
    private javax.swing.JMenuItem itemTrillador;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAlta;
    private javax.swing.JMenu menuLogistica;
    // End of variables declaration//GEN-END:variables
}
