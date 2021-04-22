package model;

import java.sql.Timestamp;

//후기 게시판

public class ReviewBean {
	private int review_num;				// primary key
	private String user_id;				// foreign key : 작성자
	private String band_name;			// foreign key
	private int mbs_idnum;			// foreign key : 맴버쉽 일련번호
	private String review_title;
	private String review_content;
	private String review_img;
	private int review_hit;
	private int review_ref;				// 댓글번호
	private int review_lev;				// 댓글깊이
	private int review_seq;				// 댓글???
	private Timestamp review_regdate;
	
	public int getReview_num() {
		return review_num;
	}
	public void setReview_num(int review_num) {
		this.review_num = review_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getBand_name() {
		return band_name;
	}
	public void setBand_name(String band_name) {
		this.band_name = band_name;
	}
	public int getMbs_idnum() {
		return mbs_idnum;
	}
	public void setMbs_idnum(int mbs_idnum) {
		this.mbs_idnum = mbs_idnum;
	}
	public String getReview_title() {
		return review_title;
	}
	public void setReview_title(String review_title) {
		this.review_title = review_title;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getReview_img() {
		return review_img;
	}
	public void setReview_img(String review_img) {
		this.review_img = review_img;
	}
	public int getReview_hit() {
		return review_hit;
	}
	public void setReview_hit(int review_hit) {
		this.review_hit = review_hit;
	}
	public int getReview_ref() {
		return review_ref;
	}
	public void setReview_ref(int review_ref) {
		this.review_ref = review_ref;
	}
	public int getReview_lev() {
		return review_lev;
	}
	public void setReview_lev(int review_lev) {
		this.review_lev = review_lev;
	}
	public int getReview_seq() {
		return review_seq;
	}
	public void setReview_seq(int review_seq) {
		this.review_seq = review_seq;
	}
	public Timestamp getReview_regdate() {
		return review_regdate;
	}
	public void setReview_regdate(Timestamp review_regdate) {
		this.review_regdate = review_regdate;
	}

}
