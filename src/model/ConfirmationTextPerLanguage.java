package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class ConfirmationTextPerLanguage {
	
	private String DE;
	private String PT;
	private String DK;
	private String EN;
	private String IT;
	private String FR;
	private String ES;
	private String NL;
	
}
