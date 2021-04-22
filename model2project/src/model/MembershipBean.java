package model;

// 맴버십 클래스

public class MembershipBean {
	private int mbs_idnum;			// primary key;
	private String class_name;
	private String class_content;
	private String class_img;
	private int class_min;				// 최소인원
	private int class_max;				// 최대인원
	private int class_remain;			// 남은자리
	private String class_price;
	private String class_start;
	private String class_end;
	
	
	public int getMbs_idnum() {
		return mbs_idnum;
	}
	public void setMbs_idnum(int mbs_idnum) {
		this.mbs_idnum = mbs_idnum;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_content() {
		return class_content;
	}
	public void setClass_content(String class_content) {
		this.class_content = class_content;
	}
	public String getClass_img() {
		return class_img;
	}
	public void setClass_img(String class_img) {
		this.class_img = class_img;
	}
	public int getClass_min() {
		return class_min;
	}
	public void setClass_min(int class_min) {
		this.class_min = class_min;
	}
	public int getClass_max() {
		return class_max;
	}
	public void setClass_max(int class_max) {
		this.class_max = class_max;
	}
	public int getClass_remain() {
		return class_remain;
	}
	public void setClass_remain(int class_remain) {
		this.class_remain = class_remain;
	}
	public String getClass_price() {
		return class_price;
	}
	public void setClass_price(String class_price) {
		this.class_price = class_price;
	}
	public String getClass_start() {
		return class_start;
	}
	public void setClass_start(String class_start) {
		this.class_start = class_start;
	}
	public String getClass_end() {
		return class_end;
	}
	public void setClass_end(String class_end) {
		this.class_end = class_end;
	}
}
