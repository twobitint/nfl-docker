package jp.co.flect.odataproducer.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

import lombok.Data;

@Entity
@Data
public class Play_Player {

	@Id
	private String player_id;

	private Integer play_id;

	private String gsis_id;

	private Integer drive_id;

	private String team;

	private Integer defense_ast;
	private Integer defense_ffum;
	private Integer defense_fgblk;
	private Integer defense_frec;
	private Integer defense_frec_tds;
	private Integer defense_frec_yds;
	private Integer defense_int;
	private Integer defense_int_tds;
	private Integer defense_int_yds;
	private Integer defense_misc_tds;
	private Integer defense_misc_yds;
	private Integer defense_pass_def;
	private Integer defense_puntblk;
	private Integer defense_qbhit;
	private Integer defense_safe;
	private Double  defense_sk;
	private Integer defense_sk_yds;
	private Integer defense_tkl;
	private Integer defense_tkl_loss;
	private Integer defense_tkl_loss_yds;
	private Integer defense_tkl_primary;
	private Integer defense_xpblk;

	private Integer fumbles_forced;
	private Integer fumbles_lost;
	private Integer fumbles_notforced;
	private Integer fumbles_oob;
	private Integer fumbles_rec;
	private Integer fumbles_rec_tds;
	private Integer fumbles_rec_yds;
	private Integer fumbles_tot;

	private Integer kicking_all_yds;
	private Integer kicking_downed;
	private Integer kicking_fga;
	private Integer kicking_fgb;
	private Integer kicking_fgm;
	private Integer kicking_fgm_yds;
	private Integer kicking_fgmissed;
	private Integer kicking_fgmissed_yds;
	private Integer kicking_i20;
	private Integer kicking_rec;
	private Integer kicking_rec_tds;
	private Integer kicking_tot;
	private Integer kicking_touchback;
	private Integer kicking_xpa;
	private Integer kicking_xpb;
	private Integer kicking_xpmade;
	private Integer kicking_xpmissed;
	private Integer kicking_yds;

	private Integer kickret_fair;
	private Integer kickret_oob;
	private Integer kickret_ret;
	private Integer kickret_tds;
	private Integer kickret_touchback;
	private Integer kickret_yds;

	private Integer passing_att;
	private Integer passing_cmp;
	private Integer passing_cmp_air_yds;
	private Integer passing_incmp;
	private Integer passing_incmp_air_yds;
	private Integer passing_int;
	private Integer passing_sk;
	private Integer passing_sk_yds;
	private Integer passing_tds;
	private Integer passing_twopta;
	private Integer passing_twoptm;
	private Integer passing_twoptmissed;
	private Integer passing_yds;

	private Integer punting_blk;
	private Integer punting_i20;
	private Integer punting_tot;
	private Integer punting_touchback;
	private Integer punting_yds;

	private Integer puntret_downed;
	private Integer puntret_fair;
	private Integer puntret_oob;
	private Integer puntret_tds;
	private Integer puntret_tot;
	private Integer puntret_touchback;
	private Integer puntret_yds;

	private Integer receiving_rec;
	private Integer receiving_tar;
	private Integer receiving_tds;
	private Integer receiving_twopta;
	private Integer receiving_twoptm;
	private Integer receiving_twoptmissed;
	private Integer receiving_yac_yds;
	private Integer receiving_yds;

	private Integer rushing_att;
	private Integer rushing_loss;
	private Integer rushing_loss_yds;
	private Integer rushing_tds;
	private Integer rushing_twopta;
	private Integer rushing_twoptm;
	private Integer rushing_twoptmissed;
	private Integer rushing_yds;
}
