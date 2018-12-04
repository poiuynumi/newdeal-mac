package com.eomcs.lms.domain;
import java.sql.Date;

public class Lesson {
	
  private int no;
  private String title;
  private String contents;
  private Date startDate;
  private Date endDate;
  private int totalHours;
  private int dayHours;
  
  
  public int getNo() { //게터세터를사용하는이유 : 메서드를사용할때데이터자체는숨기기위해
	  return no;
  }
  
  public void setNo(int no) {
	  this.no = no;
  }
  
  public String getTitle() {
	  return title;
  }
  
  public void setTitle(String title) {
	  this.title = title;
  }
  
  public String getContents() {
	  return contents;
  }
  
  public void setContents(String contents) {
	  this.contents = contents;
  }
  
  public Date getStartDate() {
	  return startDate;
  }
  
  public void setStartDate(Date startDate) {
	  this.startDate = startDate;
  }
  
  public Date getEndDate() {
	  return endDate;
  }
  
  public void setEndDate(Date endDate) {
	  this.endDate = endDate;
  }
  
  public int getTotalHours() {
	  return dayHours;
  }
  
  public void setTotalHours(int totalHours) {
	  this.totalHours = totalHours;
  }
  
  public int getDayHours() {
	  return dayHours;
  }
  
  public void setDayHours(int dayHours) {
	  this.dayHours = dayHours;
  }
  
  
  
}
