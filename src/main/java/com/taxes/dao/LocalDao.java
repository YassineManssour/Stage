package com.taxes.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxes.bean.Local;
@Repository
public interface LocalDao extends JpaRepository<Local, Long> {

	Local findByReference(String reference);
	int deleteByReference(String reference);
	List<Local>findByRedevableCin(String cin);
}
