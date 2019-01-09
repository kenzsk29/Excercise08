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
public class NoiSinhBLL {
    private NoiSinhDAL dal;
	
	public NoiSinhBLL() {
		dal = new NoiSinhDAL();
	}

	public List<NoiSinh> listAll()  {
		return dal.list();
	}
	
	public Integer save(NoiSinh ns) throws Exception {		            
            return dal.save(ns);		                          
	}
	
	public void delete(NoiSinh ns) throws Exception {
		dal.delete(ns);
	}
}
