package java_programs;

import java.util.*;
import java.io.*;
class Game
{
int board[][]={ {2,20},{30,3},{6,60},{75,5},{90,9},{99,1},{24,64} };

int dicevalue;
static boolean playing=false;
static int gameend=0;

synchronized int throwdice(String n,int c) throws Exception
{
if (playing)
wait();
   else
   {
   playing=true;
   System.out.println("current position:"+c+ "of player:" +n);
   dicevalue=(int)(6*Math.random()+1);
   c=makeamove(n,c,dicevalue);
   System.out.println("Dice value:"+dicevalue);
   System.out.println("new position:"+c);
   playing=false;
   notify();
   }
return(c);
}
synchronized int makeamove(String n,int c,int d)throws Exception
{
 c=c+d;
 int j=0;
        for (int i=0;i<board.length;++i)
        {
        if(c==board[i][0])
        {
        if(board[i][0]<board[i][1])
        {
        System.out.println ("ladder");
        }
        else
        {
        System.out.println ("Snack");
        }
        c=board[i][1];
        break;
        }
        else
                {
                continue;
                }
        }
   return (c);
   }
}

public class Player implements Runnable
{
 Thread t;
 String threadname;
 Game g;
 int curpos=0;
 int turn=0;
 static boolean startgm=false;
 static int nextturn=0;
 static int winstatus=0;

Player(String nm,Game g1,int tn)
{
this.turn=tn;
this.g=g1;
this.threadname=nm;
Thread t=new Thread(this,nm);
t.start();
}

//try
//{
public void run()
{
try
{
 if(turn==1)
 {
 nextturn=1;
 startgm=true;
 }
if(startgm)
 {
  do
  {
  if(this.turn==nextturn)
  {
   this.curpos=this.g.throwdice(this.threadname,this.curpos);
   if (this.curpos>=100)
    {
     g.gameend=1;
     System.out.println ("Winner is"+this.threadname);
     System.out.println ("Exit from:"+Thread.currentThread().getName());
     break;
    }
   else
   {
   if(this.turn==1)
    {nextturn=2;}
    else if(this.turn==2)
    {nextturn=1;}
    else{};
   }
  }
}

while (g.gameend!=1);
}
}

catch (Exception e)
{
System.out.println("ofoooooo this errors.....");
}
}}

