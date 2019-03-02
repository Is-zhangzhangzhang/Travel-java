package cn.edu.scau.zhangjiayi.domain;

public class TestBean {
   
	private String teststr;

	private Integer testint;

	public String getTeststr() {
		return teststr;
	}

	public void setTeststr(String teststr) {
		this.teststr = teststr == null ? null : teststr.trim();
	}

	public Integer getTestint() {
		return testint;
	}

	public void setTestint(Integer testint) {
		this.testint = testint;
	}

}