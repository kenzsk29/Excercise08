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
public class QuanDoiBLL {
    private QuanDoiDAL dal;
	
	public QuanDoiBLL() {
		dal = new QuanDoiDAL();
	}

	public List<QuanDoi> listAll()  {
		return dal.list();
	}
	
	public Integer save(Quan q) throws Exception {		            
            return dal.save(q);		                          
	}
	
	public void delete(Quan q) throws Exception {
		dal.delete(q);
	}
}
