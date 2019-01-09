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
@Table(name="TonGiao")
public class TonGiao {
    @Id @GeneratedValue
    @Column(name="matongiao")
    private int matongiao;
    @Column(name="tongiao")
    private String tongiao;
    
    @OneToMany(mappedBy = "TonGiao")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    

    public TonGiao() {
    }

    public TonGiao(int matongiao, String tongiao) {
        this.matongiao = matongiao;
        this.tongiao = tongiao;
    }

    public int getMatongiao() {
        return matongiao;
    }

    public void setMatongiao(int matongiao) {
        this.matongiao = matongiao;
    }

    public String getTongiao() {
        return tongiao;
    }

    public void setTongiao(String tongiao) {
        this.tongiao = tongiao;
    }
    
}
