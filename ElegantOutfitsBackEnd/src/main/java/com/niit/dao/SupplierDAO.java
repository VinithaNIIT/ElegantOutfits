package com.niit.dao;
import java.util.List;

import com.niit.model.Supplier;


public interface SupplierDAO {
	
	public boolean insertSupplier(Supplier supplier);
	public List<Supplier> getSupplier();
	public Supplier getSupplierById(String supplierid);
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(String supplierid);
	public List<Supplier> getSupplierList();

}
