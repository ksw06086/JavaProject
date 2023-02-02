package omok.game.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @Title: GameWindow.java
 * @Package com.crossing.view
 * @Description: TODO(            )
 * @author crossing
 * @date 2021 2 28    9:23:14
 * @version V1.0
 */
@SuppressWarnings("serial")
public class GameWindow extends JFrame implements MouseListener, Runnable {
 private int width, height;//     
 private int mouseX = 0, mouseY = 0, mapsX = 0, mapsY = 0;//     £¬         
 private int game_width = 600, game_height = 600;//       
 private BufferedImage bgImage = null;//     
 private int chessBoardItemWidth = 25;//          
 private Rectangle chessBoardRect = null;//       
 private BufferedImage offsetImg = new BufferedImage(game_width, game_height, BufferedImage.TYPE_4BYTE_ABGR);
 private Graphics g = offsetImg.getGraphics();//          
 private int[][] maps = new int[15][15];// 0   £¬1  £¬2  
 private boolean isBlack = true;//         
 private String message = "    ", whitemessage = "   ", blackmessage = "   ";//       £¬      
 //       
 private JButton btn_start, btn_exit, btn_settings;
 private JPanel operaterPanel;//     

 private int gametime = 0;//       £¨ £©
 private int blackTime = 0, whiteTime = 0;//        

 private Thread timeThread = new Thread(this);//          
// private boolean isLimitTime = false;

 public GameWindow() {
 setTitle("   ");
 setSize(game_width, game_height);
 setResizable(false);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 //       
 width = Toolkit.getDefaultToolkit().getScreenSize().width;
 height = Toolkit.getDefaultToolkit().getScreenSize().height;

 //       
 chessBoardRect = new Rectangle(50, 120, 370, 370);

 setLocation((width - game_width) / 2, (height - game_height) / 2);

 addMouseListener(this);

 //         
 initOeratePane();

 repaint();

 //     
 try {
 bgImage = ImageIO.read(new File("img/backgroung.png"));
// System.out.println(bgImage);
 } catch (IOException e) {
 e.printStackTrace();
 }
 setVisible(true);
 }

 /**
 *          
 */
 private void initTime() {
// System.out.println("isLimitTime:" + isLimitTime);
 if (gametime > 0) {

 timeThread.start();

 if (blackTime < 0) {
 JOptionPane.showMessageDialog(this, "      £¬    !");
 timeThread.interrupt();
 } else if (whiteTime < 0) {
 JOptionPane.showMessageDialog(this, "      £¬    !");
 timeThread.interrupt();
 }
 }
 }

 /**
 *          
 */
 private void initOeratePane() {
 btn_start = new JButton("    ");
 btn_settings = new JButton("    ");
 btn_exit = new JButton("    ");
 btn_start.addActionListener(new ActionListener() {

 @Override
 public void actionPerformed(ActionEvent e) {
 int select = JOptionPane.showConfirmDialog(getContentPane(), "        £¿");
 if (select == 0) {
  reStartGame();
 }

 }
 });
 btn_settings.addActionListener(new ActionListener() {

 @Override
 public void actionPerformed(ActionEvent e) {
 String select = "";
 select = JOptionPane.showInputDialog("       £¨  £©£¬  0    £º");
 if (select != null && !select.equals("")) {
  try {
  gametime = Integer.parseInt(select) * 60;
//  System.out.println("gametime:" + gametime);
//  isLimitTime = true;
//  System.out.println("  isLimitTime--" + isLimitTime);
  blackTime = gametime;
  whiteTime = gametime;
  if (gametime > 0) {
  blackmessage = blackTime / 3600 + ":" + blackTime / 60 % 60 + ":" + blackTime % 60;
  whitemessage = whiteTime / 3600 + ":" + whiteTime / 60 % 60 + ":" + whiteTime % 60;
//  timeThread.resume();
  } else {
  whitemessage = "   ";
  blackmessage = "   ";
  }
  initTime();
  repaint();
  } catch (Exception e2) {
  e2.printStackTrace();
  JOptionPane.showMessageDialog(getContentPane(), "       £¡");
  }

//  
 }
 }
 });
 btn_exit.addActionListener(new ActionListener() {

 @Override
 public void actionPerformed(ActionEvent e) {
 System.exit(0);
 }
 });

 operaterPanel = new JPanel();
 GridLayout layout = new GridLayout(0, 1, 100, 100);
 operaterPanel.setLayout(layout);
 operaterPanel.add(btn_start);
 operaterPanel.add(btn_settings);
 operaterPanel.add(btn_exit);
 getContentPane().add(operaterPanel, BorderLayout.EAST);
 }

 /**
 *       
 */
 protected void reStartGame() {
 isBlack = true;
 blackTime = gametime;
 whiteTime = gametime;
// for (int i = 0; i < maps[0].length; i++) {
// for (int j = 0; j < maps.length; j++) {
// maps[i][j] = 0;
// }
// }
 maps = new int[15][15];
 repaint();
 }

