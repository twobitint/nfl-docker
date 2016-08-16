package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Drive {

	@Id
	private Integer drive_id;

	private String gsis_id;

	private String start_field;

	private String start_time;

	private String end_field;

	private String end_time;

	private String pos_team;

	private String pos_time;

	private Integer first_downs;

	private String result;

	private Integer penalty_yards;

	private Integer yards_gained;

	private Integer play_count;

	private Date time_inserted;

	private Date time_updated;

}
