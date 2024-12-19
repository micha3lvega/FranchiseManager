package co.com.accenture.nequi.entity;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "franchises")
public class Franchise implements Serializable {

	private static final long serialVersionUID = 6713247885218640514L;

	@Id
	private String id;
	private String name;
	private List<Branch> branches;

}
