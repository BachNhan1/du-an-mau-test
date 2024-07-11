/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Model_NguoiHoc {
    private String maNH;
    private String hoTen;
    private String maNV;
    //Chú ý: về nguyên tác khi tạo Model phải đủ các thuộc tính trong CSDL
    // Nhưng để tiết kiêm thời gian làm Test có thể chỉ cần lấy các thuộc tính trong form.
//    private String ngaySinh;
//    private String SDT;
//    private String Email;
//    private String ghiChu;    
 //   private String ngayDK;

    public Model_NguoiHoc() {
    }

    public Model_NguoiHoc(String maNH, String hoTen, String maNV) {
        this.maNH = maNH;
        this.hoTen = hoTen;
        this.maNV = maNV;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

   public Object[] getDataRow(){
       return new Object[]{this.getMaNH(),this.getHoTen(),this.getMaNV()};
   }
       
}
