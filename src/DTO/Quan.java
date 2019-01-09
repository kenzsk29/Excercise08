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
@Table(name="Quan")
public class Quan {
    @Id @GeneratedValue
    @Column(name="maquan")
    private int maquan;
    @Column(name="quan")
    private String quan;
    
    @OneToMany(mappedBy = "quan")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public Quan() {
    }

    public Quan(int maquan, String quan) {
        this.maquan = maquan;
        this.quan = quan;
    }

    public int getMaquan() {
        return maquan;
    }

    public void setMaquan(int maquan) {
        this.maquan = maquan;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }
    
}
