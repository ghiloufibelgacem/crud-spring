package tn.enis.ghiloufi.compteAPP.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.enis.ghiloufi.compteAPP.entities.Client;

@CrossOrigin(origins = "*")
@RepositoryRestController
public interface ClientRepository extends JpaRepository<Client, Long> {

}
