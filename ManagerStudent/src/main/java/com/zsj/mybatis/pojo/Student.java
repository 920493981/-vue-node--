package com.zsj.mybatis.pojo;

public class Student {

	private String sno;
	private String name;
	private int age;
	private int chineseGrade;
	private int mathGrade;
	private int englishGrade;
	
	public Student(){}
	
	public Student(String sno, String name, int age, int chineseGrade, int mathGrade, int englishGrade) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.chineseGrade = chineseGrade;
		this.mathGrade = mathGrade;
		this.englishGrade = englishGrade;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getChineseGrade() {
		return chineseGrade;
	}
	public void setChinesGrade(int chineseGrade) {
		this.chineseGrade = chineseGrade;
	}
	public int getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
	public int getEnglishGrade() {
		return englishGrade;
	}
	public void setEnglishGrade(int englishGrade) {
		this.englishGrade = englishGrade;
	}

	@Override
	public String toString() {
		return name+"|"+sno+"|"+age+"|"+chineseGrade+"|"+mathGrade+"|"+englishGrade;
	}
	
}
