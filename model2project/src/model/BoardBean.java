package model;

import java.sql.Timestamp;

//일반 게시판 : 가입한 사람만 글쓰게 하려고 user_id가 작성자로
//			 장소공유나, 잡다한 글쓰는 게시판?

public class BoardBean {
	private int board_num;				// primary key
	private String user_id;				// foreign key : 작성자
	private String user_nickname;		
	private String board_title;
	private String board_content;
	private String board_img;
	private int board_hit;
	private int board_ref;				// 댓글번호
	private int board_lev;				// 댓글깊이
	private int board_seq;				// 댓글???
	private Timestamp board_regdate;
	
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_img() {
		return board_img;
	}
	public void setBoard_img(String board_img) {
		this.board_img = board_img;
	}
	public int getBoard_hit() {
		return board_hit;
	}
	public void setBoard_hit(int board_hit) {
		this.board_hit = board_hit;
	}
	public int getBoard_ref() {
		return board_ref;
	}
	public void setBoard_ref(int board_ref) {
		this.board_ref = board_ref;
	}
	public int getBoard_lev() {
		return board_lev;
	}
	public void setBoard_lev(int board_lev) {
		this.board_lev = board_lev;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public Timestamp getBoard_regdate() {
		return board_regdate;
	}
	public void setBoard_regdate(Timestamp board_regdate) {
		this.board_regdate = board_regdate;
	}
	
}
