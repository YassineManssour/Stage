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

import com.taxes.bean.Local;
import com.taxes.service.LocalService;

@RestController
@RequestMapping("Api/Local")
public class LocalWs {
	@Autowired
	private LocalService localService;

	@GetMapping("/reference/{reference}")
	public Local findByReference(@PathVariable String reference) {
		return localService.findByReference(reference);
	}
	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return localService.deleteByReference(reference);
	}
	@GetMapping("/cin/{cin}")
	public List<Local> findByRedevableCin(@PathVariable String cin) {
		return localService.findByRedevableCin(cin);
	}
	@GetMapping("/")
	public List<Local> findAll() {
		return localService.findAll();
	}
	@PostMapping("/")
	public int save(@RequestBody Local local) {
		return localService.save(local);
	}
}
