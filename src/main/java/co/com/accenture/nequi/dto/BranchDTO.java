package co.com.accenture.nequi.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BranchDTO implements Serializable {

	private static final long serialVersionUID = -324954595285186879L;

	private String id;
	private String name;
	private List<ProductDTO> products;
}
