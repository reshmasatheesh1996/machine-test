package com.faith.app.dto;

import java.util.Date;

public class RankStudentDto {

	private int applicationCode;
	private int studentId;
	private String studentName;
	private String courseName;
	private double average;
	private double credits;
	private int ranks;
	private Date approvedDate;
	
	public RankStudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RankStudentDto(int applicationCode, int studentId, String studentName, String courseName, double average,
			double credits, int ranks, Date approvedDate) {
		super();
		this.applicationCode = applicationCode;
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseName = courseName;
		this.average = average;
		this.credits = credits;
		this.ranks = ranks;
		this.approvedDate = approvedDate;
	}

	public int getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(int applicationCode) {
		this.applicationCode = applicationCode;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public int getRanks() {
		return ranks;
	}

	public void setRanks(int ranks) {
		this.ranks = ranks;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	
	
}
