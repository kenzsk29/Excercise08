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
@Table(name="DoanThanhNien")
public class DoanThanhNien {
    @Id @GeneratedValue
    @Column(name="madoanthanh")
    private int madoanthanh;
    @Column(name="ngaygianhap")
    private String ngaygianhap;
    @Column(name="chucvu")
    private String chucvu;
    @Column(name="noisinhhoat")
    private String noisinhhoat;
    
    @OneToMany(mappedBy = "doanthanhnien")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public DoanThanhNien() {
    }

    public DoanThanhNien(int madoanthanh, String ngaygianhap, String chucvu, String noisinhhoat) {
        this.madoanthanh = madoanthanh;
        this.ngaygianhap = ngaygianhap;
        this.chucvu = chucvu;
        this.noisinhhoat = noisinhhoat;
    }

    public int getMadoanthanh() {
        return madoanthanh;
    }

    public void setMadoanthanh(int madoanthanh) {
        this.madoanthanh = madoanthanh;
    }

    public String getNgaygianhap() {
        return ngaygianhap;
    }

    public void setNgaygianhap(String ngaygianhap) {
        this.ngaygianhap = ngaygianhap;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getNoisinhhoat() {
        return noisinhhoat;
    }

    public void setNoisinhhoat(String noisinhhoat) {
        this.noisinhhoat = noisinhhoat;
    }
    
}
