package training.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Member")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String phone;
	private String email;
	@Column(length = 1000)
	private String description;
	private LocalDate createdDate;
	private LocalTime updateTime;

	@OneToMany(mappedBy = "authorId", cascade = CascadeType.ALL)
	List<Content> contents;

	public Member copyMember(Member member) {
		this.id = member.id;
		this.firstName = member.firstName;
		this.lastName = member.lastName;
		this.userName = member.userName;
		this.password = member.password;
		this.phone = member.phone;
		this.email = member.email;
		this.description = member.description;
		this.createdDate = member.createdDate;
		this.updateTime = member.updateTime;
		this.contents = member.contents;
		return member;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", phone=" + phone + ", email=" + email + ", description=" + description
				+ ", createdDate=" + createdDate + ", updateTime=" + updateTime + "]";
	}

}
