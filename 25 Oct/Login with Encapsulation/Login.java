public class Login {
	private String uname;
	private String pwd;
	
	
	public void setUname(String username) {
		uname = username;
	}

	
	public String getUname() {
		return "The username is " + uname;
	}
	
	
	public void setPwd(String password) {
		pwd = password;
	}


	public String getPwd() {
		return "The password is " + pwd;
	}
	
}