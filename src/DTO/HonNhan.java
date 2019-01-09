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
@Table(name="HonNhan")
public class HonNhan {
    @Id @GeneratedValue
    @Column(name = "mahonnhan")
    private int mahonnhan;
    @Column(name = "honnhan")
    private String honnhan;

    @OneToMany(mappedBy="honnhan")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public HonNhan() {
    }

    public HonNhan(int mahonnhan, String honnhan) {
        this.mahonnhan = mahonnhan;
        this.honnhan = honnhan;
    }

    public int getMahonnhan() {
        return mahonnhan;
    }

    public void setMahonnhan(int mahonnhan) {
        this.mahonnhan = mahonnhan;
    }

    public String getHonnhan() {
        return honnhan;
    }

    public void setHonnhan(String honnhan) {
        this.honnhan = honnhan;
    }

}
