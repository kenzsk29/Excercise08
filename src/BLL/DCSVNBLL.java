/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DCSVNDAL;
import DTO.*;
import java.util.List;

/**
 *
 * @author kenz2
 */
public class DCSVNBLL {
    private DCSVNDAL dal;
	
	public DCSVNBLL() {
		dal = new DCSVNDAL();
	}

	public List<DCSVN> listAll()  {
		return dal.list();
	}
	
	public void save(DCSVN cs) throws Exception {
		dal.save(cs);
	}
	
	public void delete(DCSVN cs) throws Exception {
		dal.delete(cs);
	}
}
