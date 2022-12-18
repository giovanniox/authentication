package cl.subox.ms.aud.domain.entities.address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "commune")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Commune {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "commune_id")
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "city_id")
	private City city;



}