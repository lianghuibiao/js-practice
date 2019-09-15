using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;

namespace wds1
{
   
    public partial class Form1 : Form
    {
        Stopwatch sw =new Stopwatch();
        
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            sw.Start();
           
        }

        private void button1_Click(object sender, EventArgs e)
        {
        
            //new myfunction();
           
            Graphics g = this.CreateGraphics();//画板

            //画格子
            for (int i = 0; i <= 38; i++)
            {
                Pen a = new Pen(Color.Black, 1);

                g.DrawRectangle(a, 0, 20 * i, 800, 20 * i);
                g.DrawRectangle(a, 20 * i, 0, 20 * i, 800);


            }
          
         
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            //new Form1().Show(); //再开一次游戏窗体   适用有第二窗体的游戏
            //this.Close(); //关闭结束的游戏
            Application.Restart();//重新开始
            
        }
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        // private object fi;

        //窗体点击触发对象   棋子
        int[,] aaa = new int[40, 40];//棋子坐标保存
        int q1 = 0, w1 = 0, q2 = 0, w2 = 0;

        private void Form1_MouseClick(object sender, MouseEventArgs e)
        {
           
            Graphics g = this.CreateGraphics();
            Point p = e.Location; //获取鼠标产生事件时的位置  获取鼠标相对窗体来说当前坐标
            string X = p.X.ToString();
            string Y = p.Y.ToString();
            int intX = Convert.ToInt32(X);  //类型转换
            int intY = Convert.ToInt32(Y);
           // string mathX = Math.Round(Convert.ToDouble(intX/1)).ToString();  //math方法向下取整

            int x = intX % 20;   
            int x2,x1 = intX / 20;
               x2= (x>=13)? x1+1:x1;
            int y = intY % 20;
            int y2, y1 = intY / 20;
            y2 = (y >= 13) ? y1+1 : y1;
            int q = x2*20;
            int w = y2*20;
            
            int qqq = x2 * 20;
            int www = y2 * 20;

            
            //int[] a;
            //  int ee = 0;
            // ee++;
            //int[] a=new a[ee];

            // string mathY = Math.Round(Convert.ToDouble(intY/1)).ToString();  //
            // int q = Convert.ToInt32(mathX);
            // int w = Convert.ToInt32(mathY);
            //  MessageBox.Show(p.ToString(), X + Y);]
            Pen a1 = new Pen(Color.Black, 1);  //获取画笔
            // g.DrawPie(a1, 20, 20, 20, 20, 0, 360);
          //Brush b = new SolidBrush(Color.Red);//brush方法  获取刷子
          SolidBrush s = new SolidBrush(Color.Black);
          SolidBrush qq = new SolidBrush(Color.White);

           //画圆
            
            //g.FillRectangle(b, q * 1 - 10, w * 1 - 10, 20, 20);
            // Form2 frm = new Form2();
            // frm.Show();

          //计数器
          count++;
          





            //确定下棋顺序                  
            if (count % 2 == 0)
            {  q1 = q;w1 = w;
                g.DrawEllipse(a1, q * 1 - 10, w * 1 - 10, 20, 20);
                g.FillEllipse(s, q * 1 - 10, w * 1 - 10, 20, 20);
                count1++;
                
                string h = count1.ToString();
                label1.Text = h;
                
                //******************************
                int A = q1, B = w1;
                A = A / 20;
                B = B / 20;
                aaa[A, B] = 1;
                int l0 = qq0(A, B);
                int l1 = qq1(A, B);
                int l2 = qq2(A, B);
                int l3 = qq3(A, B);
                if (l0 == 4) { MessageBox.Show("恭喜2号玩家胜利");
                Application.Restart();//重新开始
                
                }
                else if (l1 == 4) { MessageBox.Show("恭喜2号玩家胜利");

                Application.Restart();//重新开始
                }
                else if (l2 == 4) { MessageBox.Show("恭喜2号玩家胜利");

                Application.Restart();//重新开始
                }
                else if (l3 == 4) { MessageBox.Show("恭喜2号玩家胜利");
                Application.Restart();//重新开始
                }


            }
            else
            {
                q2 = qqq;w2 = www;
                g.DrawEllipse(a1, qqq * 1 - 10, www * 1 - 10, 20, 20);
                g.FillEllipse(qq, qqq * 1 - 10, www * 1 - 10, 20, 20);
                count2++;
                
                string h1 = count2.ToString();
                label7.Text = h1;

                int A1 = q2, B1 = w2;
                A1 = A1 / 20;
                B1 = B1 / 20;
                aaa[A1, B1] = 2;
                int l0 = qq0(A1, B1);
                int l1 = qq1(A1, B1);
                int l2 = qq2(A1, B1);
                int l3 = qq3(A1, B1);
                //switch (4)
                //{
                //    case 0: MessageBox.Show("YYYY");
                //        break;
                //}
                if (l0 == 4) { MessageBox.Show("恭喜1号玩家胜利");

                Application.Restart();//重新开始
                
                }
                else if (l1 == 4) { MessageBox.Show("恭喜1号玩家胜利");

                Application.Restart();//重新开始
                
                }
                else if (l2 == 4) { MessageBox.Show("恭喜1号玩家胜利");

                Application.Restart();//重新开始
                
                }
                else if (l3 == 4) { MessageBox.Show("恭喜1号玩家胜利");


                Application.Restart();//重新开始
                
                }


            }
           // MessageBox.Show("p1st" + q1 + w1);
           // MessageBox.Show("p2est" + q2 + w2);

           
           



           




            //  myclass m = new myclass();//要先实体化一个变量   通过调用的方式把它弄成m.方法（参数1，参数2）  转换看情况
            // label7.Text = m.Add(3, 5).ToString();//初始是int类型

        }
        //游戏规则
        //************************************************************
        //00000000000000000000000000000000000
        int qq0(int Aa, int Bb)
        {
            int z = 0; int Zz = 0, Mm = 0;


            for (int sC = 0; sC < 4; sC++)
            {
                Zz++;
                if (aaa[Aa, Bb] == aaa[Aa + Zz, Bb])
                {
                    z = z + 1;
                }
                else
                {
                    Mm--;
                    if (aaa[Aa, Bb] == aaa[Aa + Mm, Bb])
                    {
                        z = z + 1;

                    }
                    else { sC = 4; }
                

                }
            }
            return z;
        }
    
