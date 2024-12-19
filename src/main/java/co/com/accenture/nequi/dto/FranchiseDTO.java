package co.com.accenture.nequi.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class FranchiseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private List<BranchDTO> branches;

}
