package com.jbk.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.api.dao.SupplierDao;
import com.jbk.api.entity.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	SupplierDao dao;

	@Override
	public boolean saveSupplier(Supplier supplier) {
		boolean isAdded=dao.saveSupplier(supplier);
		return isAdded;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// 
		return dao.getAllSuppliers();
	}

	@Override
	public Supplier getSupplierById(int id) {
		
		return dao.getSupplierById(id);
	}

}
