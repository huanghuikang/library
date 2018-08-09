package com.dao;

import java.util.List;

import com.entity.Work;

public interface IWorkDao {

	public void add(Work work);
	public void update(Work work);
	public void delete(int id);
	public Work findById(String id); 
	List<Work> getAll();
	List<Work> search(int id);
}
