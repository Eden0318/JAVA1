package ams;

public class AmsField {
	//항공사, 항공기번호, 최대승객수, 출발지, 도착지
	
	String [][]arrPlane = new String[100][5];
	int cnt;
	
	//추가하기
	void insert(String [] arPlane) {
		arrPlane[cnt] = arPlane; 
		cnt++;
		
	}
	
	
	//검색
	void search() {
		
	}
	
	//수정하기
	void update() {
		
	}
	
	//삭제하기
	void delete() {
		
	}
	
	//"목록보기
	void show() {
		
	}

}
