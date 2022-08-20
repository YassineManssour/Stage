package com.taxes.ws;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxes.bean.TaxeTnb;
import com.taxes.proces.TaxeTnbSaveProces;
import com.taxes.service.TaxeTnbService;
@RestController
@RequestMapping("API/taxetnb")
public class TaxeTnbWs {

	@Autowired
	private TaxeTnbService taxeTnbService;
	@Autowired
	private TaxeTnbSaveProces taxeTnbSaveProces;
	
	@PostMapping("/")
	public int save(@RequestBody TaxeTnb taxetnb) {
		taxeTnbSaveProces.exec(taxetnb);
		return 1;
	}
	@GetMapping("/reference/{reference}")
	public List<TaxeTnb> findByLocalReference(@PathVariable String reference) {
		return taxeTnbService.findByLocalReference(reference);
	}
	@GetMapping("/cinRedevable/{cinRedevable}")
	public List<TaxeTnb> findByRedevableCin(@PathVariable String cinRedevable) {
		return taxeTnbService.findByRedevableCin(cinRedevable);
	}
	@GetMapping("/annee/{annee}/reference/{reference}")
	public TaxeTnb findByAnneeAndLocalReference(@PathVariable int annee, @PathVariable String reference) {
		return taxeTnbService.findByAnneeAndLocalReference(annee, reference);
	}
	@GetMapping("/annee/{annee}/cin/{cin}")
	public List<TaxeTnb> findByAnneeAndRedevableCin(@PathVariable int annee, @PathVariable String cin) {
		return taxeTnbService.findByAnneeAndRedevableCin(annee, cin);
	}
	@GetMapping("/annee/{annee}")
	public List<TaxeTnb> findByAnnee(@PathVariable int annee) {
		return taxeTnbService.findByAnnee(annee);
	}
	
	@DeleteMapping("/reference/{reference}")
	public int deleteByLocalReference(@PathVariable String reference) {
		return taxeTnbService.deleteByLocalReference(reference);
	}
	
	@GetMapping("/id/{id}")
	public TaxeTnb getReferenceById(@PathVariable Long id) {
		return taxeTnbService.getReferenceById(id);
	}
	@GetMapping("/")
	public  List<TaxeTnb> findAll() {
		return taxeTnbService.findAll();
	}

}
