package kodlama.io.Kodlama.io.Devs.wepApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@RestController
@RequestMapping("/api/software")
public class SoftwareLanguageController {
	
	private SoftwareLanguageService languageService;

	
	public SoftwareLanguageController(SoftwareLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<SoftwareLanguage> getall() {
		return languageService.getall();
	}
	
	@PostMapping
	public void add (@RequestBody SoftwareLanguage softwareLanguage) throws Exception {
		languageService.add(softwareLanguage);
	}
	
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable(name = "id") int id) throws Exception{
		languageService.delete(id);
	}
	
	
	@PutMapping("/{id}")
	public void update (@RequestBody SoftwareLanguage softwareLanguage, @PathVariable int id) throws Exception{
		languageService.update(id,softwareLanguage);
	}
	
	@GetMapping("/ {id}")
	public SoftwareLanguage getIdLanguage (@PathVariable(name =  "id") int id) {
		return languageService.getIdLanguage(id);
	}
	
}