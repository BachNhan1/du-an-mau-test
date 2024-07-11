/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1_sof2041;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Repositories_NguoiHoc {

    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repositories_NguoiHoc() {
        con = DBConnect.getConnection();
    }

    public ArrayList<Model_NguoiHoc> getAll() {
        ArrayList<Model_NguoiHoc> list_NguoiHoc = new ArrayList<>();
        sql = "select manh,hoten,manv from NguoiHoc";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maNH, maNV, hoTen;
                maNH = rs.getString(1);
                hoTen = rs.getString(2);
                maNV = rs.getString(3);
                list_NguoiHoc.add(new Model_NguoiHoc(maNH, hoTen, maNV));
            }
            return list_NguoiHoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int themNH(Model_NguoiHoc n_hoc) {
        sql = "insert into nguoihoc(manh,hoten,manv) values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, n_hoc.getMaNH());
            ps.setObject(2, n_hoc.getHoTen());
            ps.setObject(3, n_hoc.getMaNV());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public ArrayList<Model_NguoiHoc> checkTrungMaNH(String ma){
        ArrayList<Model_NguoiHoc> list_NguoiHoc = new ArrayList<>();
        sql = "select manh,hoten,manv from NguoiHoc where manh=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maNH, maNV, hoTen;
                maNH = rs.getString(1);
                hoTen = rs.getString(2);
                maNV = rs.getString(3);
                list_NguoiHoc.add(new Model_NguoiHoc(maNH, hoTen, maNV));
            }
            return list_NguoiHoc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
