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
@Table(name="DanToc")
public class DanToc {
    @Id @GeneratedValue
    @Column(name="madantoc")
    private int madantoc;
    @Column(name="dantoc")
    private String dantoc;
    
    @OneToMany(mappedBy = "dantoc")
    private Set<NhanVien>emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }

    public DanToc() {
    }

    public DanToc(int madantoc, String dantoc, Set<NhanVien> emps) {
        this.madantoc = madantoc;
        this.dantoc = dantoc;
        this.emps = emps;
    }

    public int getMadantoc() {
        return madantoc;
    }

    public void setMadantoc(int madantoc) {
        this.madantoc = madantoc;
    }

    public String getDantoc() {
        return dantoc;
    }

    public void setDantoc(String dantoc) {
        this.dantoc = dantoc;
    }

    
}
