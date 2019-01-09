package DAL;

import DTO.*;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class NguyenQuanDAL extends BaseDAL{
    public long save(NguyenQuan nq) throws Exception {
	session.beginTransaction();
	Long id = (Long) session.save(nq);
        session.getTransaction().commit();
        return id;
    }
	
    public void delete(NguyenQuan nq) throws Exception {
	session.beginTransaction();
	session.delete(nq);
	session.getTransaction().commit();
    }
        
    public List<NguyenQuan> list() {
        List<NguyenQuan> result = new ArrayList<NguyenQuan>();         
        result = session.createQuery("FROM NguyenQuan").list();
        return result;
    }
}