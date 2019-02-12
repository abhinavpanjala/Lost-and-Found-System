package beans;

public class AuthenticationBean {
	private String type;
	public boolean isValidUser;

	private String loginId;
	private String loginPassword;

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isValidUser() {
		return isValidUser;
	}
	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}	
}
