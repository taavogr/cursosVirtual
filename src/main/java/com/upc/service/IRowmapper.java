package com.upc.service;

import java.sql.ResultSet;

public interface IRowmapper<T> {
	
	T mapRow(ResultSet rs) throws Exception;

}
