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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string m;
            double limi, haomi;

            m = textBox2.Text;  //获取到jin的文本资料
            //不能接收到变量

            double a = Convert.ToDouble(m);
            limi = a *100;
            haomi = a * 1000;
            textBox1.Text = limi.ToString();
            textBox3.Text = haomi.ToString();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
