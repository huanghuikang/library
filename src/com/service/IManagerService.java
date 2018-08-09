package com.service;

import java.util.List;

import com.entity.Manager;
import com.exception.ManagerException;

public interface IManagerService {

	//µÇÂ¼
	Manager login(Manager manager);
	//×¢²áÒ²ÊÇÌí¼Ó
	void register(Manager manager) throws ManagerException;
	
	void update(Manager manager);
	Manager findByMid(String mid);
	void delete(int mid);
	List<Manager> getAll();
	List<Manager> search(int mid);
	
	List<Manager> search(int mid,String name,String pwd);
	Manager findByName(int mid,String name,String pwd);
	void update(String pwd,String name,int mid);
}
