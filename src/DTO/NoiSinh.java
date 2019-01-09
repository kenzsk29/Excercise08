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
@Table(name="NoiSinh")
public class NoiSinh {
    @Id @GeneratedValue
    @Column(name="manoisinh")
    private int manoisinh;
    @Column(name="noisinh")
    private String noisinh;
    
    @OneToMany(mappedBy = "noisinh")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    

    public NoiSinh() {
    }

    public NoiSinh(int manoisinh, String noisinh) {
        this.manoisinh = manoisinh;
        this.noisinh = noisinh;
    }

    public int getManoisinh() {
        return manoisinh;
    }

    public void setManoisinh(int manoisinh) {
        this.manoisinh = manoisinh;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }
    
}
