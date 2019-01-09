/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kenz2
 */
public class QuanDAL extends BaseDAL{
    public QuanDAL(){
        super();
    }
            
    public Integer save(Object obj) throws Exception {
	session.beginTransaction();
	Integer id = (Integer) session.save(obj);
        session.getTransaction().commit();
        return id;
    }
	
    public void delete(Object obj) throws Exception {
	session.beginTransaction();
	session.delete(obj);
	session.getTransaction().commit();
    }
        
    public List<Quan> list() {
        List<Quan> result = new ArrayList<Quan>();
        result = session.createQuery("FROM Quan").list();
        return result;
    }
}
