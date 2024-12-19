package co.com.accenture.nequi.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 47791103660612409L;

	private String id;
	private String name;
	private Long stock;

}
