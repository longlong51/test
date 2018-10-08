package com.example.model;

public class Button_enroll {

	private int pic;
	private String text;
	private int number;

	public Button_enroll(int pic, String text,int number) {
		this.pic = pic;
		this.text = text;
		this.number = number;;
	}

	public int getPic() {
		return pic;
	}

	public void setPic(int pic) {
		this.pic = pic;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}

	public void getNumber(int number) {
		this.number = number;
	}

}
