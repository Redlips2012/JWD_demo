package training.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import training.entities.Content;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLoginDTO {
	@NotEmpty(message = "Trường này không được để trống")
	private String email;
	@NotEmpty(message = "Trường này không được để trống")
	private String password;

}
