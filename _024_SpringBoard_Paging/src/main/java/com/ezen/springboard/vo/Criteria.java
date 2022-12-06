package com.ezen.springboard.vo;

public class Criteria {
	// 현재 보고있는 페이지 번호
	private int pageNum;
	// 한 페이지에 표출한 게시글의 갯수
	private int amount;
	// 페이지 표출 시작 번호
	private int startNum;

	
	// 기본 생성자
	public Criteria() {
		// 페이지 번호와 갯수를 지정하지 않았을 때, 1페이당 10개씩 보이도록 설정
		this(1, 10); 
	}
	// 생성자
	public Criteria(int pageNum, int amount){
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	
	
	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", startNum=" + startNum + "]";
	}
	
	
	
}
