package com.jbk.api.service;

import java.util.List;

import com.jbk.api.entity.Supplier;

public interface SupplierService {
	public boolean saveSupplier(Supplier supplier);

	public List<Supplier> getAllSuppliers();

    public Supplier getSupplierById(int id);
}
