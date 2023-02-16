package ch02;

public class Tri2 {

	public static void main(String[] args) {
		int num = 243; // 게시판에 저장된 글 수 270개일 경우도 계산
		int noOfPage = 10; // 한페이지에 글을 10개씩 게시
		int page = num % noOfPage == 0? num / noOfPage : num / noOfPage+1;
	
		System.out.println(page);
	}

}
