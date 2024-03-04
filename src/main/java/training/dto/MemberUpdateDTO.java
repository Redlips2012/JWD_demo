package training.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import training.entities.Member;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberUpdateDTO {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String description;

}
