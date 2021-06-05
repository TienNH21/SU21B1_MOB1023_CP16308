/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi4;

import buoi1.Nguoi;
import buoi1.QuanLyDanhSach;
import buoi1.QuanLyInterface;
import buoi1.SinhVien;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tiennh
 */
public class QLSV_JFrame extends javax.swing.JFrame {
    private QuanLyInterface qlsv;

    /**
     * Creates new form QLSV
     */
    public QLSV_JFrame() {
        initComponents();
        
        khoiTaoGiaoDien();
        
        this.qlsv = new QuanLyDanhSach();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        radioGioiTinhNam = new javax.swing.JRadioButton();
        radioGioiTinhNu = new javax.swing.JRadioButton();
        txtQueQuan = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cbbChuyenNganh = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnGhiFile = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        btnTaoDoiTuongAo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã SV");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Giới tính");

        jLabel4.setText("Quê quán");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Chuyên ngành");

        btnGroupGioiTinh.add(radioGioiTinhNam);
        radioGioiTinhNam.setText("Nam");

        btnGroupGioiTinh.add(radioGioiTinhNu);
        radioGioiTinhNu.setText("Nữ");

        cbbChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xóa form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        btnGhiFile.setText("Ghi file");
        btnGhiFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiFileActionPerformed(evt);
            }
        });

        btnDocFile.setText("Đọc file");
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioGioiTinhNam)
                                .addGap(18, 18, 18)
                                .addComponent(radioGioiTinhNu))
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtMaSV))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQueQuan)
                            .addComponent(txtDiaChi)
                            .addComponent(cbbChuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGhiFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDocFile)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(radioGioiTinhNam)
                    .addComponent(radioGioiTinhNu)
                    .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnUpdate)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm)
                    .addComponent(btnGhiFile)
                    .addComponent(btnDocFile))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ Tên", "Giới tính", "Chuyên ngành", "Quê quán", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        btnTaoDoiTuongAo.setText("Tạo đối tượng ảo");
        btnTaoDoiTuongAo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDoiTuongAoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTaoDoiTuongAo))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaoDoiTuongAo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoDoiTuongAoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDoiTuongAoActionPerformed
        // TODO add your handling code here:
        if (this.qlsv.xuatDanhSach().size() == 0) {
            this.qlsv.taoDoiTuongAo();
        }
        
        this.hienThiTable();
    }//GEN-LAST:event_btnTaoDoiTuongAoActionPerformed

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        khoiTaoGiaoDien();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private SinhVien docForm() 
    {
        String hoTen = this.txtHoTen.getText();
        String maSV = this.txtMaSV.getText();
        String queQuan = this.txtQueQuan.getText();
        String diaChi = this.txtDiaChi.getText();

        boolean gtNam = this.radioGioiTinhNam.isSelected();
        int gioiTinh;
//        int gioiTinh = gtNam == true ? 1 : 0;

        if (
            hoTen.length() == 0 ||
            maSV.length() == 0 ||
            queQuan.length() == 0 ||
            diaChi.length() == 0
        ) {
            System.out.println("Không được để trống!");
            
            return null;
        }

        if (gtNam == true) {
            gioiTinh = 1;
        } else {
            gioiTinh = 0;
        }

        String chuyenNganh = (String) this.cbbChuyenNganh.getSelectedItem();
        SinhVien sv = new SinhVien(maSV, chuyenNganh, hoTen, gioiTinh, queQuan, diaChi);

        return sv;
    }
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SinhVien sv = this.docForm();
        
        if (sv == null) {
            return ;
        }
        
        // Thêm SV vào ArrayList
        this.qlsv.them(sv);
        
        this.hienThiTable();
        
        this.khoiTaoGiaoDien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        int viTri = this.tblSinhVien.getSelectedRow();
        
        if (viTri == -1) {
            return ;
        }
        
        DefaultTableModel dtm = (DefaultTableModel) this.tblSinhVien.getModel();
        String maSV = (String) dtm.getValueAt(viTri, 0);
        String hoTen = (String) dtm.getValueAt(viTri, 1);
        Integer gioiTinh = (Integer) dtm.getValueAt(viTri, 2);
        String chuyenNganh = (String) dtm.getValueAt(viTri, 3);
        String queQuan = (String) dtm.getValueAt(viTri, 4);
        String diaChi = (String) dtm.getValueAt(viTri, 5);
        
        this.txtHoTen.setText(hoTen);
        this.txtMaSV.setText(maSV);
        this.txtDiaChi.setText(diaChi);
        this.txtQueQuan.setText(queQuan);
        
        this.cbbChuyenNganh.setSelectedItem(chuyenNganh);
        
        if(gioiTinh == 1) {
            this.radioGioiTinhNam.setSelected(true);
        } else {
            this.radioGioiTinhNu.setSelected(true);
        }
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int viTri = this.tblSinhVien.getSelectedRow();
        
        if (viTri == -1) {
            return ;
        }
        
        this.qlsv.xoa(viTri);
        this.hienThiTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int viTri = this.tblSinhVien.getSelectedRow();
        
        if (viTri == -1) {
            return ;
        }
        
        SinhVien sv = this.docForm();
        
        if (sv == null) {
            return ;
        }
        
        this.qlsv.xuatDanhSach().set(viTri, sv);
        this.hienThiTable();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGhiFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiFileActionPerformed
        // Đọc dữ liệu từ ArrayList trong qlsv
        // Dùng ObjectOutputStream để ghi vào file
    }//GEN-LAST:event_btnGhiFileActionPerformed

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        String filename = "src/main/java/buoi1/data.txt";
        ArrayList<Nguoi> list = new ArrayList<>();
        
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            while ( ois.available() != 0 ) {
                SinhVien sv = (SinhVien) ois.readObject();
                list.add(sv);
            }

            fis.close();
            ois.close();
            this.qlsv.setDanhSach(list);
            this.hienThiTable();
        } catch (Exception e) {
            System.out.println("Đọc file thất bại");
            e.printStackTrace();
        }
        
        this.hienThiTable();
    }//GEN-LAST:event_btnDocFileActionPerformed

    private void hienThiTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) this.tblSinhVien.getModel();

        // Xóa toàn bộ dữ liệu đang có trên Jtable
        dtm.setRowCount(0);

        // Lấy ra ArrayList trong QuanLyDanhSach
        List<Nguoi> dssv = this.qlsv.xuatDanhSach();
        
        for (int i = 0; i < dssv.size(); i++) {
            SinhVien sv = (SinhVien) dssv.get(i);
            
            Object[] rowData = new Object[] {
                sv.getMaSV(),
                sv.getHoTen(),
                sv.getGioiTinh(),
                sv.getChuyenNganh(),
                sv.getQueQuan(),
                sv.getDiaChi(),
            };
            
            dtm.addRow(rowData);
        }
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
            java.util.logging.Logger.getLogger(QLSV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSV_JFrame().setVisible(true);
            }
        });
    }
    
    private void khoiTaoGiaoDien()
    {
        this.txtHoTen.setText("");
        this.txtMaSV.setText("");
        this.txtQueQuan.setText("");
        this.txtDiaChi.setText("");
        
        this.radioGioiTinhNam.setSelected(true);
        
        this.cbbChuyenNganh.removeAllItems();
        this.cbbChuyenNganh.addItem("LTMT");
        this.cbbChuyenNganh.addItem("UDPM");
        this.cbbChuyenNganh.addItem("TKTW");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGhiFile;
    private javax.swing.ButtonGroup btnGroupGioiTinh;
    private javax.swing.JButton btnTaoDoiTuongAo;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.JComboBox<String> cbbChuyenNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioGioiTinhNam;
    private javax.swing.JRadioButton radioGioiTinhNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtQueQuan;
    // End of variables declaration//GEN-END:variables
}
