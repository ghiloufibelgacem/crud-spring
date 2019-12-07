package tn.enis.ghiloufi.compteAPP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.enis.ghiloufi.compteAPP.entities.Compte;

@CrossOrigin(origins = "*")
@RepositoryRestController
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
