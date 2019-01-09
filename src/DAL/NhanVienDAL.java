package DAL;

import DTO.NhanVien;
import DTO.*;
import java.util.ArrayList;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kenz2
 */
public class NhanVienDAL extends BaseDAL {
    public NhanVienDAL(){
        super();
    }
            
    public Integer save(Object obj) throws Exception {
	session.beginTransaction();
	Integer id = (Integer) session.save(obj);
        session.getTransaction().commit();
        return id;
    }
	
    public void delete(Object obj) throws Exception {
	session.beginTransaction();
	session.delete(obj);
	session.getTransaction().commit();
    }
        
    public List<NhanVien> list() {
        List<NhanVien> result = new ArrayList<NhanVien>();
        result = session.createQuery("FROM NhanVien").list();
        return result;
    }
}