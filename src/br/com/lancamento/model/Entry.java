package br.com.lancamento.model;

import java.util.Date;

public class Entry {

	int id;
	double value;
	Date expenseDate;
	Date entryDate;
	String expenseType;
	String comment;

	public Entry(int id, double value, Date expenseDate, Date entryDate, String expenseType, String comment) {
		
		this.id = id;
		this.value = value;
		this.expenseDate = expenseDate;
		this.entryDate = entryDate;
		this.expenseType = expenseType;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getExpenseDate() {
		return expenseDate;
	}

	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String toString(){
		
		return "{'id':'" + this.id + "','comment':'" + this.comment + "'}";
	}
}
