package co.com.accenture.nequi.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = -4222841459227940228L;

	@Id
	private String id;
	private String name;
	private Long stock;

}
