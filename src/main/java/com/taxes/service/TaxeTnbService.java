package com.taxes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taxes.bean.TaxeTnb;
import com.taxes.dao.TaxeTnbDao;
import com.taxes.proces.TaxeTnbSaveProces;
@Service
public class TaxeTnbService {
	@Autowired
	private TaxeTnbDao taxetnbdao;
	@Autowired
	TaxeTnbSaveProces taxeTnbSaveProces;

	/*
	 * public List<TaxeTnb> findByLocalReference(String reference) { return
	 * taxetnbdao.findByLocalReference(reference); }
	 */

	public List<TaxeTnb> findByTerrainReferenceTerrain(String reference) {
		return taxetnbdao.findByTerrainReferenceTerrain(reference);
	}

	public TaxeTnb findByAnneeAndTerrainReferenceTerrain(int annee, String reference) {
		return taxetnbdao.findByAnneeAndTerrainReferenceTerrain(annee, reference);
	}

	@Transactional
	public int deleteByTerrainReferenceTerrain(String reference) {
		return taxetnbdao.deleteByTerrainReferenceTerrain(reference);
	}

	public List<TaxeTnb> findByRedevableCin(String cinRedevable) {
		return taxetnbdao.findByRedevableCin(cinRedevable);
	}

	/*
	 * public TaxeTnb findByAnneeAndLocalReference(int annee, String reference) {
	 * return taxetnbdao.findByAnneeAndLocalReference(annee, reference); }
	 */

	public List<TaxeTnb> findByAnneeAndRedevableCin(int annee, String cin) {
		return taxetnbdao.findByAnneeAndRedevableCin(annee, cin);
	}

	public List<TaxeTnb> findByAnnee(int annee) {
		return taxetnbdao.findByAnnee(annee);
	}

	public List<TaxeTnb> findAllById(Iterable<Long> ids) {
		return taxetnbdao.findAllById(ids);
	}

	public Optional<TaxeTnb> findById(Long id) {
		return taxetnbdao.findById(id);
	}
	/*
	 * public int deleteByLocalReference(String reference) { return
	 * taxetnbdao.deleteByLocalReference(reference); }
	 */
	public TaxeTnb getReferenceById(Long id) {
		return taxetnbdao.getReferenceById(id);
	}

	public List<TaxeTnb> findAll() {
		return taxetnbdao.findAll();
	}
	
	public int save(TaxeTnb taxeTnb) {
		int n=taxeTnbSaveProces.save(taxeTnb);
		return n;
	}
	
}
