package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Team {

	@Id
	private String team_id;

	private String city;

	private String name;

}
