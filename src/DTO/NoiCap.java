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
@Table(name="NoiCap")
public class NoiCap {
    @Id @GeneratedValue
    @Column(name="manoicap")
    private int manoicap;
    @Column(name="noicap")
    private String noicap;
    
    @OneToMany(mappedBy = "noicap")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public NoiCap() {
    }

    public NoiCap(int manoicap, String noicap) {
        this.manoicap = manoicap;
        this.noicap = noicap;
    }

    public int getManoicap() {
        return manoicap;
    }

    public void setManoicap(int manoicap) {
        this.manoicap = manoicap;
    }

    public String getNoicap() {
        return noicap;
    }

    public void setNoicap(String noicap) {
        this.noicap = noicap;
    }
    
}
