package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class Contents {
	
	private ConfirmationTextPerLanguage confirmationTextPerLanguage;
	private String validFrom;

}
