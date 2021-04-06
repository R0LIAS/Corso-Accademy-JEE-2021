package springtest.restdemo.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springtest.restdemo.model.Utente;
import springtest.restdemo.repository.RepoUtente;

@RestController
@RequestMapping({ "/controllerUtente" })
public class ControllerUtente {

	@Autowired
	RepoUtente repoUtente;

	@RequestMapping(value = "inserimentoUtente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> inserimentoUtente(RequestEntity<Utente> requestUtente) {

		JSONObject json = new JSONObject();
		Utente utente = requestUtente.getBody();

		try {
			if (utente.getId() > 0) {
				json.put("errore", "Id non può essere valorizzato!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getNome() == null || utente.getNome().equals("")) {
				json.put("errore", "Valorizzare il nome!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getCognome() == null || utente.getCognome().equals("")) {
				json.put("errore", "Valorizzare il cognome!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getCf() == null || utente.getCf().equals("")) {
				json.put("errore", "Valorizzare il codice fiscale!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (repoUtente.existsByCf(utente.getCf())) {
				json.put("errore", "Il codice fiscale esiste già!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			
			repoUtente.save(utente);
			return new ResponseEntity<Utente>(utente, HttpStatus.OK);
			
		} catch (Exception e) {
			json.put("errore", e.getMessage());
			return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "leggiUtente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> leggiUtente(RequestEntity<Utente> requestUtente) {

		JSONObject json = new JSONObject();
		Utente utente = requestUtente.getBody();
		Utente utenteDB = repoUtente.findById(utente.getId());
		
		try {
			if(utenteDB == null) {
				json.put("errore", "Utente non trovato!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			
			return new ResponseEntity<Utente>(utenteDB, HttpStatus.OK);
			
		}catch(Exception e) {
			json.put("errore", e.getMessage());
			return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "leggiTuttiUtenti", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>leggiTuttiUtenti() {

		JSONObject json = new JSONObject();
		
		try {
			List<Utente> listaUtenti = repoUtente.findAll();
			if (listaUtenti.isEmpty()) {
				json.put("errore", "Lista vuota!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
			}
			return new ResponseEntity<List<Utente>>(listaUtenti, HttpStatus.OK);
		}catch(Exception e) {
			json.put("errore", e.getMessage());
			return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "modificaUtente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> modificaUtente(RequestEntity<Utente> requestUtente) {

		JSONObject json = new JSONObject();
		Utente utente = requestUtente.getBody();

		try {
			if (utente.getId() == 0) {
				json.put("errore", "Inserire ID maggiore di zero!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (!repoUtente.existsById(utente.getId())) {
				json.put("errore", "Utente inesistente!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getNome() == null || utente.getNome().equals("")) {
				json.put("errore", "Valorizzare il nome!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getCognome() == null || utente.getCognome().equals("")) {
				json.put("errore", "Valorizzare il cognome!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			if (utente.getCf() == null || utente.getCf().equals("")) {
				json.put("errore", "Valorizzare il codice fiscale!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			Utente utenteDB = repoUtente.findByCf(utente.getCf());
			if (utenteDB != null && utenteDB.getId() != utente.getId()) {
				json.put("errore", "Il codice fiscale esiste già!");
				return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
			}
			
			repoUtente.save(utente);
			return new ResponseEntity<Utente>(utente, HttpStatus.OK);
			
		} catch (Exception e) {
			json.put("errore", e.getMessage());
			return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
		}	
	}

	@RequestMapping(value = "eliminaUtente", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> eliminaUtente(RequestEntity<Utente> requestUtente) {

		JSONObject json = new JSONObject();
		Utente utente = requestUtente.getBody();

		try {	
			repoUtente.deleteById(utente.getId());
			json.put("esito", "Utente eliminato!");
			return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
		} catch (Exception e) {
			json.put("errore", e.getMessage());
			return new ResponseEntity<String>(json.toString(), HttpStatus.BAD_REQUEST);
		}
	}
}