package com.jbk.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.api.entity.Supplier;
import com.jbk.api.service.SupplierService;

@RestController
public class Controller {
	@Autowired
	SupplierService service;

	@PostMapping("savesupplier")
	public boolean saveSupplier(@RequestBody Supplier supplier) {
		boolean isAdded = service.saveSupplier(supplier);

		return isAdded;

	}

	@GetMapping("getAll")
	public List<Supplier> getAllSuppliers() {
		return service.getAllSuppliers();

	}

	@GetMapping("getbyid/{id}")
	public Supplier getSupplierById(@PathVariable int id) {
		return service.getSupplierById(id);

	}

}
