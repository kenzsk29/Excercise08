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
@Table(name = "VanHoa")
public class VanHoa {
    @Id @GeneratedValue
    @Column(name="mavanhoa")
    private int mavanhoa;
    @Column(name="vanhoa")
    private String vanhoa;

    @OneToMany(mappedBy = "vanhoa")
    private Set<NhanVien> emps;

    public Set<NhanVien> getEmps() {
        return emps;
    }
    
    public VanHoa() {
    }

    public VanHoa(int mavanhoa, String vanhoa) {
        this.mavanhoa = mavanhoa;
        this.vanhoa = vanhoa;
    }

    public int getMavanhoa() {
        return mavanhoa;
    }

    public void setMavanhoa(int mavanhoa) {
        this.mavanhoa = mavanhoa;
    }

    public String getVanhoa() {
        return vanhoa;
    }

    public void setVanhoa(String vanhoa) {
        this.vanhoa = vanhoa;
    }
    
}
