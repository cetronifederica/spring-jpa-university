package jana60.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Departments {

	// colonna id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer departmentsId;

	// colonna nome
	private String name;
	// colonna indirizzo
	private String address;
	// colonna telefono
	private String phone;
	// colonna email
	private String email;
	// colonna sito web
	private String website;
	// colonna capo dipartimento
	private String headOfDepartment;

	@OneToMany
	@JoinColumn(name = "Id")
	private List<Degrees> degrees;

	// getter e setter

	public Integer getDepartmentsId() {
		return departmentsId;
	}

	public void setDepartmentsId(Integer departmentsId) {
		this.departmentsId = departmentsId;
	}

	public String getName() {

		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {

		return address;

	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;

	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getHeadOfDepartment() {

		return headOfDepartment;

	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public List<Degrees> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<Degrees> degrees) {
		this.degrees = degrees;
	}

}
