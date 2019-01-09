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
public class HocVanBLL {
    private HocVanDAL dal;
	
	public HocVanBLL() {
		dal = new HocVanDAL();
	}

	public List<HocVan> listAll()  {
		return dal.list();
	}
	
	public Integer save(HocVan hv) throws Exception {		            
            return dal.save(hv);		                          
	}
	
	public void delete(HocVan hv) throws Exception {
		dal.delete(hv);
	}
}
