/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent; 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
/**
 *
 * @author asus
 */
public class jabatan extends javax.swing.JDialog {
 DefaultTableModel model = new DefaultTableModel(); 
    /**
     * Creates new form jabatan
     */
    public jabatan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        util.koneksi.koneksi();
        headerTable(); 
        tampilPengguna();
        CenterForm();
        tombol(true); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_kd_jabatan = new javax.swing.JTextField();
        jTextField2_jabatan = new javax.swing.JTextField();
        jTextField3_gaji = new javax.swing.JTextField();
        jButton1_baru = new javax.swing.JButton();
        jButton2_simpan = new javax.swing.JButton();
        jButton3_ubah = new javax.swing.JButton();
        jButton4_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kode Jabatan");

        jLabel2.setText("Jabatan");

        jLabel3.setText("Gaji");

        jTextField1_kd_jabatan.setText("jTextField1_kd_jabatan");

        jTextField2_jabatan.setText("jTextField2_jabatan");

        jTextField3_gaji.setText("jTextField3_gj_pokok");

        jButton1_baru.setText("Baru");
        jButton1_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_baruActionPerformed(evt);
            }
        });

        jButton2_simpan.setText("Simpan");
        jButton2_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_simpanActionPerformed(evt);
            }
        });

        jButton3_ubah.setText("Ubah");
        jButton3_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_ubahActionPerformed(evt);
            }
        });

        jButton4_hapus.setText("Hapus");
        jButton4_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_hapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3_gaji, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTextField2_jabatan)
                            .addComponent(jTextField1_kd_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1_baru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2_simpan)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3_ubah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4_hapus)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_kd_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_baru)
                    .addComponent(jButton2_simpan)
                    .addComponent(jButton3_ubah)
                    .addComponent(jButton4_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_baruActionPerformed
        tombol(true);
        bersih();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1_baruActionPerformed

    private void jButton2_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_simpanActionPerformed
       try {
            util.koneksi.st.executeUpdate( "insert into tbl_jabatan values ('"+jTextField1_kd_jabatan.getText()+"','"+jTextField2_jabatan.getText()+"','"+jTextField3_gaji.getText()+"' )"); 
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan");
            tampilPengguna(); 
            tombol(true); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "eror Simpan : "+e);
        }//blok catch  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_simpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(jTable1.getSelectedColumnCount()==1){ 
            int row = jTable1.getSelectedRow(); 
            jTextField1_kd_jabatan.setText(jTable1.getValueAt(row, 0).toString());
            jTextField2_jabatan.setText(jTable1.getValueAt(row, 1).toString());
            jTextField3_gaji.setText(jTable1.getValueAt(row, 2).toString());
           tombol(true);
        }//blok mause cliked // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_ubahActionPerformed
        try {
            util.koneksi.st.executeUpdate("update tbl_jabatan set jabatan='"+jTextField2_jabatan.getText()+"', gaji='"+jTextField3_gaji.getText()+"' where kode_jabatan = '"+jTextField1_kd_jabatan.getText()+"'");
 
            JOptionPane.showMessageDialog(null,"Berhasil merubah ");
            tampilPengguna();
            tombol(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eror ubah : "+ e);
        }//blok Ubah
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3_ubahActionPerformed

    private void jButton4_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_hapusActionPerformed
        try {
            util.koneksi.st.executeUpdate("delete from tbl_jabatan where kode_jabatan = '"+jTextField1_kd_jabatan.getText()+"' ");
            JOptionPane.showMessageDialog(null,"Berhasil menghapus ");
            tampilPengguna();
            tombol(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Eror Hapus : "+ e); 
        }//blok hapus // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jabatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jabatan dialog = new jabatan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_baru;
    private javax.swing.JButton jButton2_simpan;
    private javax.swing.JButton jButton3_ubah;
    private javax.swing.JButton jButton4_hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_kd_jabatan;
    private javax.swing.JTextField jTextField2_jabatan;
    private javax.swing.JTextField jTextField3_gaji;
    // End of variables declaration//GEN-END:variables

void bersih(){ 
        jTextField1_kd_jabatan.setText(""); 
        jTextField2_jabatan.setText("");      
        jTextField3_gaji.setText("");              
    }//ini blok bersih

void tombol(boolean status){
         jButton1_baru.setEnabled(true);
         jButton2_simpan.setEnabled(status);
         jButton3_ubah.setEnabled(status);
         jButton4_hapus.setEnabled(status);         
     }//blok tombol 

private void headerTable(){
        model =  new DefaultTableModel();
        model.addColumn("Kode Jabatan");
        model.addColumn("Jabatan");
        model.addColumn("Gaji");
        jTable1.setModel(model);
    }//ini blok header 

public void tampilPengguna(){
        model.getDataVector().removeAllElements();
        try {
            ResultSet rs=util.koneksi.st.executeQuery("select * from tbl_jabatan");
            while(rs.next()){
                Object[] data = new Object[3];
                data[0]=(rs.getString(1));
                data[1]=(rs.getString(2));
                data[2]=(rs.getString(3));               
                model.addRow(data);
             }//ini blok while       
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null,"eror tampil  : "+ e);
        } //ini blok catch
        bersih(); 
    }//blok tampil 
private void CenterForm(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
}