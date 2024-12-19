package co.com.accenture.nequi.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "branches")
public class Branch implements Serializable {

	private static final long serialVersionUID = 8673269864531689636L;

	@Id
	private String id;
	private String name;
	private List<Product> products;

}
