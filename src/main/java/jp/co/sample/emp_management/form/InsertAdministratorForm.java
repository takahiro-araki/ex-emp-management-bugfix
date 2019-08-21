package jp.co.sample.emp_management.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message = "名前は必須です。")
	private String name;
	/** メールアドレス */
	@Size(min = 1, max = 127, message = "Eメールは１文字以上127文字以内で記載してください。")
	private String mailAddress;
	/** パスワード */
	@Size(min = 1, max = 127, message = "パスワードは１文字以上127文字以内で記載してください。")
	private String password;
	
	/**確認用パスワード*/
	private String password2;

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", password2=" + password2 + "]";
	}

	

}
