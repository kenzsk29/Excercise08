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
public class NoiCapBLL {
    private NoiCapDAL dal;
	
	public NoiCapBLL() {
		dal = new NoiCapDAL();
	}

	public List<NoiCap> listAll()  {
		return dal.list();
	}
	
	public Integer save(NoiCap nc) throws Exception {		            
            return dal.save(nc);		                          
	}
	
	public void delete(NoiCap nc) throws Exception {
		dal.delete(nc);
	}
}
