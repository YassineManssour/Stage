package com.taxes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taxes.bean.Local;
import com.taxes.bean.Redevable;
import com.taxes.bean.TauxTaxeTnb;
import com.taxes.bean.TaxeTnb;
import com.taxes.dao.TaxeTnbDao;

@Service
public class TaxeTnbService {
	@Autowired
	private TaxeTnbDao taxetnbdao;

	public Redevable findByRedevableCin(String cinRedevable) {
		return taxetnbdao.findByRedevableCin(cinRedevable);
	}
	
	@Transactional
	public Redevable DeleteByRedevableCin(String cinRedevable) {
		return taxetnbdao.DeleteByRedevableCin(cinRedevable);
	}

	public TauxTaxeTnb findByReferenceCategorieLocal(String reference) {
		return taxetnbdao.findByReferenceCategorieLocal(reference);
	}

	public void delete(TaxeTnb entity) {
		taxetnbdao.delete(entity);
	}
	public TaxeTnb getReferenceById(Long id) {
		return taxetnbdao.getReferenceById(id);
	}

	public Local findByAnneeAndLocalReference(int annee, String reference) {
		return taxetnbdao.findByAnneeAndLocalReference(annee, reference);
	}

	public <S extends TaxeTnb> List<S> findAll(Example<S> example) {
		return taxetnbdao.findAll(example);
	}
	
	public int save(TaxeTnb taxetnb) {
		Redevable redevable = findByRedevableCin(taxetnb.getRedevable().getCin());
		Local local = findByAnneeAndLocalReference(taxetnb.getAnnee(),taxetnb.getLocal().getReference());
		TauxTaxeTnb taux = findByReferenceCategorieLocal(taxetnb.getLocal().getCategorieTnb().getReference());
		if(redevable==null) {
			return -1;
		}else if (local==null) {
			return -2;
		}else if (local.getCategorieTnb()==null) {
			return -3;
		}else if(taux==null){
			return -4;
		}else {
			return 1;
		}
		
	}
}
