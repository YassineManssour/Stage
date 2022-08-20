package com.taxes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taxes.bean.Local;
import com.taxes.dao.LocalDao;

@Service
public class LocalService {
	@Autowired
	private LocalDao localDao;

	public Local findByReference(String reference) {
		return localDao.findByReference(reference);
	}
	@Transactional
	public int deleteByReference(String reference) {
		return localDao.deleteByReference(reference);
	}

	public List<Local> findByRedevableCin(String cin) {
		return localDao.findByRedevableCin(cin);
	}

	public Local getReferenceById(Long id) {
		return localDao.getReferenceById(id);
	}

	public List<Local> findAll() {
		return localDao.findAll();
	}
	
	public int save(Local local) {
		if(findByReference(local.getReference())==null) {
			return -1;
		}else {
			localDao.save(local);
			return 1;
		}
	}
}
