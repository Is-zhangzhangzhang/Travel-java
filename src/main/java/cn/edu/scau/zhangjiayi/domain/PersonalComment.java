package cn.edu.scau.zhangjiayi.domain;

import java.util.Date;

public class PersonalComment {
    private String id;

	private String writer;

	private String commentee;

	private Date issuingtime;

	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer == null ? null : writer.trim();
	}

	public String getCommentee() {
		return commentee;
	}

	public void setCommentee(String commentee) {
		this.commentee = commentee == null ? null : commentee.trim();
	}

	public Date getIssuingtime() {
		return issuingtime;
	}

	public void setIssuingtime(Date issuingtime) {
		this.issuingtime = issuingtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}