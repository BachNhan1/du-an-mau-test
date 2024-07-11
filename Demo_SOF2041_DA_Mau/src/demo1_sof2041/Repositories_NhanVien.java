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
public class Repositories_NhanVien {

    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repositories_NhanVien() {
      con=DBConnect.getConnection();
    }
    
    public ArrayList<Model_NhanVien> getAll() {
        ArrayList<Model_NhanVien> list_NhanVien = new ArrayList<>();
        sql="select manv from Nhanvien";
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
               String maNV;
               maNV=rs.getString(1);
               list_NhanVien.add(new Model_NhanVien(maNV));
            }
            return list_NhanVien;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        }

    }
