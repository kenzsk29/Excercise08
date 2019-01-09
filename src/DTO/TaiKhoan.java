/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author kenz2
 */
@Entity
@Table(name="TaiKhoan")
public class TaiKhoan {
    @Id @GeneratedValue
    @Column(name="mataikhoan")
    private int mataikhoan;
    @Column(name="taikhoan")
    private String taikhoan;
    @Column(name="maukhau")
    private String maukhau;
    
    @OneToMany(mappedBy = "taikhoan")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public TaiKhoan() {
    }

    public TaiKhoan(int mataikhoan, String taikhoan, String maukhau) {
        this.mataikhoan = mataikhoan;
        this.taikhoan = taikhoan;
        this.maukhau = maukhau;
    }

    public int getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(int mataikhoan) {
        this.mataikhoan = mataikhoan;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMaukhau() {
        return maukhau;
    }

    public void setMaukhau(String maukhau) {
        this.maukhau = maukhau;
    }
    
}
