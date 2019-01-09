package BLL;

import DAL.NguyenQuanDAL;
import DTO.*;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NguyenQuanBLL {
	private NguyenQuanDAL dal;
	
	public NguyenQuanBLL() {
		dal = new NguyenQuanDAL();
	}

	public List<NguyenQuan> listAll()  {
		return dal.list();
	}
	
	public void save(NguyenQuan nq) throws Exception {
		dal.save(nq);
	}
	
	public void delete(NguyenQuan nq) throws Exception {
		dal.delete(nq);
	}

}