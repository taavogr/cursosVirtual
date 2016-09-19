package com.upc.service;

import java.util.List;

public interface ICrudservice<T> {
	
	void create(T o) throws Exception;
	void update(T o) throws Exception;
	void delete(T o) throws Exception;
	T get(String codigo) throws Exception;
	List <T> getAll() throws Exception;

}
