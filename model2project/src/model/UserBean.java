package model;

import java.sql.Timestamp;

//회원

public class UserBean {
	private String user_id;				// private key
	private String user_prepw;			//이전비밀번호
	private String user_pw;
	private String user_name;
	private String user_nickname;
	private String user_email;
	private int user_dob;				//생년월일
	private String user_phone;
	private String user_gender;
	private String user_profileimg;		// 마이페이지에서
	
	private String privacy_cons;		//개인정보처리방침
	private String service_cons;		//서비스이용
	private String marketing_cons;		//마케팅정보수신
	private String information_cons;	//정보공개여부
	private Timestamp user_regdate;		//가입일
	private int user_status;			// 1 : 일반 / 9 : 관리자
										// 가입시 기본값은 1로 고정
	
	private String band_name;			// 마이페이지에서
	private String user_role;			// 마이페이지에서
	private String user_intro;
	
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_prepw() {
		return user_prepw;
	}
	public void setUser_prepw(String user_prepw) {
		this.user_prepw = user_prepw;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_dob() {
		return user_dob;
	}
	public void setUser_dob(int user_dob) {
		this.user_dob = user_dob;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_profileimg() {
		return user_profileimg;
	}
	public void setUser_profileimg(String user_profileimg) {
		this.user_profileimg = user_profileimg;
	}
	public String getPrivacy_cons() {
		return privacy_cons;
	}
	public void setPrivacy_cons(String privacy_cons) {
		this.privacy_cons = privacy_cons;
	}
	public String getService_cons() {
		return service_cons;
	}
	public void setService_cons(String service_cons) {
		this.service_cons = service_cons;
	}
	public String getMarketing_cons() {
		return marketing_cons;
	}
	public void setMarketing_cons(String marketing_cons) {
		this.marketing_cons = marketing_cons;
	}
	public String getInformation_cons() {
		return information_cons;
	}
	public void setInformation_cons(String information_cons) {
		this.information_cons = information_cons;
	}
	public Timestamp getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(Timestamp user_regdate) {
		this.user_regdate = user_regdate;
	}
	public int getUser_status() {
		return user_status;
	}
	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}
	public String getBand_name() {
		return band_name;
	}
	public void setBand_name(String band_name) {
		this.band_name = band_name;
	}
	public String getUser_role() {
		return user_role;
	}
	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}
	public String getUser_intro() {
		return user_intro;
	}
	public void setUser_intro(String user_intro) {
		this.user_intro = user_intro;
	}
}
