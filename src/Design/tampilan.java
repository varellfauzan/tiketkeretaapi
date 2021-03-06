/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * tampilan.java
 *
 * Created on Nov 27, 2018, 7:33:30 AM
 */
package Design;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

import koneksi.koneksi;
/**
 *
 * @author Cax
 */
public class tampilan extends javax.swing.JFrame {

    /** Creates new form tampilan */
    public Connection conn = new koneksi().connect();
    DefaultTableModel tabmode;
//    Membuat Array list dengan nama variabel dibawah ini
    ArrayList<String> namaKereta = new ArrayList<>();
    ArrayList<String> keberangkatanKereta = new ArrayList<>();
    ArrayList<String> hargaTiket = new ArrayList<>();
    
    public void table()
    {
        Object[] baris = {"Nama Kereta", "Jadwal Berangkat", "Harga"};
        tabmode = new DefaultTableModel(null, baris);
        tblTiket.setModel(tabmode);
        
        String query = "select nama_kereta, Keberangkatan, harga from kereta,keberangkatan where kereta.id_kereta = keberangkatan.id_kereta";
        try {
            Statement stmt = conn.createStatement();
            ResultSet hasil = stmt.executeQuery(query);
            
            while(hasil.next())
            {
//                menghapus array list tiap ada perulangan
                namaKereta.clear();
                keberangkatanKereta.clear();
                hargaTiket.clear();
                int index = 0;
                
//                menambahkan data ke array list dengan data seperti didatabase
                namaKereta.add(hasil.getString("nama_kereta"));
                keberangkatanKereta.add(hasil.getString("Keberangkatan"));
                hargaTiket.add(hasil.getString("harga"));
                
//                menampulkan data dari array list
                String data[] = {namaKereta.get(index), keberangkatanKereta.get(index), hargaTiket.get(index)};
                tabmode.addRow(data);
                index++;
            }
        } catch (Exception e) {
        }
    }
    
    public tampilan() {
        initComponents();
        table();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtjadwal = new javax.swing.JTextField();
        txtkereta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTiket = new javax.swing.JTable();
        txtpembayaran = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtjumlahtiket = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cetak = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TIKET KERETA API");

        jLabel2.setText("Nama");

        jLabel3.setText("Jadwal");

        jLabel4.setText("Nama Kereta");

        jLabel5.setText("Pembayaran");

        tblTiket.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTiketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTiket);

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        jLabel6.setText("Harga");

        txtjumlahtiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahtiketActionPerformed(evt);
            }
        });
        txtjumlahtiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtjumlahtiketKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlahtiketKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjumlahtiketKeyTyped(evt);
            }
        });

        jLabel7.setText("Jumlah tiket");

        cetak.setText("CETAK");

        jLabel8.setText("Total Bayar ");

        labelTotalHarga.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cetak))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(32, 32, 32)
                                .addComponent(txtpembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTotalHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtjadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtkereta, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtjumlahtiket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtjadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtkereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjumlahtiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cetak)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tblTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTiketMouseClicked
// TODO add your handling code here:
    int baris = tblTiket.getSelectedRow();
    
    String dataNamaKereta = tabmode.getValueAt(baris, 0).toString();
    String jadwalBerangkat = tabmode.getValueAt(baris, 1).toString();
    String harga = tabmode.getValueAt(baris, 2).toString();
    
    txtkereta.setText(dataNamaKereta);
    txtjadwal.setText(jadwalBerangkat);
    txtharga.setText(harga);
}//GEN-LAST:event_tblTiketMouseClicked

private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txthargaActionPerformed

private void txtjumlahtiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahtiketActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtjumlahtiketActionPerformed

private void txtjumlahtiketKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahtiketKeyPressed
// TODO add your handling code here:
//    int harga = Integer.parseInt(txtharga.getText());
    
    
//    int total_bayar = harga * jumlah;
//    
//    String total = Integer.toString(total_bayar);
//    
//    labelTotalHarga.setText(total);
}//GEN-LAST:event_txtjumlahtiketKeyPressed

private void txtjumlahtiketKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahtiketKeyTyped
// TODO add your handling code here:
    
}//GEN-LAST:event_txtjumlahtiketKeyTyped

private void txtjumlahtiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahtiketKeyReleased
// TODO add your handling code here:
    
//    jika jumlah tiket kosong maka total bayar 0
   if(txtjumlahtiket.getText().equals(""))
   {
       labelTotalHarga.setText("0");
   }
   else
   {
//       jika jumlah tiket ada isinya maka total bayar ada isinya
        String jumlah = txtjumlahtiket.getText();
    String harga = txtharga.getText();
    
    int total = Integer.parseInt(harga) * Integer.parseInt(jumlah);
//    System.out.println(total);
    
    String total_bayar = Integer.toString(total);
    
    labelTotalHarga.setText(total_bayar);
   }
}//GEN-LAST:event_txtjumlahtiketKeyReleased

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
            java.util.logging.Logger.getLogger(tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new tampilan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cetak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JTable tblTiket;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtjadwal;
    private javax.swing.JTextField txtjumlahtiket;
    private javax.swing.JTextField txtkereta;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpembayaran;
    // End of variables declaration//GEN-END:variables
}
