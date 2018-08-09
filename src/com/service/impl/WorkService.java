package com.service.impl;

import java.util.List;

import com.dao.IWorkDao;
import com.dao.impl.WorkDao;
import com.entity.Work;
import com.service.IWorkService;

public class WorkService implements IWorkService {

	IWorkDao workDao=new WorkDao();
	public void add(Work work) {
		workDao.add(work);

	}

	public void update(Work work) {
		workDao.update(work);

	}

	public void delete(int id) {
		workDao.delete(id);

	}

	public Work findById(String id) {
		
		return workDao.findById(id);
	}

	public List<Work> getAll() {
		
		return workDao.getAll();
	}

	public List<Work> search(int id) {
		return workDao.search(id);
	}

}
