package com.service.impl;

import java.util.List;

import com.dao.IReaderDao;
import com.dao.impl.ReaderDao;
import com.entity.Reader;
import com.service.IReaderService;

public class ReaderService implements IReaderService {

	private IReaderDao readerDao=new ReaderDao();
	public void add(Reader reader) {
		try {
			readerDao.add(reader);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	public void update(Reader reader) {
		readerDao.update(reader);
		
	}

	public Reader findByRid(String rid) {
		return readerDao.findByRid(rid);
		
	}

	public void delete(int rid) {
		readerDao.delete(rid);
		
	}

	public List<Reader> getAll() {
		
		return readerDao.getAll();
	}

	public List<Reader> search(int rid) {
		return readerDao.search(rid);
	}


}
