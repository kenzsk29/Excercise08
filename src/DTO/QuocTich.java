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
@Table(name="QuocTich")
public class QuocTich {
    @Id @GeneratedValue
    @Column(name="maquoctich")
    private int maquoctich;
    @Column(name="quoctich")
    private String quoctich;
    
    @OneToMany(mappedBy = "quoctich")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }

    
    public QuocTich() {
    }

    public QuocTich(int maquoctich, String quoctich) {
        this.maquoctich = maquoctich;
        this.quoctich = quoctich;
    }

    public int getMaquoctich() {
        return maquoctich;
    }

    public void setMaquoctich(int maquoctich) {
        this.maquoctich = maquoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    
}
