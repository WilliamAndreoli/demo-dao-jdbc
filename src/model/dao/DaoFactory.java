package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

//Classe que instãncia os Daos
//Dessa maneira não é necessário expor a implementação

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
