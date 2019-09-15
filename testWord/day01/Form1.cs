using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace day01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            test co=new test();
            
            button1.BackColor = co.Test(Color.AntiqueWhite);

        }

        private void button2_Click(object sender, EventArgs e)
        {
            string jin;
            double kg, g;
           
            jin = textBox1.Text;  //获取到jin的文本资料
            //不能接收到变量
      
            double a = Convert.ToDouble(jin);
            kg = a / 2;
            g = a * 500;
            textBox2.Text = g.ToString();
            textBox3.Text = kg.ToString();

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            string text,text1;
            text = textBox4.Text;
            text1 = textBox5.Text;
            for (int i = 0; i < text.Length; i++)
            {
             //   MessageBox.Show(text[i].ToString());
                for (int j = 0; j < text1.Length; j++)
                {
                    if (text1[j] == text[i])
                    {
                        i = i + 1;
                        MessageBox.Show("true:" + "你要查找的文字在第" + i + "个"); 
                    }
                    //else
                    //{
                        
                    //    MessageBox.Show("flash" + "你要查找的字没出现在你提供的文本中");
                    //    break;
                       
                    //}
                }

            }
               
           

            
               
            //
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }
    }




















    //颜色属性修改
    //函数名（参数1，参数2）
    //参数1：控件名触发控件
    //参数2：属性名
    //这个方法应该是不可取的
    //参数改变颜色属性行不行？？？
    //函数设定一个参数  此参数是属性值
    public class test{

        public Color Test(Color a)
        {
          var co = Color.AliceBlue;//
            return a;



        }




    }

}
