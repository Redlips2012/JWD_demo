package training.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import training.annotation.FieldsValueMatch;
import training.entities.Member;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemberSignUpDTO {
	private String userName;
	private String email;
	private String password;
	@FieldsValueMatch(matches = { "password" }, message = "Mat khau khong khop")
	private String rePassword;
}