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
public class TonGiaoBLL {
    private TonGiaoDAL dal;
	
	public TonGiaoBLL() {
		dal = new TonGiaoDAL();
	}

	public List<TonGiao> listAll()  {
		return dal.list();
	}
	
	public Integer save(TonGiao tg) throws Exception {		            
            return dal.save(tg);		                          
	}
	
	public void delete(TonGiao tg) throws Exception {
		dal.delete(tg);
	}
}
