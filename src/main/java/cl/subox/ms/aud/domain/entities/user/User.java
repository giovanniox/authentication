package cl.subox.ms.aud.domain.entities.user;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import cl.subox.ms.aud.domain.entities.contact.Contact;
import cl.subox.ms.aud.domain.entities.person.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import cl.subox.ms.aud.domain.entities.role.Role;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, name = "user_id")
	private Long id;

	@Column(unique = true, length = 20, name = "user_name")
	private String userName;

	@Column(length = 60)
	private String password;

	private Boolean enabled;

	@Column(name = "email_valid")
	private Boolean emailValid;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = {
			@UniqueConstraint(columnNames = { "user_id", "role_id" }) })
	private List<Role> roles;

	@Column(name = "create_at", nullable = false)
	private Long createAt;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_id", nullable = true)
	private Contact contact;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", nullable = true)
	private Person person;


}
