package com.service;

import java.util.List;

import com.entity.Reader;

public interface IReaderService {

	void add(Reader reader);
	void update(Reader reader);
	Reader findByRid(String rid);
	void delete(int rid);
	List<Reader> getAll();
	List<Reader> search(int rid);
}
