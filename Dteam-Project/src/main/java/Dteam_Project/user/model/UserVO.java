package Dteam_Project.user.model;

import java.util.Date;

public class UserVO {

		private String user_id;
		private String user_pw;
		private String user_name;
		private String user_phone;
		private String user_email;
		Date user_reg_date;
		
		public String getUser_id() {
			return user_id;
		}
		public void setUser_id(String user_id) {
			this.user_id = user_id;
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
		public String getUser_phone() {
			return user_phone;
		}
		public void setUser_phone(String user_phone) {
			this.user_phone = user_phone;
		}
		public String getUser_email() {
			return user_email;
		}
		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}
		public Date getUser_reg_date() {
			return user_reg_date;
		}
		public void setUser_reg_date(Date user_reg_date) {
			this.user_reg_date = user_reg_date;
		}

	}


