using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace day02
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
         
          
        
            
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            // SelectionMode.One;
            ListBox ListBox = new ListBox();
            //string a = "aaa";
            //this指向当前的listbox  
            //form窗体中才能实现 用this方法添加 listbox的ADD方法组
         
           
            //listBox1.Items.Count = 10;


            TreeNode TopNode = treeView1.Nodes.Add("职业"); //建立第一个顶级节点
            TreeNode one = new TreeNode("老师");
            TreeNode two = new TreeNode("医生");
            TreeNode three = new TreeNode("律师");
            TreeNode fort = new TreeNode("工人");
            TreeNode fi = new TreeNode("农民");
            TopNode.Nodes.Add(one);
            TopNode.Nodes.Add(two);
            TopNode.Nodes.Add(three);
            TopNode.Nodes.Add(fort);
            TopNode.Nodes.Add(fi);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //在我们的button中也能使用这个this添加
            //可以在添加用户这方面着手操作
            //把输入框的内容输出到属性到listbox
         
           // this.listBox1.Items.Add(t1);
            string t1, t2, t3;
            t1 = textBox1.Text;
            t2 = radioButton1.Text;
            t3 = radioButton2.Text;
            RadioButton rb = new RadioButton();
            if (radioButton1.Checked == true)
            {
                this.listBox1.Items.Add("姓名：" + t1 + "性别:" + t2);

            }
            else if (radioButton2.Checked == true)
            {
                this.listBox1.Items.Add("姓名：" + t1 + "性别:" + t3);
            }
            
        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
        }
    }
}
