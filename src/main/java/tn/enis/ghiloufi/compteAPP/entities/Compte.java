package tn.enis.ghiloufi.compteAPP.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="COMPTES")
@NoArgsConstructor @Data @AllArgsConstructor @EqualsAndHashCode @ToString @RequiredArgsConstructor
public class Compte {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String rib;
	@NonNull
	private double solde;

}
