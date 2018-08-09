package com.entity;

public class Work {
	private int id;
	private int rid;
	private int bid;
	private String borrowdate;
	private String backdate;
	private int borrowtimes;
	private int backtimes;
	private String complete;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(String borrowdate) {
		this.borrowdate = borrowdate;
	}
	public String getBackdate() {
		return backdate;
	}
	public void setBackdate(String backdate) {
		this.backdate = backdate;
	}
	public int getBorrowtimes() {
		return borrowtimes;
	}
	public void setBorrowtimes(int borrowtimes) {
		this.borrowtimes = borrowtimes;
	}
	public int getBacktimes() {
		return backtimes;
	}
	public void setBacktimes(int backtimes) {
		this.backtimes = backtimes;
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	@Override
	public String toString() {
		return "Work [id=" + id + ", rid=" + rid + ", bid=" + bid
				+ ", borrowdate=" + borrowdate + ", backdate=" + backdate
				+ ", borrowtimes=" + borrowtimes + ", backtimes=" + backtimes
				+ ", complete=" + complete + "]";
	}
	
	
}
