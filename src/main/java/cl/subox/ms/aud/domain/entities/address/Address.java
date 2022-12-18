package cl.subox.ms.aud.domain.entities.address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Long id;

	@Column(name = "street_name")
	private String streetName;

	@Column(name = "street_number")
	private String streetNumber;

	private String dept;

	private String description;

	private String office;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "commune_id", referencedColumnName = "address_id")
	private Commune commune;

}