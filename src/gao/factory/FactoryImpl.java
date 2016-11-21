package gao.factory;

import gao.dao.IManagerDao;
import gao.dao.IUserDao;
import gao.dao.impl.ManagerDaoImpl;
import gao.dao.impl.UserDaoImpl;

public class FactoryImpl {
public static IUserDao createUserDaoInstance(){
	return new UserDaoImpl();
	}
public static IManagerDao createManagerDaoInstance(){
	return new ManagerDaoImpl();
	
}
}
