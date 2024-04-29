import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;


public class Main extends JFrame{
    private static int chn=0;
    private static int cha=0;
    private static String result1 ="";
    private static String result2 ="";
    private static String action ="";
    static void calc(){
        float a=Float.parseFloat(result1);
        float b=Float.parseFloat(result2);
        if(action=="-")
            a-=b;
        if(action=="+")
            a+=b;
        if(action=="*")
            a*=b;
        if(action=="/")
            a/=b;
        result1=Float.toString(a);
        action="";
        cha=0;
        result2="";
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("cal");
        Dimension framesize = new Dimension(400,600);
        frame.setSize(framesize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0, 400,600);
        JLabel label = new JLabel("enter number");

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b_ = new JButton(".");
        JButton beq = new JButton("=");
        JButton bmu = new JButton("*");
        JButton bmi = new JButton("-");
        JButton bpl = new JButton("+");
        JButton bdi = new JButton("/");
        JButton bcl = new JButton("clear");
        JButton bdl = new JButton("delete");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chn==1) {
                    if(cha==1)
                        result2+="0";
                    else
                        result1+="0";
                    label.setText(result1+action+result2);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
        b_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(chn==1) {
                    if(cha==1)
                        result2+=".";
                    else
                        result1+=".";
                    label.setText(result1+action+result2);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="1";
                else
                    result1+="1";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="2";
                else
                    result1+="2";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="3";
                else
                    result1+="3";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="4";
                else
                    result1+="4";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="5";
                else
                    result1+="5";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="6";
                else
                    result1+="6";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="7";
                else
                    result1+="7";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="8";
                else
                    result1+="8";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chn=1;
                if(cha==1)
                    result2+="9";
                else
                    result1+="9";
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bmi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==0) {
                    chn=0;
                    cha=1;
                }
                else if(chn!=0) {
                    calc();
                    cha=1;
                }
                action="-";
                label.setText(result1 + action + result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bpl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==0) {
                    chn=0;
                    cha=1;
                }
                else if(chn!=0) {
                    calc();
                    cha=1;
                }
                action="+";
                label.setText(result1 + action + result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bmu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==0) {
                    chn=0;
                    cha=1;
                }
                else if(chn!=0) {
                    calc();
                    cha=1;
                }
                action="*";
                label.setText(result1 + action + result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bdi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==0) {
                    chn=0;
                    cha=1;
                }
                else if(chn!=0) {
                    calc();
                    cha=1;
                }
                action="/";
                label.setText(result1 + action + result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        beq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==1&&chn==1)
                    calc();
                label.setText(result1 + action + result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bcl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cha=0;
                chn=0;
                action="";
                result1="";
                result2="";
                label.setText("enter number");
                frame.revalidate();
                frame.repaint();
            }
        });
        bdl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cha==0){
                    if(chn==1)
                        result1 = result1.substring(0,result1.length()-1);
                    if(result1.length()==0)
                        chn=0;
                }
                else{
                    if(chn==0){
                        action="";
                        cha=0;
                    }
                    else{
                        result2 = result2.substring(0,result2.length()-1);
                        if(result1.length()==0)
                            chn=0;
                    }
                }
                label.setText(result1+action+result2);
                frame.revalidate();
                frame.repaint();
            }
        });
        label.setBounds(40,10,240,50);
        b0.setBounds(40,100,70,70);
        b1.setBounds(120,100,70,70);
        b2.setBounds(200,100,70,70);
        b3.setBounds(280,100,70,70);
        b4.setBounds(40,180,70,70);
        b5.setBounds(120,180,70,70);
        b6.setBounds(200,180,70,70);
        b7.setBounds(280,180,70,70);
        b8.setBounds(40,260,70,70);
        b9.setBounds(120,260,70,70);
        b_.setBounds(200,260,70,70);
        beq.setBounds(280,260,70,70);
        bmi.setBounds(40,340,70,70);
        bpl.setBounds(120,340,70,70);
        bmu.setBounds(200,340,70,70);
        bdi.setBounds(280,340,70,70);
        bcl.setBounds(40,440,100,70);
        bdl.setBounds(250,440,100,70);
        label.setForeground(Color.white);
        panel.setBackground(Color.gray);
        panel.add(label);
        panel.add(b0);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b_);
        panel.add(beq);
        panel.add(bmi);
        panel.add(bpl);
        panel.add(bmu);
        panel.add(bdi);
        panel.add(bcl);
        panel.add(bdl);
        frame.add(panel);
        frame.setVisible(true);
    }
}
