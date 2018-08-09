package com.service.impl;

import java.util.List;

import com.dao.IManagerDao;
import com.dao.impl.ManagerDao;
import com.entity.Manager;
import com.exception.ManagerException;
import com.service.IManagerService;

/**
 * 3.业务逻辑层实现
 * */

public class ManagerService implements IManagerService {

	//调用dao
	private IManagerDao managerDao=new ManagerDao();
	
	public Manager login(Manager manager) {
		try {
			return managerDao.findNameAndPwd(manager);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void register(Manager manager) throws ManagerException {
		try {
			//1.先根据用户名查询用户是否存在
			boolean flag=managerDao.userNameExists(manager.getName());
			//2.如果用户存在，不允许注册
			if(flag){
				throw new ManagerException("用户名已经存在，注册失败！");
			}
			//3.用户不存在，才可以注册
			managerDao.save(manager);
		} catch (ManagerException e) {
			throw e;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void update(Manager manager) {
		managerDao.update(manager);
	}

	public Manager findByMid(String mid) {
		return managerDao.findByMid(mid);
	}

	public void delete(int mid) {
		managerDao.delete(mid);
	}

	public List<Manager> getAll() {
		return managerDao.getAll();
	}

	public List<Manager> search(int mid) {
		return managerDao.search(mid);
	}

	public List<Manager> search(int mid,String name, String pwd) {
		return managerDao.search(mid,name, pwd);
	}

	public Manager findByName(int mid,String name, String pwd) {
		return managerDao.findByName(mid,name, pwd);
	}

	public void update(String pwd, String name,int mid) {
		managerDao.update(pwd, name,mid);
	}

	
}
