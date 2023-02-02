package thread1;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 현재 시각 실시간 보이게 하기
// 동기화 방법 : 싱크로나이즈를 넣어주면 됨
// 프로듀셔와 컨슈머 => 데이터를 서로 주고 받을 때 프로듀셔와 컨슈머임 => 데이터를 주고 받아야할 때 프로듀셔와 컨슈머 사용함
// 프로듀셔와 컨슈머 역할 할 때 필요한 것이  wait과 notify임
/** 
 * Buffer : 창고 클래스 { 쌀통(data) }이 안에 있음 => 안에 쌀을 채움
 * Flag 변수 - available ( O - 채워져 있음 / X - 비어 있음 )
 * 채우는 역할 - Producer(생산자 Thread)<push()> / 가져가는 역할 - Consumer(소비자 Thread)<get()>
 * 버퍼에 겟이나 푸쉬 메소드에 크리티컬 섹션을 넣어주면 됨
 * 
 * */
public class RunnableTest2 extends JFrame implements Runnable{
	JLabel lbl = new JLabel("", JLabel.CENTER);
	
	public RunnableTest2() {
		add("Center", lbl);
		lbl.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200,200,300,200);
		setVisible(true);

		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		Calendar calendar = null;
		while(true) {
			calendar = Calendar.getInstance();
			int h = calendar.get(Calendar.HOUR_OF_DAY);
			int m = calendar.get(Calendar.MINUTE);
			int s = calendar.get(Calendar.SECOND);
			
			lbl.setText(h + "시 " + m + "분 " + s + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new RunnableTest2();
	}
}
