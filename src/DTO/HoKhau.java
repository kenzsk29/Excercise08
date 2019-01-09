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
@Table(name="HoKhau")
public class HoKhau {
    @Id @GeneratedValue
    @Column(name="mahokhau")
    private int mahokhau;
    @Column(name="hokhau")
    private String hokhau;
    
    @OneToMany(mappedBy = "hokhau")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }

    public HoKhau() {
    }

    public HoKhau(int mahokhau, String hokhau, Set<NhanVien> emps) {
        this.mahokhau = mahokhau;
        this.hokhau = hokhau;
        this.emps = emps;
    }

    public int getMahokhau() {
        return mahokhau;
    }

    public void setMahokhau(int mahokhau) {
        this.mahokhau = mahokhau;
    }

    public String getHokhau() {
        return hokhau;
    }

    public void setHokhau(String hokhau) {
        this.hokhau = hokhau;
    }
    
    
    
}
