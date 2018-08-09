package com.dao;

import java.util.List;

import com.entity.Reader;

public interface IReaderDao {

	void add(Reader reader);
	void update(Reader reader);
	Reader findByRid(String rid);
	void delete(int rid);
	List<Reader> getAll();
	List<Reader> search(int rid);
	
}
