package tn.enis.ghiloufi.compteAPP.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "CLIENTS")
@NoArgsConstructor
@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@NonNull
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Compte> comptes = new ArrayList<>();

	public void addComptes(Compte compte) {
		this.comptes.add(compte);
	}

}
