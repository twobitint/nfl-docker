package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Player {

	@Id
	private String player_id;

	private String gsis_name;

	private String full_name;

	private String first_name;

	private String last_name;

	private String team;

	private String position;

	private Integer profile_id;

	private String profile_url;

	private Integer uniform_number;

	private String birthdate;

	private String college;

	private Integer height;

	private Integer weight;

	private Integer years_pro;

	private String status;

}
