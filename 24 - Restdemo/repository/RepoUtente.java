package springtest.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springtest.restdemo.model.Utente;

public interface RepoUtente extends JpaRepository<Utente, Integer> {

	public Utente findById(int id);
	public boolean existsByCf(String cf);
	public Utente findByCf(String cf);
	
}