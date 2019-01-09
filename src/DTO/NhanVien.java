/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author kenz2
 */
@Entity
@Table(name="NhanVien")
public class NhanVien {
    @Id @GeneratedValue
    @Column(name="manhanvien")
    private int manhanvien;
    @Column(name="hoten")
    private String hoten;
    @Column(name="ten")
    private String ten;
    @Column(name="ngaysinh")
    private String ngaysinh;
    
    @ManyToOne @JoinColumn(name="manguyenquan", nullable= false)
    private NguyenQuan nguyenquan;
    @Column(name="sotaikhoan")
    private int sotaikhoan;
    @Column(name="msthue")
    private int msthue;
    
    @Column(name="dienthoai")
    private int dienthoai;
    @Column(name="cmnd")
    private int cmnd;
    @Column(name="didong")
    private int didong;
    @ManyToOne @JoinColumn(name="madantoc", nullable= false)
    private DanToc dantoc;
    @ManyToOne @JoinColumn(name="madcsvn", nullable= false)
    private DCSVN dcsvn;
    @ManyToOne @JoinColumn(name="madoanthanh", nullable= false)
    private DoanThanhNien doanthanhnien;
    
    @ManyToOne @JoinColumn(name="mahocvan", nullable= false)
    private HocVan hocvan;
    @ManyToOne @JoinColumn(name="mahokhau", nullable= false)
    private HoKhau hokhau;
    @ManyToOne @JoinColumn(name="mahonnhan", nullable= false)
    private HonNhan honnhan;
    @ManyToOne @JoinColumn(name="manoicap", nullable= false)
    private NoiCap noicap;
    @ManyToOne @JoinColumn(name="manoisinh", nullable= false)
    private NoiSinh noisinh;
    
    @ManyToOne @JoinColumn(name="maquan", nullable= false)
    private Quan quan;
    @ManyToOne @JoinColumn(name="maquandoi", nullable= false)
    private QuanDoi quandoi;
    @ManyToOne @JoinColumn(name="maquoctich", nullable= false)
    private QuocTich quoctich;
    @ManyToOne @JoinColumn(name="mataikhoan", nullable= false)
    private TaiKhoan taikhoan;
    @ManyToOne @JoinColumn(name="mavanhoa", nullable= false)
    private VanHoa vanhoa;
    
    @ManyToOne @JoinColumn(name="matongiao", nullable= false)
    private TonGiao tongiao;
    @Column(name="ngaycap")
    private String ngaycap;
    @Column(name="thuongchu")
    private String thuongchu;
    @Column(name="anh")
    private String anh;
    @Column(name="ghichu")
    private String ghichu;
    @Column(name="gioitinh")
    private boolean gioitinh;
    @Column(name="tamtru")
    private String tamtru;
    @Column(name="email")
    private String email;

    public NhanVien() {
    }

    public NhanVien(int manhanvien, String hoten, String ten, String ngaysinh, int sotaikhoan, int msthue, int dienthoai, int cmnd, int didong, String ngaycap, String thuongchu, String anh, String ghichu, boolean gioitinh, String tamtru, String email) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.sotaikhoan = sotaikhoan;
        this.msthue = msthue;
        this.dienthoai = dienthoai;
        this.cmnd = cmnd;
        this.didong = didong;
        this.ngaycap = ngaycap;
        this.thuongchu = thuongchu;
        this.anh = anh;
        this.ghichu = ghichu;
        this.gioitinh = gioitinh;
        this.tamtru = tamtru;
        this.email = email;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(int sotaikhoan) {
        this.sotaikhoan = sotaikhoan;
    }

    public int getMsthue() {
        return msthue;
    }

    public void setMsthue(int msthue) {
        this.msthue = msthue;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getDidong() {
        return didong;
    }

    public void setDidong(int didong) {
        this.didong = didong;
    }

    public String getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(String ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getThuongchu() {
        return thuongchu;
    }

    public void setThuongchu(String thuongchu) {
        this.thuongchu = thuongchu;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTamtru() {
        return tamtru;
    }

    public void setTamtru(String tamtru) {
        this.tamtru = tamtru;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NguyenQuan getNguyenquan() {
        return nguyenquan;
    }

    public DanToc getDantoc() {
        return dantoc;
    }

    public DCSVN getDcsvn() {
        return dcsvn;
    }

    public DoanThanhNien getDoanthanhnien() {
        return doanthanhnien;
    }

    public HocVan getHocvan() {
        return hocvan;
    }

    public HoKhau getHokhau() {
        return hokhau;
    }

    public HonNhan getHonnhan() {
        return honnhan;
    }

    public NoiCap getNoicap() {
        return noicap;
    }

    public NoiSinh getNoisinh() {
        return noisinh;
    }

    public Quan getQuan() {
        return quan;
    }

    public QuanDoi getQuandoi() {
        return quandoi;
    }

    public QuocTich getQuoctich() {
        return quoctich;
    }

    public TaiKhoan getTaikhoan() {
        return taikhoan;
    }

    public VanHoa getVanhoa() {
        return vanhoa;
    }

    public TonGiao getTongiao() {
        return tongiao;
    }
    
    
    

    
    
    
}
