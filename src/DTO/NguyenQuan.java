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
@Table(name="NguyenQuan")
public class NguyenQuan {
    @Id @GeneratedValue
    @Column(name="manguyenquan")
    private int manguyenquan;
    @Column(name="nguyenquan")
    private String nguyenquan;
    @OneToMany(mappedBy = "nguyenquan")
    private Set<NhanVien> emps;

    public NguyenQuan() {
    }

    public NguyenQuan(int manguyenquan, String nguyenquan) {
        this.manguyenquan = manguyenquan;
        this.nguyenquan = nguyenquan;
    }

    public int getManguyenquan() {
        return manguyenquan;
    }

    public void setManguyenquan(int manguyenquan) {
        this.manguyenquan = manguyenquan;
    }

    public String getNguyenquan() {
        return nguyenquan;
    }

    public void setNguyenquan(String nguyenquan) {
        this.nguyenquan = nguyenquan;
    }
    
}
