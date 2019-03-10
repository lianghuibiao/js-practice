using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace mybox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            string one = textBox1.Text;
            string two = textBox2.Text;
            float onee = Convert.ToSingle(one);
            float twoo = Convert.ToSingle(two);
            float sum = onee + twoo;
            textBox3.Text = Convert.ToString(sum);
        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            string one = textBox4.Text;
            string two = textBox5.Text;
            float onee = Convert.ToSingle(one);
            float twoo = Convert.ToSingle(two);
            float sum = onee - twoo;
            textBox6.Text = Convert.ToString(sum);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string one = textBox7.Text;
            string two = textBox9.Text;
            float onee = Convert.ToSingle(one);
            float twoo = Convert.ToSingle(two);
            float sum = onee * twoo;
            textBox11.Text = Convert.ToString(sum);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string one = textBox8.Text;
            string two = textBox10.Text;
            float onee = Convert.ToSingle(one);
            float twoo = Convert.ToSingle(two);
            float sum = onee / twoo;
            textBox12.Text = Convert.ToString(sum);
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox6_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox9_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox11_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox10_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox12_TextChanged(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }
    }
}
