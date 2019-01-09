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
public class HonNhanBLL {
    private HonNhanDAL dal;
	
	public HonNhanBLL() {
		dal = new HonNhanDAL();
	}

	public List<HonNhan> listAll()  {
		return dal.list();
	}
	
	public Integer save(HonNhan hn) throws Exception {		            
            return dal.save(hn);		                          
	}
	
	public void delete(HonNhan hn) throws Exception {
		dal.delete(hn);
	}
}
