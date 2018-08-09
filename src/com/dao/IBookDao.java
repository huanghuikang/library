package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Book;

public interface IBookDao {
	//���
	public void add(Book book);
	//�޸�
	public void update(Book book);
	//ɾ��
	public void delete(int bid);
	//��ѯȫ��
	public List<Book> getAll();
	//����������ѯ.��������Ҫ��
	public Book findByBid(String bid);
	//����id�Ų�ѯ
	public List<Book> search(int bid);
	
}
