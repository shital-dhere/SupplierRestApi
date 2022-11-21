package com.jbk.api.dao;

import java.util.List;

import com.jbk.api.entity.Supplier;

public interface SupplierDao {
	public boolean saveSupplier(Supplier supplier);

	public List<Supplier> getAllSuppliers();

	public Supplier getSupplierById(int id);
}
