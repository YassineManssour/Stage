package com.taxes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taxes.bean.Local;
@Repository
public interface LocalDao extends JpaRepository<Local, Long> {

	Local findByLocalReference(String reference);
	int deleteByLocalReference(String reference);
}
