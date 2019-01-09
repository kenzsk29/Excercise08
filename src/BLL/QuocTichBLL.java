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
public class QuocTichBLL {
    private QuocTichDAL dal;
	
	public QuocTichBLL() {
		dal = new QuocTichDAL();
	}

	public List<QuocTich> listAll()  {
		return dal.list();
	}
	
	public Integer save(QuocTich qt) throws Exception {		            
            return dal.save(qt);		                          
	}
	
	public void delete(QuocTich qt) throws Exception {
		dal.delete(qt);
	}
}
