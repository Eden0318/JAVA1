package ams;

public class AmsField {
	//항공사, 항공기번호, 최대승객수, 출발지, 도착지
	
	//5개(항공사, 항공기번호, 최대승객수, 출발지, 도착지)의 특징을 가진 비행기 여러대
	//한 행이 하나의 비행기에 대한 정보, 한 열이 그 주제.
	String [][]arrPlane = new String[100][5]; //비행기 여러대
	int cnt; //arrPlane의 몇번째 방?, 전역변수는 자동 초기화
	int rLength = cnt; //100
	int cLength = arrPlane[0].length;//5
	
	//추가하기
	void insert(String [] arPlane) {//매개변수5개(항공사, 항공번호, 승객수 등)를 5칸짜리 배열 하나로 받음
		arrPlane[cnt] = arPlane; //2차원배열[0]=1차원배열; arrPlane[0]은 첫번째 비행기임
		//arrPlane[0]이라면 0번째 방에 첫번째정보(arPlane)이 담길것임
		cnt++;
	}
	
	  
	//검색하기
	String search(String keyword) { //항공사로 검색
		//예를들어 대한항공으로 검색하면 대한항공이 몇개가 나올지 모르니까
		//arIndex의 크기를 정할 수 없다
		int arIndex[];
		
		String result = "";
		int cnt=0;
		
		//for문이 끝나야지 검색결과를 알 수 있다
		for (int i = 0; i < rLength; i++) {
				if(keyword.equals(arrPlane[i][0])) { //항공사는 1열 즉 인덱스[0]
					cnt++;
					result+=""+i+","; //행번호를 여기서 알 수 있다. 몇번의 항공사인지.
			}	
		}
		//for문에서 증가된 cnt만큼 칸 수를 만들어주면 된다.
		arIndex=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			arIndex[i]=Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex);
	}
	
	
	//수정하기
	void update() {
		
	}
	
	//삭제하기
	void delete() {
		
	}
	
	//목록보기
	String show() {
		
		String result = "항공사, 항공기번호, 최대승객수(명), 출발지, 도착지\n";
		
		for (int i = 0; i < rLength+1; i++) {
			result += "♥"; //새로운 비행기일때마다 하트가 붙는다.
			for (int j = 0; j < cLength; j++) {
				result += j==cLength-1 ? arrPlane[i][j] : arrPlane[i][j]+ ",  ";
			}
			result += "\n";
		}
		if(cnt == 0) result="목록없음";
		return result;
	}
	
	//검색결과 보기 ex.항공:대한항공
	String show(int[]arIndex) {
		String result = "항공사, 항공기번호, 최대승객수(명), 출발지, 도착지\n";

		for (int i = 0; i < arIndex.length; i++) {
			result += "♥"; 
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j]; //대한항공의 항공기번호, 최대승객수 이런식으로
				result += j==cLength-1?"":", ";
			}
			//하나의 항공기 정보가 다 담겼으면! 역슬래쉬 붙여준다
			result+="\n";
		}
		if(arIndex.length == 0) result="검색결과없음";
		return result;
	}
}
