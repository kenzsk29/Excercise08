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
@Table(name="DCSVN")
public class DCSVN {
    @Id @GeneratedValue
    @Column(name="madcsvn")
    private int madcsvn;
    @Column(name="ngaygianhap")
    private String ngaygianhap;
    @Column(name="chucvu")
    private String chucvu;
    @Column(name="noisinhhoat")
    private String noisinhhoat;
    
    @OneToMany(mappedBy="dcsvn")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }

    public DCSVN() {
    }

    public DCSVN(int madcsvn, String ngaygianhap, String chucvu, String noisinhhoat) {
        this.madcsvn = madcsvn;
        this.ngaygianhap = ngaygianhap;
        this.chucvu = chucvu;
        this.noisinhhoat = noisinhhoat;
    }

    public int getMadcsvn() {
        return madcsvn;
    }

    public void setMadcsvn(int madcsvn) {
        this.madcsvn = madcsvn;
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
