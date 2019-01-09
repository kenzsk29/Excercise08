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
public class VanHoaBLL {
    private VanHoaDAL dal;
	
	public VanHoaBLL() {
		dal = new VanHoaDAL();
	}

	public List<VanHoa> listAll()  {
		return dal.list();
	}
	
	public Integer save(VanHoa vh) throws Exception {		            
            return dal.save(vh);		                          
	}
	
	public void delete(VanHoa vh) throws Exception {
		dal.delete(vh);
	}
}
