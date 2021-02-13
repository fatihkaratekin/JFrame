
package hafta9;


  import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    public void TabloDoldur(){
        
        
            String adres = "jdbc:derby://localhost:1527/PersonelListesi";
            String kullanıcı = "PATRON";
            String sifre = "123";
            
            try{
            
            Connection bag = DriverManager.getConnection(adres, kullanıcı,sifre);
            Statement sorgu = bag.createStatement();
            ResultSet sonuc = sorgu.executeQuery("SELECT * FROM personel"); 
            int sütun = sonuc.getMetaData().getColumnCount();
            while (sonuc.next()) { 
                Object[] satir = new Object [sütun]; 
                for(int i = 1; i<=sütun ; i++){ 
                    satir [i-1]= sonuc.getObject(i); 
                    
                }
                
                ((DefaultTableModel)jTable_personel.getModel()).insertRow(sonuc.getRow() -1,satir);
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hata");
        }
        
        
        
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_personel = new javax.swing.JTable();
        jLabel_AD = new javax.swing.JLabel();
        jLabel_SOYAD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_CINSIYET = new javax.swing.JLabel();
        jTextField_AD = new javax.swing.JTextField();
        jTextField_SOYAD = new javax.swing.JTextField();
        jSlider_YAS = new javax.swing.JSlider();
        jLabel_YAS = new javax.swing.JLabel();
        jRadioButton_KADIN = new javax.swing.JRadioButton();
        jRadioButton_ERKEK = new javax.swing.JRadioButton();
        jButton_YENİ = new javax.swing.JButton();
        jButton_EKLE = new javax.swing.JButton();
        jButton_GÜNCELLE = new javax.swing.JButton();
        jButton_SİL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_personel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AD", "SOYAD", "YAS", "CINSIYET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_personel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_personelMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_personel);

        jLabel_AD.setText("AD");

        jLabel_SOYAD.setText("SOYAD");

        jLabel3.setText("YAS");

        jLabel_CINSIYET.setText("CINSIYET");

        jTextField_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ADActionPerformed(evt);
            }
        });

        jSlider_YAS.setMajorTickSpacing(10);
        jSlider_YAS.setMinorTickSpacing(1);
        jSlider_YAS.setPaintLabels(true);
        jSlider_YAS.setPaintTicks(true);
        jSlider_YAS.setValue(0);
        jSlider_YAS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_YASStateChanged(evt);
            }
        });

        jLabel_YAS.setText("0");

        buttonGroup1.add(jRadioButton_KADIN);
        jRadioButton_KADIN.setText("KADIN");
        jRadioButton_KADIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KADINActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_ERKEK);
        jRadioButton_ERKEK.setText("ERKEK");

        jButton_YENİ.setText("YENİ");

        jButton_EKLE.setText("EKLE");

        jButton_GÜNCELLE.setText("GÜNCELLE");

        jButton_SİL.setText("SİL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel_YAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_AD)
                                            .addComponent(jLabel_SOYAD)))
                                    .addGap(77, 77, 77)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_AD, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(jTextField_SOYAD))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addComponent(jSlider_YAS, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jRadioButton_KADIN)
                                            .addGap(32, 32, 32)
                                            .addComponent(jRadioButton_ERKEK)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_CINSIYET)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_GÜNCELLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_SİL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_EKLE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_YENİ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_AD)
                    .addComponent(jTextField_AD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_YENİ))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_SOYAD)
                            .addComponent(jTextField_SOYAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_EKLE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSlider_YAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_YAS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_CINSIYET, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton_KADIN)
                            .addComponent(jRadioButton_ERKEK)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_GÜNCELLE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SİL)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ADActionPerformed

    private void jRadioButton_KADINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KADINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_KADINActionPerformed

    private void jSlider_YASStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_YASStateChanged
        jLabel_YAS.setText(""+ jSlider_YAS.getValue());
    }//GEN-LAST:event_jSlider_YASStateChanged

    private void jTable_personelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_personelMousePressed
      
        int SecilenSatır = jTable_personel.getSelectedRow(); 
        System.out.println("Seçilen satır " + SecilenSatır);
        String AD = jTable_personel.getValueAt(SecilenSatır,1).toString();
        String SOYAD= jTable_personel.getValueAt(SecilenSatır,2).toString(); 
        String YAS = jTable_personel.getValueAt(SecilenSatır,3).toString(); 
        String CINSIYET =  jTable_personel.getValueAt(SecilenSatır,4).toString(); 
        
        jTextField_AD.setText(AD);
        jTextField_SOYAD.setText(SOYAD);
        jLabel_YAS.setText(YAS);
        jSlider_YAS.setValue(Integer.parseInt(YAS)); 
        if (CINSIYET.equals("KADIN")) {
           jRadioButton_KADIN.setSelected(true); 
         
        }else{
            jRadioButton_ERKEK.setSelected(true);
        }
            
        
    }//GEN-LAST:event_jTable_personelMousePressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_EKLE;
    private javax.swing.JButton jButton_GÜNCELLE;
    private javax.swing.JButton jButton_SİL;
    private javax.swing.JButton jButton_YENİ;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_AD;
    private javax.swing.JLabel jLabel_CINSIYET;
    private javax.swing.JLabel jLabel_SOYAD;
    private javax.swing.JLabel jLabel_YAS;
    private javax.swing.JRadioButton jRadioButton_ERKEK;
    private javax.swing.JRadioButton jRadioButton_KADIN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider_YAS;
    private javax.swing.JTable jTable_personel;
    private javax.swing.JTextField jTextField_AD;
    private javax.swing.JTextField jTextField_SOYAD;
    // End of variables declaration//GEN-END:variables
}
