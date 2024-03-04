package training.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Content")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Content {
	@Id
	@GeneratedValue
	Long id;
	@Column(length = 1000)
	@NotEmpty(message = "title không thể để trống")
	private String title;
	@Column(length = 1000)
	@NotEmpty(message = "brief không thể để trống")
	private String brief;
	@Column(length = 1000)
	@NotEmpty(message = "content không thể để trống")
	private String content;
	private LocalDate createdDate;
	private LocalTime updateTime;
	private String sort;

	@ManyToOne
	@JoinColumn
	Member authorId;
}
