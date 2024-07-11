/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;

/**
 *
 * @author ADMIN
 */
public class Model_NhanVien {
    private String maNV;
     //Chú ý: về nguyên tác khi tạo Model phải đủ các thuộc tính trong CSDL
    // Nhưng để tiết kiêm thời gian làm Test có thể chỉ cần lấy các thuộc tính trong form.
// private String matKhau;
// private String hoTen;
// private boolean vaiTro;

    public Model_NhanVien() {
    }

    public Model_NhanVien(String maNV) {
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    
    
}
