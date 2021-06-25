

package in.smartprogramming.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TicTacToe implements ActionListener {
    
    JFrame jf;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
     String  str;
     boolean win;
     Color color1;
     JTextField jt1;
   
 int    count = 0 ;
    
    TicTacToe(){
         jf = new JFrame("TicTacToe By Tiraj");
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gd = new GridLayout(3,3);
        jf.setLayout(gd);
        
        
         jb1 = new JButton();
         jb1.addActionListener(this);
         jf.add(jb1);
        
         jb2 = new JButton();
         jb2.addActionListener(this);
         jf.add(jb2);
        
        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);
        
        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);
        
         jb5 = new JButton();
         jb5.addActionListener(this);
        jf.add(jb5);
        
        jb6 = new JButton();
          jb6.addActionListener(this);
        jf.add(jb6);
        
        jb7 = new JButton();
          jb7.addActionListener(this);
        jf.add(jb7);
        
         jb8 = new JButton();
           jb8.addActionListener(this);
        jf.add(jb8);
        
        jb9 = new JButton();
          jb9.addActionListener(this);
        jf.add(jb9);
        
        
        jf.setVisible(true);
    }
    
    
    
    public static void main(String[] args)
    {
         this.new TicTacToe();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count= count+1;
       
        if(count % 2 == 0){
            str = "O";   
            color1=Color.RED;
          }
        else
        {  color1 = Color.YELLOW;
             str = "X";
          
                }    
        
        
        
        
       if(e.getSource()== jb1){
           jb1.setBackground(color1);
           jb1.setText(str);
             Font f = new Font("Arial", 20,80);
             jb1.setFont(f);
             jb1.setEnabled(false);
             
       }
        if(e.getSource()== jb2){
             jb2.setBackground(color1);
           jb2.setText(str);
            Font f = new Font("Arial", 20,80);
             jb2.setFont(f);
              jb2.setEnabled(false);
             
       }
        
         if(e.getSource()== jb3){
              jb3.setBackground(color1);
           jb3.setText(str);
            Font f = new Font("Arial", 20,80);
             jb3.setFont(f);
              jb3.setEnabled(false);
             
       }
          if(e.getSource()== jb4){
               jb4.setBackground(color1);
           jb4.setText(str);
            Font f = new Font("Arial", 20,80);
             jb4.setFont(f);
              jb4.setEnabled(false);
             
       }
          
           if(e.getSource()== jb5){
                jb5.setBackground(color1);
           jb5.setText(str);
            Font f = new Font("Arial", 20,80);
             jb5.setFont(f);
              jb5.setEnabled(false);
             
       }
            if(e.getSource()== jb6){
                 jb6.setBackground(color1);
           jb6.setText(str);
            Font f = new Font("Arial", 20,80);
             jb6.setFont(f);
              jb6.setEnabled(false);
             
       }
             if(e.getSource()== jb7){
                  jb7.setBackground(color1);
           jb7.setText(str);
            Font f = new Font("Arial", 20,80);
             jb7.setFont(f);
              jb7.setEnabled(false);
             
       }
             
              if(e.getSource()== jb8){
                   jb8.setBackground(color1);
           jb8.setText(str);
            Font f = new Font("Arial", 20,80);
             jb8.setFont(f);
              jb8.setEnabled(false);
             
       }
         if(e.getSource()== jb9){
              jb9.setBackground(color1);
           jb9.setText(str);
            Font f = new Font("Arial", 20,80);
             jb9.setFont(f);
              jb9.setEnabled(false);
             
       }
           winnningPossibility();
           whoWins();
    }

         void winnningPossibility()
         {
             
        if(jb1.getText() == jb2.getText() &&  jb1.getText() == jb3.getText() &&jb1.getText()!= "")
        {
           JOptionPane.showMessageDialog(jf,str+"Wins");
           win=true;
        }
        
       else if(jb4.getText() == jb5.getText() &&  jb4.getText() == jb6.getText() &&jb4.getText()!= "")
        {
            JOptionPane.showMessageDialog(jf,str+"Wins");
             win=true;
        }
        
       else  if(jb7.getText() == jb8.getText() &&  jb7.getText() == jb9.getText() &&jb7.getText()!= "")
        {
            JOptionPane.showMessageDialog(jf,str+"Wins");
             win=true;
        }
      else   if(jb1.getText() == jb4.getText() &&  jb1.getText() == jb7.getText() &&jb1.getText()!= "")
        {
            JOptionPane.showMessageDialog(jf,str+"Wins");
             win=true;
        }
       else   if(jb2.getText() == jb5.getText() &&  jb2.getText() == jb8.getText() &&jb2.getText()!= "")
        {
            JOptionPane.showMessageDialog(jf,str+"Wins");
             win=true;
        }
         else  if(jb3.getText() == jb6.getText() &&  jb3.getText() == jb9.getText() &&jb3.getText()!= "")
        {
            JOptionPane.showMessageDialog(jf,str+"Wins");
             win=true;
        }
           
          
       
         }
         
         void whoWins(){
             if(win==true)
             {
                 JOptionPane.showMessageDialog(jf,str+"Wins");
                 restart();
             }
             else if(win==false && count == 9)
             {
                 JOptionPane.showMessageDialog(jf,"Match Draw"); 
                 restart();
             }
         }
         
         
         void restart()
         {
           int i =  JOptionPane.showConfirmDialog(jf, "Do you want to restart the Game");
          if(i==0)
          {
             jb1.setText("");
             jb2.setText("");
             jb3.setText("");
             jb4.setText("");
             jb5.setText("");
             jb6.setText("");
             jb7.setText("");
             jb8.setText("");
             jb9.setText("");
             
             
             jb1.setBackground(null);
             jb2.setBackground(null);
             jb3.setBackground(null);
              jb4.setBackground(null);
             jb5.setBackground(null);
             jb6.setBackground(null);
              jb7.setBackground(null);
             jb8.setBackground(null);
             jb9.setBackground(null);
             
             
             
             btnSetEnabling(true); 
             
            
             str = "";
             count=0;
             win = false;
          }
          else if(i == 1){
              
              System.exit(0);
              
          }
          
          else
          {
              btnSetEnabling(false);
           
             
          }
          
         }
         
         void btnSetEnabling(boolean b)
         {
              jb1.setEnabled(b);
             jb2.setEnabled(b);
             jb3.setEnabled(b);
             jb4.setEnabled(b);
             jb5.setEnabled(b);
             jb6.setEnabled(b);
             jb7.setEnabled(b);
             jb8.setEnabled(b);
             jb9.setEnabled(b);
         }
         
    }
    