        //0000000000000000000000000000
        //1111111111111111111111111
        int qq1(int Aa, int Bb)
        {
            int z = 0; int Zz = 0, Mm = 0;

            for (int sC = 0; sC < 4; sC++)
            {
                Zz++;
                if (aaa[Aa, Bb] == aaa[Aa, Bb + Zz])
                {
                    z = z + 1;
                }
                else
                {
                    Mm--;
                    if (aaa[Aa, Bb] == aaa[Aa, Bb + Mm])
                    {
                        z = z + 1;
                    }
                    else { sC = 4; }
                }
            }
            return z;
        }
        //1111111111111111111111111
        //2222222222222222222222222222222222222
        int qq2(int Aa, int Bb)
        {
            int z = 0; int Zz = 0, Mm = 0;


            for (int sC = 0; sC < 4; sC++)
            {
                Zz++;
                if (aaa[Aa, Bb] == aaa[Aa + Zz, Bb + Zz])
                {
                    z = z + 1;
                }
                else
                {
                    Mm--;
                    if (aaa[Aa, Bb] == aaa[Aa + Mm, Bb + Mm])
                    {
                        z = z + 1;

                    }
                    else { sC = 4; }


                }
            }
            return z;
        }
        //222222222222222222222222222222222
        //33333333333333333333333333333333333333333333
        int qq3(int Aa, int Bb)
        {
            int z = 0; int Zz = 0, Mm = 0, Zz1 = 0, Mm1 = 0;


            for (int sC = 0; sC < 4; sC++)
            {
                Zz++; Zz1--;
                if (aaa[Aa, Bb] == aaa[Aa + Zz, Bb + Zz1])
                {
                    z = z + 1;
                }
                else
                {
                    Mm--; Mm1++;
                    if (aaa[Aa, Bb] == aaa[Aa + Mm, Bb + Mm1])
                    {
                        z = z + 1;

                    }
                    else { sC = 4; }


                }
            }
            return z;
        }
        //3333333333333333333333333333333333333
        //************************************************************






        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void label2_Click(object sender, EventArgs e)
        {
           
        }
        //封装一个函数分开黑白棋
        //public class myfunction
       // {
            //封装函数
          

       // }
        
       
         private void label7_Click(object sender, EventArgs e)
         {
             sw.Stop();
             Console.Write(sw.Elapsed);
             Console.ReadKey();
         }
      
       
    }
    
}
