package ec.com.advanceit.loginjwt.repository;

import ec.com.advanceit.loginjwt.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

	//from usuario where username = ?
	//Derived Query
	Usuario findOneByUsername(String username);
}
