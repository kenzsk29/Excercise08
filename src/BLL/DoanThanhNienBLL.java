/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DoanThanhNienDAL;
import DTO.DoanThanhNien;
import java.util.List;


/**
 *
 * @author kenz2
 */
public class DoanThanhNienBLL {
    private DoanThanhNienDAL dal;
	
	public DoanThanhNienBLL() {
		dal = new DoanThanhNienDAL();
	}

	public List<DoanThanhNien> listAll()  {
		return dal.list();
	}
	
	public Integer save(DoanThanhNien dtn) throws Exception {		            
            return dal.save(dtn);		                          
	}
	
	public void delete(DoanThanhNien dtn) throws Exception {
		dal.delete(dtn);
	}
}
