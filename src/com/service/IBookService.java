package com.service;

import java.util.List;

import com.entity.Book;

public interface IBookService {

	//���
	public void add(Book book);
	//����
	public void update(Book book);
	//����������ѯ�õ�name,��������
	public Book findByBid(String bid);
	//ɾ��
	public void delete(int bid);
	//��ѯ
	public List<Book> getAll();
	//����������ѯ����
	public List<Book> search(int bid);
}