 @Override
 public void paint(Graphics g1) {
 super.paint(g);
 //     
 g.drawImage(bgImage, 20, 90, this);
 //       
 g.setColor(Color.black);
 g.setFont(new Font("  ", Font.BOLD, 30));
 g.drawString("    £º" + message, 100, 75);
 //     
 g.setColor(Color.gray);
 g.fillRect(50, 530, 200, 50);
 g.fillRect(300, 530, 200, 50);
 g.setColor(Color.black);
 g.setFont(new Font("  ", Font.BOLD, 20));
 g.drawString("    £º" + blackmessage, 60, 560);
 g.drawString("    £º" + whitemessage, 310, 560);
// g.setColor(Color.blue);
 //       
 for (int i = 0; i < 15; i++) {
 g.drawLine(60, 130 + i * chessBoardItemWidth, 410, 130 + i * chessBoardItemWidth);
 g.drawLine(60 + i * chessBoardItemWidth, 130, 60 + i * chessBoardItemWidth, 480);
 }
 //     
 g.fillOval(131, 200, 8, 8);
 g.fillOval(331, 200, 8, 8);
 g.fillOval(131, 400, 8, 8);
 g.fillOval(331, 400, 8, 8);
 g.fillOval(230, 299, 10, 10);

 //     
 for (int j = 0; j < maps.length; j++) {
 for (int i = 0; i < maps[0].length; i++) {
 if (maps[j][i] == 1) {
  g.setColor(Color.black);
  g.fillOval(50 + i * chessBoardItemWidth, 120 + j * chessBoardItemWidth, 20, 20);
 }
 if (maps[j][i] == 2) {
  g.setColor(Color.white);
  g.fillOval(50 + i * chessBoardItemWidth, 120 + j * chessBoardItemWidth, 20, 20);
 }
 }
 }

 //          
 g1.drawImage(offsetImg, 0, 0, this);
 }

 @Override
 public void mouseClicked(MouseEvent e) {
 mouseX = e.getX();
 mouseY = e.getY();
 //     
 if (chessBoardRect.contains(mouseX, mouseY)) {
 mapsX = (mouseX - 50) / chessBoardItemWidth;
 mapsY = (mouseY - 120) / chessBoardItemWidth;
// System.out.println("mapsXY:" + mapsX + "," + mapsY);
// maps[mapsY][mapsX] = (isBlack == true ? 1 : 2);

 if (maps[mapsY][mapsX] == 0) {
 if (isBlack) {
  maps[mapsY][mapsX] = 1;
  isBlack = false;
  message = "    ";
 } else {
  maps[mapsY][mapsX] = 2;
  isBlack = true;
  message = "    ";
 }
 checkGame();
 }

 }
 repaint();
 }

 /**
 *         
 */
 private void checkGame() {
 int color = maps[mapsY][mapsX];
 boolean isWin = false;

// System.out.println("mapsXY:" + mapsX + "," + mapsY);

 isWin = checkChess(1, 0, color) || checkChess(0, 1, color) || checkChess(1, 1, color)
 || checkChess(1, -1, color);
 if (isWin) {
 if (color == 1)
 JOptionPane.showMessageDialog(this, "    £¡");
 else {
 JOptionPane.showMessageDialog(this, "    £¡");
 }
 reStartGame();
// new GameWindow();
 }

 }

 /**
 * @param xChange    1,0,-1
 * @param yChange    1,0,-1
 * @param color
 */
 private boolean checkChess(int xChange, int yChange, int color) {
 boolean isWin = false;

 int count = 1, tempX = xChange, tempY = yChange;
 while ((mapsX + tempX) >= 0 && (mapsX + tempX) < 15 && (mapsY + tempY) >= 0 && (mapsY + tempY) < 15
 && maps[mapsY + tempY][mapsX + tempX] == color) {
 count++;
 if (tempX == 0 && tempY == 0)
 break;
 if (tempX > 0)
 tempX++;
 if (tempX < 0)
 tempX--;
 if (tempY > 0)
 tempY++;
 if (tempY < 0)
 tempY--;
 }
 tempX = xChange;
 tempY = yChange;
 while ((mapsX - tempX) >= 0 && (mapsX - tempX) < 15 && (mapsY - tempY) >= 0 && (mapsY - tempY) < 15
 && maps[mapsY - tempY][mapsX - tempX] == color) {
 count++;
 if (tempX == 0 && tempY == 0)
 break;
 if (tempX > 0)
 tempX++;
 if (tempX < 0)
 tempX--;
 if (tempY > 0)
 tempY++;
 if (tempY < 0)
 tempY--;
 }
// System.out.println("count:" + count);
 if (count >= 5) {
 return true;
 }
 return isWin;
 }

 @Override
 public void mousePressed(MouseEvent e) {

 }

 @Override
 public void mouseReleased(MouseEvent e) {

 }

 @Override
 public void mouseEntered(MouseEvent e) {
// mouseX = e.getX();
// mouseY = e.getY();
// System.out.println("        ");
// System.out.println("    £º" + mouseX + "," + mouseY);
// if (chessBoardRect.contains(mouseX, mouseY)) {
// System.out.println("    ");
// if (isBlack) {
// g.setColor(Color.black);
// } else {
// g.setColor(Color.white);
// }
// g.fillOval(mouseX, mouseY, 20, 20);
// repaint();
// }
 }

 @Override
 public void mouseExited(MouseEvent e) {

 }

 @Override
 public void run() {
 while (true) {
// System.out.println("isblack:" + isBlack);
 if (isBlack) {
 blackTime--;
 } else {
 whiteTime--;
 }
 blackmessage = blackTime / 3600 + ":" + blackTime / 60 % 60 + ":" + blackTime % 60;
 whitemessage = whiteTime / 3600 + ":" + whiteTime / 60 % 60 + ":" + whiteTime % 60;
// System.out.println("blackTime:" + blackTime);
// System.out.println("whiteTime:" + whiteTime);
 repaint();
 if (blackTime < 0) {
 JOptionPane.showMessageDialog(getContentPane(), "      £¬    !");
 timeThread.interrupt();
 new GameWindow();
 break;
 } else if (whiteTime < 0) {
 JOptionPane.showMessageDialog(getContentPane(), "      £¬    !");
 timeThread.interrupt();
 new GameWindow();
 break;
 }
 try {
 Thread.sleep(1000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 }

}
