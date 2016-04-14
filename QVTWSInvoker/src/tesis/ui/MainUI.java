package tesis.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class MainUI extends javax.swing.JFrame {

    public MainUI() {
        initComponents();
    }

    public void setActionListener(ActionListener lis) {
        this.category.addActionListener(lis);
        this.wsdl.addActionListener(lis);
        this.invoker.addActionListener(lis);
    }

    public JButton getCategory() {
        return category;
    }

    public JDesktopPane getContainer() {
        return container;
    }

    public JButton getInvoker() {
        return invoker;
    }

    public JButton getWsdl() {
        return wsdl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JDesktopPane();
        panelBotones = new javax.swing.JPanel();
        category = new javax.swing.JButton();
        wsdl = new javax.swing.JButton();
        invoker = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        authors = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QVTWSInvoker");

        panelBotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelBotones.setLayout(new java.awt.GridLayout(1, 0));

        category.setText("Management Categories");
        category.setToolTipText("");
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        panelBotones.add(category);

        wsdl.setText("Management WSDL");
        wsdl.setToolTipText("");
        panelBotones.add(wsdl);

        invoker.setText("Web services Invoker");
        invoker.setToolTipText("");
        panelBotones.add(invoker);

        jMenu1.setText("File");

        salir.setText("Exit");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("About");

        authors.setText("Authors");
        authors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorsActionPerformed(evt);
            }
        });
        jMenu3.add(authors);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int ret = JOptionPane.showConfirmDialog(this, "Do you want to exit the application?", "Close application", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_salirActionPerformed

    private void authorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorsActionPerformed
        /*  AcercaDe acercaDe = new AcercaDe(this, true);
         acercaDe.setLocationRelativeTo(this);
         acercaDe.setVisible(true);*/
    }//GEN-LAST:event_authorsActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem authors;
    private javax.swing.JButton category;
    private javax.swing.JDesktopPane container;
    private javax.swing.JButton invoker;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JMenuItem salir;
    private javax.swing.JButton wsdl;
    // End of variables declaration//GEN-END:variables
}
