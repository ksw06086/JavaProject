package network.url;

public class URLConnectionMemo {

	/**
	 * <Ŭ����>
	 * - URLConnection : ������ �������� URL�� �����Ͽ� �����͸� ����, ������ �� �ֵ��� ����(URLŬ������ ����ϳ� ���� ȿ������)
	 * 
	 * <��ü ���� ���>
	 * - URL.openConnection() �̿�
	 * + URL SiteName = new URL("http://���ͳ� ����Ʈ �ּ�");
	 * + URLConnection Ucn = SiteName.openConnection();
	 * - URLConnection ������ �̿�
	 * + URL SiteName = new URL("http://���ͳ� ����Ʈ �ּ�");
	 * + URLConnection Ucn = new URLConnection(SiteName);
	 * + Ucn.connect();
	 * 
	 * <�޼ҵ�>
	 * - abstract void connect()								- URL�� ���� �����Ǵ� �ܺ� ���ҽ��� ��� ���� ����
	 * - Object getContent()										- URL ���ῡ�� ����Ʈ�� ������
	 * - String getContentEncoding()						- ����Ʈ ���ڵ� �ʵ带 ��ȯ
	 * - int getContentLength()								- ����Ʈ ���� �ʵ� ��ȯ
	 * - String getContentType()								- ����Ʈ Ÿ�� �ʵ� ��ȯ
	 * - boolean getDoInput()									- URLConnection ��ü�� doInput �ʵ� �� ��ȯ
	 * - boolean getDoOutput()									- URLConnection ��ü�� doOutput �ʵ� �� ��ȯ
	 * - InputStream getInputStream()						- ������ ���ῡ�� �����͸� ���� �Է� ��Ʈ�� ��ȯ
	 * - OutputStream getOutputStream()					- ������ ����� �����͸� ����� ��� ��Ʈ�� ��ȯ
	 * - URL getURL()												- URLConnection ��ü�� URL �ʵ� �� ��ȯ
	 * - void setDoInput(boolean doIn)						- URLConnection ��ü�� doInput �ʵ� �� ����
	 * - void setDoOutput(boolean doOut)					- URLConnection ��ü�� doOutput �ʵ� �� ����
	 * 
	 * +++ doIn/doOut �ʵ�� �Է�/����� ���Ͽ� ����ϰ� ���� �� ����ġ ������ �Ѵ�. +++
	 * ***/
	
}
