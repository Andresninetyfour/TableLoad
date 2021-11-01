package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class Model {
	
	private Id id;
	private String _class;
	private String type;
	private String code;
	private String airlineCode;
	private Contents contents;

}
