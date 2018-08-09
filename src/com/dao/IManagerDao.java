package com.dao;

import java.util.List;

import com.entity.Manager;

public interface IManagerDao {
	/**
	 * 	�����û��������ѯ
	 * */
	Manager findNameAndPwd(Manager manager);
	/**
	 * ע�����
	 * */
	void save(Manager manager);
	/**
	 * ��ѯ�û����Ƿ����
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

