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
@Table(name="QuanDoi")
public class QuanDoi {
    @Id @GeneratedValue
    @Column(name="maquandoi")
    private int maquandoi;
    @Column(name="ngaynhapngu")
    private String ngaynhapngu;
    @Column(name="ngayxuatngu")
    private String ngayxuatngu;
    @Column(name="noisinhhoat")
    private String noisinhhoat;
    
    @OneToMany(mappedBy = "quandoi")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    

    public QuanDoi() {
    }

    public QuanDoi(int maquandoi, String ngaynhapngu, String ngayxuatngu, String noisinhhoat) {
        this.maquandoi = maquandoi;
        this.ngaynhapngu = ngaynhapngu;
        this.ngayxuatngu = ngayxuatngu;
        this.noisinhhoat = noisinhhoat;
    }

    public int getMaquandoi() {
        return maquandoi;
    }

    public void setMaquandoi(int maquandoi) {
        this.maquandoi = maquandoi;
    }

    public String getNgaynhapngu() {
        return ngaynhapngu;
    }

    public void setNgaynhapngu(String ngaynhapngu) {
        this.ngaynhapngu = ngaynhapngu;
    }

    public String getNgayxuatngu() {
        return ngayxuatngu;
    }

    public void setNgayxuatngu(String ngayxuatngu) {
        this.ngayxuatngu = ngayxuatngu;
    }

    public String getNoisinhhoat() {
        return noisinhhoat;
    }

    public void setNoisinhhoat(String noisinhhoat) {
        this.noisinhhoat = noisinhhoat;
    }
    
}
