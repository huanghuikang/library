package com.service;

import java.util.List;

import com.entity.Work;

public interface IWorkService {
	void add(Work work);
	void update(Work work);
	void delete(int id);
	Work findById(String id);
	List<Work> getAll();
	List<Work> search(int id);
}
