package com.mis.domain;

public class Criteria {

	private int page; // ������ ������
	private int perPageNum; // ȭ�鿡 ������ �Խñ� ��

	// MyBatis���� ����� ���� ������ ����
	private int startPage;

	public Criteria() { // �����ڷ� ����¡ �ʱ�ȭ

		this.page = 1;
		this.perPageNum = 10;

	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {

		// ����¡�� ���� ���� ���� ó�� 0���� �۰ų� ���� ���
		if (page <= 0) {
			this.page = 1;
			return;
		}

		this.page = page;
	}
	
	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	// method for MyBatis SQL Mapper
	public int getPageEnd() {

		return this.startPage + 9;

	}

	public int getPageStart() {

		this.startPage = (this.page * this.perPageNum) - 9;
		return this.startPage;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", startPage=" + startPage + "]";
	}
	
	
}
