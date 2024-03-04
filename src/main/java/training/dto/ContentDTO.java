package training.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import training.entities.Member;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ContentDTO {
	private String title;
	private String brief;
	private String content;

}
