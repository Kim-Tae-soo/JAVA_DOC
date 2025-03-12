package kr.or.ddit.basic;
// JavaDoc 파일 만들기 예제

/**
 * @author 홍길동
 * @version 1.0
 * 
 * <p>
 * 파일명 : JavaDocTest.java<br>
 * 설 명 : JavaDoc문서 작성을 위한 연습용 interface<br><br>
 * 
 * 변경 이력<br>
 * -----------------------------<br>
 * 변경일자 : 2025-02-25<br>
 * 담당자 : 홍길동<br>
 * 변경내용 : 최초 생성<br>
 * -----------------------------<br>
 * </p>
 */
public interface JavaDocTest {
	
	// -charset utf-8 -encoding utf-8
	
	/**
	 * 메서드명 : methodTest<br>
	 * 설 명 : 정수형 매개변수가 2개 있고 반환값이 없는 메서드<br>
	 * @param a 첫번째 매개변수(정수형)<br>
	 * @param b 두번째 매개변수(정수형)<br>
	 */
	
	public void methodTest(int a, int b);
	
	/**
	 * 메서드명 : methodAdd<br>
	 * 설 명 : 매개변수 2개 이고 반환값이 있는 메서드<br>
	 * @param x 첫번째 정수형
	 * @param y 두번째 정수형
	 * @return 처리된 결과를 정수형으로 반환
	 */
	public int methodAdd(int x, int y);
	
	/**
	 * 메서드명 : methodInput<br>
	 * 설 명 : 데이터를 입력 받아 정수형으로 반환하는 메서드<br>
	 * @return 입력 받은 정수형 데이터
	 */
	public int methodInput();
	
	
}
