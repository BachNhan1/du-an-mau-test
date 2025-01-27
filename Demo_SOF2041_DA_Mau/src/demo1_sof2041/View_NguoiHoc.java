/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class View_NguoiHoc extends javax.swing.JFrame {

    private Repositories_NguoiHoc R_NH = new Repositories_NguoiHoc();
    private Repositories_NhanVien R_NV = new Repositories_NhanVien();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;// chỉ số dòng trong bảng

    /**
     * Creates new form View_NguoiHoc
     */
    public View_NguoiHoc() {
        initComponents();
        // xóa dữ liệu cũ trong combo
        cbo_Manhanvien.removeAllItems();
        // load toàn bộ mã nhân viên vào combo
        for (Model_NhanVien x : R_NV.getAll()) {
            cbo_Manhanvien.addItem(x.getMaNV().toString());
        }
        // đẩy dl ra bảng người học
        this.fillTable(R_NH.getAll());
    }
    
    void fillTable(ArrayList<Model_NguoiHoc> list) {
        mol = (DefaultTableModel) tbl_NguoiHoc.getModel();
        mol.setRowCount(0);
        for (Model_NguoiHoc x : list) {
            mol.addRow(x.getDataRow());
        }
    }
    
    void showData(int i) {
        txt_MaNguoiHoc.setText(tbl_NguoiHoc.getValueAt(i, 0).toString());
        txt_TenNguoiHoc.setText(tbl_NguoiHoc.getValueAt(i, 1).toString());
        cbo_Manhanvien.setSelectedItem(tbl_NguoiHoc.getValueAt(i, 2).toString());
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
        txt_MaNguoiHoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_TenNguoiHoc = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbo_Manhanvien = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_Sưa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_NguoiHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("QUẢN LÝ NGƯỜI HỌC - LẤY DL TỪ DATABASE AS_MÔN DỰ ÁN MẪU");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Mã người học");

        txt_MaNguoiHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Mã nhân viên");

        txt_TenNguoiHoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_Them.setBackground(new java.awt.Color(102, 255, 51));
        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Họ tên");

        cbo_Manhanvien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Load form có sẵn các dl từ Database \n lên bảng (3đ)\n2. Trên form có sẵn dl dòng thứ 2.(1đ)\n3. Load hết dl từ bảng NHANVIEN\n lên combo mã nhân viên (2đ)\n5. Thêm dl từ form vào Database (1.5đ)\n6. Sửa DL lưu vào Database (1.5đ)\n7.Check dl khi thêm/ sửa (1đ)\n");
        jScrollPane1.setViewportView(jTextArea1);

        btn_Sưa.setBackground(new java.awt.Color(102, 255, 51));
        btn_Sưa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Sưa.setText("Sửa");

        tbl_NguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã người học", "Họ tên", "Mã nhân viên	"
            }
        ));
        tbl_NguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NguoiHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_NguoiHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Sưa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_TenNguoiHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(cbo_Manhanvien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_MaNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel4)
                    .addContainerGap(829, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_MaNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_TenNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbo_Manhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_Them)
                        .addGap(28, 28, 28)
                        .addComponent(btn_Sưa))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(jLabel4)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_NguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NguoiHocMouseClicked
        // TODO add your handling code here:
        i = tbl_NguoiHoc.getSelectedRow();
        this.showData(i);
    }//GEN-LAST:event_tbl_NguoiHocMouseClicked

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        // TODO add your handling code here:

        if (R_NH.checkTrungMaNH(txt_MaNguoiHoc.getText().trim()).isEmpty()) {
            if (this.R_NH.themNH(this.readForm()) > 0) {
                JOptionPane.showMessageDialog(this, "them thanh cong");
                this.fillTable(R_NH.getAll());
            } else {
                JOptionPane.showMessageDialog(this, "them that bai");
            }
        } else {
            JOptionPane.showMessageDialog(this, "them that bai, trung ma");
        }
    }//GEN-LAST:event_btn_ThemActionPerformed
    Model_NguoiHoc readForm() {
        return new Model_NguoiHoc(txt_MaNguoiHoc.getText().trim(),
                txt_TenNguoiHoc.getText().trim(),
                cbo_Manhanvien.getSelectedItem().toString());
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
            java.util.logging.Logger.getLogger(View_NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_NguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_NguoiHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sưa;
    private javax.swing.JButton btn_Them;
    private javax.swing.JComboBox<String> cbo_Manhanvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_NguoiHoc;
    private javax.swing.JTextField txt_MaNguoiHoc;
    private javax.swing.JTextField txt_TenNguoiHoc;
    // End of variables declaration//GEN-END:variables
}
