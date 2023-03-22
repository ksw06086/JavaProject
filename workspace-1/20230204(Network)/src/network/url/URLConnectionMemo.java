package network.url;

public class URLConnectionMemo {

	/**
	 * <클래스>
	 * - URLConnection : 지정한 원격지의 URL에 접속하여 데이터를 전송, 수신할 수 있도록 해줌(URL클래스와 비슷하나 더욱 효과적임)
	 * 
	 * <객체 생성 방법>
	 * - URL.openConnection() 이용
	 * + URL SiteName = new URL("http://인터넷 사이트 주소");
	 * + URLConnection Ucn = SiteName.openConnection();
	 * - URLConnection 생성자 이용
	 * + URL SiteName = new URL("http://인터넷 사이트 주소");
	 * + URLConnection Ucn = new URLConnection(SiteName);
	 * + Ucn.connect();
	 * 
	 * <메소드>
	 * - abstract void connect()		- URL에 의해 참조되는 외부 리소스와 통신 연결 설정
	 * - Object getContent()			- URL 연결에서 컨텐트를 가져옴
	 * - String getContentEncoding()	- 컨텐트 인코딩 필드를 반환
	 * - int getContentLength()			- 컨텐트 길이 필드 반환
	 * - String getContentType()		- 컨텐트 타입 필드 반환
	 * - boolean getDoInput()			- URLConnection 객체의 doInput 필드 값 반환
	 * - boolean getDoOutput()			- URLConnection 객체의 doOutput 필드 값 반환
	 * - InputStream getInputStream()	- 설정된 연결에서 데이터를 읽을 입력 스트림 반환
	 * - OutputStream getOutputStream()	- 설정된 연결로 데이터를 출력할 출력 스트림 반환
	 * - URL getURL()					- URLConnection 객체의 URL 필드 값 반환
	 * - void setDoInput(boolean doIn)	- URLConnection 객체의 doInput 필드 값 설정
	 * - void setDoOutput(boolean doOut)- URLConnection 객체의 doOutput 필드 값 설정
	 * 
	 * +++ doIn/doOut 필드로 입력/출력을 위하여 사용하고 싶을 때 스위치 역할을 한다. +++
	 * ***/
	
}
