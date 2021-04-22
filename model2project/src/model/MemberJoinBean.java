package model;

import java.sql.Timestamp;

	// 가입된 맴버쉽 확인 (?)

public class MemberJoinBean {
	private int order_num;					// primary key : 맴버쉽 가입(결제)번호
	private String user_id;					// foreign key
	private int mbs_idnum;					// foreign key
	private String join_class_name;				
	private String price;
	private String join_status;				// 가입 상태	(가입됨/만료됨)
	private Timestamp join_period;			// 가입 기간	( 언제부터 언제까지	)
	private Timestamp join_regdate;			// 가입한 날
	
	
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getMbs_idnum() {
		return mbs_idnum;
	}
	public void setMbs_idnum(int mbs_idnum) {
		this.mbs_idnum = mbs_idnum;
	}
	public String getJoin_class_name() {
		return join_class_name;
	}
	public void setJoin_class_name(String join_class_name) {
		this.join_class_name = join_class_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getJoin_status() {
		return join_status;
	}
	public void setJoin_status(String join_status) {
		this.join_status = join_status;
	}
	public Timestamp getJoin_period() {
		return join_period;
	}
	public void setJoin_period(Timestamp join_period) {
		this.join_period = join_period;
	}
	public Timestamp getJoin_regdate() {
		return join_regdate;
	}
	public void setJoin_regdate(Timestamp join_regdate) {
		this.join_regdate = join_regdate;
	}		
	
	
}
