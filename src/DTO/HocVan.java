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
@Table(name="HocVan")
public class HocVan {
    @Id @GeneratedValue
    @Column(name="mahocvan")
    private int mahocvan;
    @Column(name="hocvan")
    private String hocvan;

    @OneToMany(mappedBy = "hocvan")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public HocVan() {
    }

    public HocVan(int mahocvan, String hocvan) {
        this.mahocvan = mahocvan;
        this.hocvan = hocvan;
    }

    public int getMahocvan() {
        return mahocvan;
    }

    public void setMahocvan(int mahocvan) {
        this.mahocvan = mahocvan;
    }

    public String getHocvan() {
        return hocvan;
    }

    public void setHocvan(String hocvan) {
        this.hocvan = hocvan;
    }
    
}
