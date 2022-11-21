package com.jbk.api.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.api.entity.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean saveSupplier(Supplier supplier) {
		Session session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		boolean isAdded = false;
		try {
			Supplier supplier2 = session.get(Supplier.class, supplier.getsId());
			if (supplier2 == null) {
				session.save(supplier);
				transaction.commit();
				isAdded = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return isAdded;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Supplier.class);
		List<Supplier> list = criteria.list();
		return list;

		
	}

	@Override
	public Supplier getSupplierById(int id) {
		Session session = sf.openSession();
		Supplier supplier=null;
		try {
			supplier = session.get(Supplier.class, id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return supplier;

	
	}

}
