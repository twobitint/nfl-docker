package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Play {

	@Id
	private Integer play_id;

	private String gsis_id;

	private Integer drive_id;

	private String time;

	private String pos_team;

	private String yardline;

	private Integer down;

	private Integer yards_to_go;

	private String description;

	private String note;

	private Date time_inserted;

	private Date time_updated;

	private Integer first_down;

	private Integer fourth_down_att;

	private Integer fourth_down_conv;

	private Integer fourth_down_failed;

	private Integer passing_first_down;

	private Integer penalty;

	private Integer penalty_first_down;

	private Integer penalty_yds;

	private Integer rushing_first_down;

	private Integer third_down_att;

	private Integer third_down_conv;

	private Integer third_down_failed;

	private Integer timeout;

	private Integer xp_aborted;

}
