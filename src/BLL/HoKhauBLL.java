/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.*;
import DTO.*;
import java.util.List;

/**
 *
 * @author kenz2
 */
public class HoKhauBLL {
    private HoKhauDAL dal;
	
	public HoKhauBLL() {
		dal = new HoKhauDAL();
	}

	public List<HoKhau> listAll()  {
		return dal.list();
	}
	
	public Integer save(HoKhau hk) throws Exception {		            
            return dal.save(hk);		                          
	}
	
	public void delete(HoKhau hk) throws Exception {
		dal.delete(hk);
	}
}
