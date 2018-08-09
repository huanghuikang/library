package com.dao;

import java.util.List;

import com.entity.Manager;

public interface IManagerDao {
	/**
	 * 	根据用户名密码查询
	 * */
	Manager findNameAndPwd(Manager manager);
	/**
	 * 注册添加
	 * */
	void save(Manager manager);
	/**
	 * 查询用户名是否存在
	 * */
	boolean userNameExists(String name);
	
	void update(Manager manager);
	Manager findByMid(String mid);
	void delete(int mid);
	List<Manager> getAll();
	List<Manager> search(int mid);
	
	List<Manager> search(int mid,String name,String pwd);
	Manager findByName(int mid,String name,String pwd);
	void update(String pwd,String name,int mid);
}

