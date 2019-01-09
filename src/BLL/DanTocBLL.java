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
public class DanTocBLL {
    private DanTocDAL dal;
	
	public DanTocBLL() {
		dal = new DanTocDAL();
	}

	public List<DanToc> listAll()  {
		return dal.list();
	}
	
	public Integer save(DanToc dt) throws Exception {		            
            return dal.save(dt);		                          
	}
	
	public void delete(DanToc dt) throws Exception {
		dal.delete(dt);
	}
}
