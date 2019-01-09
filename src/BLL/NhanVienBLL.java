package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVien;
import java.util.List;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenz2
 */
public class NhanVienBLL {
	private NhanVienDAL dal;
	
	public NhanVienBLL() {
		dal = new NhanVienDAL();
	}

	public List<NhanVien> listAll()  {
		return dal.list();
	}
	
	public Integer save(NhanVien nv) throws Exception {		            
            return dal.save(nv);		                          
	}
	
	public void delete(NhanVien nv) throws Exception {
		dal.delete(nv);
	}
}