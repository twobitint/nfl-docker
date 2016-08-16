package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Game {

	@Id
	private String gsis_id;

	private String gamekey;

	private Date start_time;

	private Integer week;

	private String day_of_week;

	private Integer season_year;

	private String season_type;

	private Boolean finished;

	private String home_team;
	private Integer home_score;
	private Integer home_score_q1;
	private Integer home_score_q2;
	private Integer home_score_q3;
	private Integer home_score_q4;
	private Integer home_score_q5;
	private Integer home_turnovers;

	private String away_team;
	private Integer away_score;
	private Integer away_score_q1;
	private Integer away_score_q2;
	private Integer away_score_q3;
	private Integer away_score_q4;
	private Integer away_score_q5;
	private Integer away_turnovers;

	private Date time_inserted;

	private Date time_updated;

}
