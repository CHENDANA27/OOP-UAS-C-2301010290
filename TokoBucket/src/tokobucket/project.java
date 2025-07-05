/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokobucket;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class project extends javax.swing.JFrame {
    public project() {
        initComponents();
        load_tabel();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        formNama = new javax.swing.JTextField();
        formJumlah = new javax.swing.JTextField();
        formJenis = new javax.swing.JComboBox<>();
        formTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        formCatatan = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Pelanggan");

        jLabel2.setText("Jenis Bucket");

        jLabel3.setText("Jumlah");

        jLabel4.setText("Tanggal Pesan");

        formNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaActionPerformed(evt);
            }
        });

        formJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formJumlahActionPerformed(evt);
            }
        });

        formJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bucket Bunga", "Bucket Snack", "Bucket Uang" }));
        formJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formJenisActionPerformed(evt);
            }
        });

        formTanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formTanggalMouseClicked(evt);
            }
        });

        formCatatan.setColumns(20);
        formCatatan.setRows(5);
        formCatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formCatatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(formCatatan);

        jLabel6.setText("Catatan");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(formTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formJumlah)
                    .addComponent(formJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formNama, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(formNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(formJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(formJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(formTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(btnEdit)
                            .addComponent(btnHapus))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNamaActionPerformed

    private void formJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formJenisActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int row = tabel.getSelectedRow();
        if (row == -1) {
            return;
        }

        try {
            int id = Integer.parseInt(tabel.getValueAt(row, 0).toString());

            String sql = "UPDATE pesanan SET nama_pelanggan=?, jenis_bucket=?, jumlah=?, tanggal_pesan=?, catatan=? WHERE id_pesanan=?";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, formNama.getText());
            pst.setString(2, formJenis.getSelectedItem().toString());
            pst.setInt(3, Integer.parseInt(formJumlah.getText()));
            pst.setDate(4, new java.sql.Date(formTanggal.getDate().getTime()));
            pst.setString(5, formCatatan.getText());
            pst.setInt(6, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            load_tabel();
            resetForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int row = tabel.getSelectedRow();
        if (row == -1) {
            return;
        }

        try {
            int id = Integer.parseInt(tabel.getValueAt(row, 0).toString());

            String sql = "DELETE FROM pesanan WHERE id_pesanan=?";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            load_tabel();
            resetForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void formJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formJumlahActionPerformed

    private void formTanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formTanggalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formTanggalMouseClicked

    private void formCatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formCatatanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formCatatanMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            String sql = "INSERT INTO pesanan (nama_pelanggan, jenis_bucket, jumlah, tanggal_pesan, catatan) VALUES (?, ?, ?, ?, ?)";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, formNama.getText());
            pst.setString(2, formJenis.getSelectedItem().toString());
            pst.setInt(3, Integer.parseInt(formJumlah.getText()));
            pst.setDate(4, new java.sql.Date(formTanggal.getDate().getTime()));
            pst.setString(5, formCatatan.getText());

            pst.execute();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            load_tabel();
            resetForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int row = tabel.getSelectedRow();
        // Ambil data dari kolom tabel
        formNama.setText(tabel.getValueAt(row, 2).toString());
        formJenis.setSelectedItem(tabel.getValueAt(row, 3).toString());
        formJumlah.setText(tabel.getValueAt(row, 4).toString());
        formTanggal.setDate(java.sql.Date.valueOf(tabel.getValueAt(row, 5).toString()));
        formCatatan.setText(tabel.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tabelMouseClicked
    private void load_tabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");  // kolom tersembunyi
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Jenis");
        model.addColumn("Jumlah");
        model.addColumn("Tanggal");
        model.addColumn("Catatan");

        try {
            String sql = "SELECT * FROM pesanan";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            int no = 1;

            while (res.next()) {
                model.addRow(new Object[]{
                    res.getInt("id_pesanan"), // tetap simpan
                    no++,
                    res.getString("nama_pelanggan"),
                    res.getString("jenis_bucket"),
                    res.getInt("jumlah"),
                    res.getDate("tanggal_pesan"),
                    res.getString("catatan")
                });
            }
            tabel.setModel(model);

            // Sembunyikan kolom ID (kolom ke-0)
            tabel.getColumnModel().getColumn(0).setMinWidth(0);
            tabel.getColumnModel().getColumn(0).setMaxWidth(0);
            tabel.getColumnModel().getColumn(0).setWidth(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void resetForm() {
        formNama.setText("");
        formJenis.setSelectedIndex(0);
        formJumlah.setText("");
        formTanggal.setDate(null);
        formCatatan.setText("");
    }

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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextArea formCatatan;
    private javax.swing.JComboBox<String> formJenis;
    private javax.swing.JTextField formJumlah;
    private javax.swing.JTextField formNama;
    private com.toedter.calendar.JDateChooser formTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

}
