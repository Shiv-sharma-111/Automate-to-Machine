/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robottesting;

/**
 *
 * @author SHIV SHARMA
 */
import com.sun.glass.events.KeyEvent;
import java.awt.Robot;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
public class RobotTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Robot rb= new Robot();
        String message="This Is Shiv Sharma From Kanpur ,a chemical engineer with positive coding attitude........";
        Runtime rt=Runtime.getRuntime();
        String str="notepad.exe";
        rt.exec(str);
        rb.delay(3000);
        char ch[]=message.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='A')
            {
                rb.keyPress(KeyEvent.VK_A);
                rb.keyRelease(KeyEvent.VK_A);
                rb.delay(20);
            }
            else if(ch[i]=='b'||ch[i]=='B')
            {
                rb.keyPress(KeyEvent.VK_B);
                rb.keyRelease(KeyEvent.VK_B);
                rb.delay(20);
            }
            else if(ch[i]=='c'||ch[i]=='C')
            {
                rb.keyPress(KeyEvent.VK_C);
                rb.keyRelease(KeyEvent.VK_C);
                rb.delay(20);
            }
            else if(ch[i]=='d'||ch[i]=='D')
            {
                rb.keyPress(KeyEvent.VK_D);
                rb.keyRelease(KeyEvent.VK_D);
                rb.delay(20);
            }
            else if(ch[i]=='e'||ch[i]=='E')
            {
                rb.keyPress(KeyEvent.VK_E);
                rb.keyRelease(KeyEvent.VK_E);
                rb.delay(20);
            }
            else if(ch[i]=='f'||ch[i]=='F')
            {
                rb.keyPress(KeyEvent.VK_F);
                rb.keyRelease(KeyEvent.VK_F);
                rb.delay(20);
            }
            else if(ch[i]=='g'||ch[i]=='G')
            {
                rb.keyPress(KeyEvent.VK_G);
                rb.keyRelease(KeyEvent.VK_G);
                rb.delay(20);
            }
            else if(ch[i]=='h'||ch[i]=='H')
            {
                rb.keyPress(KeyEvent.VK_H);
                rb.keyRelease(KeyEvent.VK_H);
                rb.delay(20);
            }
            else if(ch[i]=='i'||ch[i]=='I')
            {
                rb.keyPress(KeyEvent.VK_I);
                rb.keyRelease(KeyEvent.VK_I);
                rb.delay(20);
            }
            else if(ch[i]=='j'||ch[i]=='J')
            {
                rb.keyPress(KeyEvent.VK_J);
                rb.keyRelease(KeyEvent.VK_J);
                rb.delay(20);
            }
            else if(ch[i]=='k'||ch[i]=='K')
            {
                rb.keyPress(KeyEvent.VK_K);
                rb.keyRelease(KeyEvent.VK_K);
                rb.delay(20);
            }
            else  if(ch[i]=='l'||ch[i]=='L')
            {
                rb.keyPress(KeyEvent.VK_L);
                rb.keyRelease(KeyEvent.VK_L);
                rb.delay(20);
            }
            else if(ch[i]=='m'||ch[i]=='M')
            {
                rb.keyPress(KeyEvent.VK_M);
                rb.keyRelease(KeyEvent.VK_M);
                rb.delay(20);
            }
            else if(ch[i]=='n'||ch[i]=='N')
            {
                rb.keyPress(KeyEvent.VK_N);
                rb.keyRelease(KeyEvent.VK_N);
                rb.delay(20);
            }
            else if(ch[i]=='o'||ch[i]=='O')
            {
                rb.keyPress(KeyEvent.VK_O);
                rb.keyRelease(KeyEvent.VK_O);
                rb.delay(20);
            }
            else if(ch[i]=='p'||ch[i]=='P')
            {
                rb.keyPress(KeyEvent.VK_P);
                rb.keyRelease(KeyEvent.VK_P);
                rb.delay(20);
            }
            else if(ch[i]=='q'||ch[i]=='Q')
            {
                rb.keyPress(KeyEvent.VK_Q);
                rb.keyRelease(KeyEvent.VK_Q);
                rb.delay(20);
            }
            else if(ch[i]=='r'||ch[i]=='R')
            {
                rb.keyPress(KeyEvent.VK_R);
                rb.keyRelease(KeyEvent.VK_R);
                rb.delay(20);
            }
            else if(ch[i]=='s'||ch[i]=='S')
            {
                rb.keyPress(KeyEvent.VK_S);
                rb.keyRelease(KeyEvent.VK_S);
                rb.delay(20);
            }
            else if(ch[i]=='t'||ch[i]=='T')
            {
                rb.keyPress(KeyEvent.VK_T);
                rb.keyRelease(KeyEvent.VK_T);
                rb.delay(20);
            }
            else if(ch[i]=='u'||ch[i]=='U')
            {
                rb.keyPress(KeyEvent.VK_U);
                rb.keyRelease(KeyEvent.VK_U);
                rb.delay(20);
            }
            else if(ch[i]=='v'||ch[i]=='V')
            {
                rb.keyPress(KeyEvent.VK_V);
                rb.keyRelease(KeyEvent.VK_V);
                rb.delay(20);
            }
            else if(ch[i]=='w'||ch[i]=='W')
            {
                rb.keyPress(KeyEvent.VK_W);
                rb.keyRelease(KeyEvent.VK_W);
                rb.delay(20);
            }
            else if(ch[i]=='x'||ch[i]=='X')
            {
                rb.keyPress(KeyEvent.VK_X);
                rb.keyRelease(KeyEvent.VK_X);
                rb.delay(20);
            }
            else if(ch[i]=='y'||ch[i]=='Y')
            {
                rb.keyPress(KeyEvent.VK_Y);
                rb.keyRelease(KeyEvent.VK_Y);
                rb.delay(20);
            }
            else if(ch[i]=='z'||ch[i]=='Z')
            {
                rb.keyPress(KeyEvent.VK_Z);
                rb.keyRelease(KeyEvent.VK_Z);
                rb.delay(20);
            }
            else if(ch[i]==' ')
            {
                rb.keyPress(KeyEvent.VK_SPACE);
                rb.keyRelease(KeyEvent.VK_SPACE);
                rb.delay(20);
            }
            else if(ch[i]==',')
            {
                rb.keyPress(KeyEvent.VK_COMMA);
                rb.keyRelease(KeyEvent.VK_COMMA);
                rb.delay(20);
            }
            else if(ch[i]=='.')
            {
                rb.keyPress(KeyEvent.VK_DECIMAL);
                rb.keyRelease(KeyEvent.VK_DECIMAL);
                rb.delay(20);
            }
        }
        //For maximizing the Window----
        rb.keyPress(KeyEvent.VK_WINDOWS);
        rb.keyPress(KeyEvent.VK_UP);
        rb.keyRelease(KeyEvent.VK_UP);
        rb.keyRelease(KeyEvent.VK_WINDOWS);
        //Set The Mouse position
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        double width= screenSize.getWidth();
        double height= screenSize.getHeight();
        rb.mouseMove((int) width,0);
        
        rb.mousePress(InputEvent.getMaskForButton(1));
        rb.mouseRelease(InputEvent.getMaskForButton(1));
        rb.delay(500);
        rb.keyPress(KeyEvent.VK_RIGHT);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.delay(5000);
        
        
        
        
        
        
        
        
        //Program to shut down Machine Automatically
        rb.keyPress(KeyEvent.VK_WINDOWS);
        rb.keyPress(KeyEvent.VK_X);
        rb.keyRelease(KeyEvent.VK_WINDOWS);
        rb.keyRelease(KeyEvent.VK_X);
        System.err.println("After Window");
        rb.delay(1000);
        rb.keyPress(KeyEvent.VK_UP);
        rb.keyRelease(KeyEvent.VK_UP);
        rb.keyPress(KeyEvent.VK_UP);
        rb.keyRelease(KeyEvent.VK_UP);
        rb.delay(1000);
        rb.keyPress(KeyEvent.VK_RIGHT);
        rb.keyRelease(KeyEvent.VK_RIGHT);
        rb.delay(1000);
        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);
        rb.keyPress(KeyEvent.VK_DOWN);
        rb.keyRelease(KeyEvent.VK_DOWN);
       
        
        
        
        
        
    }
        catch(Exception ex){
            ex.printStackTrace();
        }
            
        }
    
}
