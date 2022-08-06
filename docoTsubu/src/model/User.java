package model;

import java.io.Serializable;

public class User implements Serializable {
	private String sei;
	private String mei;
	private String tel;
	private String post;
	private String zyuusho1;
	private String zyuusho2;
	private String banchi;
	private String tatemono;
	private String email;
	private String thutomesaki;
	private String username;
	private String pass;

	public User() {}

	public User(String sei, String mei, String tel, String post, String zyuusho1, String zyuusho2, String banchi,
			String tatemono, String email, String thutomesaki,String username,String pass) {
		this.sei = sei;
		this.mei = mei;
		this.tel = tel;
		this.post = post;
		this.zyuusho1 = zyuusho1;
		this.zyuusho2 = zyuusho2;
		this.banchi = banchi;
		this.tatemono = tatemono;
		this.email = email;
		this.thutomesaki = thutomesaki;
		this.username = username;
		this.pass = pass;
	}

	public String getSei() {
		return sei;
	}

	public void setSei(String sei) {
		this.sei = sei;
	}

	public String getMei() {
		return mei;
	}

	public void setMei(String nei) {
		this.mei = nei;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getZyuusho1() {
		return zyuusho1;
	}

	public void setZyuusho1(String zyuusho1) {
		this.zyuusho1 = zyuusho1;
	}

	public String getZyuusho2() {
		return zyuusho2;
	}

	public void setZyuusho2(String zyuusho2) {
		this.zyuusho2 = zyuusho2;
	}

	public String getBanchi() {
		return banchi;
	}

	public void setBanchi(String banchi) {
		this.banchi = banchi;
	}

	public String getTatemono() {
		return tatemono;
	}

	public void setTatemono(String tatemono) {
		this.tatemono = tatemono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getThutomesaki() {
		return thutomesaki;
	}

	public void setThutomesaki(String thutomesaki) {
		this.thutomesaki = thutomesaki;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}






//	private String name; //ユーザー名
//	private String mail; //メールアドレス
//	private String pass; //パスワード
//
//	public User() {}
//
//	public User(String name,String mail,String pass) {
//		this.name = name;
//		this.mail = mail;
//		this.pass = pass;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//
//	public String getMail() {
//		return mail;
//	}
//
//	public String getPass() {
//		return pass;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
//
//
//
//
//
//
}
