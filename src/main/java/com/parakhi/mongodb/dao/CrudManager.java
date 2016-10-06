package com.parakhi.mongodb.dao;

import java.io.Serializable;
import java.util.List;

public interface CrudManager<T extends Serializable,Ek extends Serializable> {
	
	public T addNew(T t);
	public List<T> addAll(List<T> t);
	public T update(T t);
	public T remove(T t);
	public void removeBy(String id);
	public T find(String id);
	public List<T> getAll();
	

}
