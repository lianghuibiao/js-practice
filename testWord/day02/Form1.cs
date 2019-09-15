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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //分支树情况
           // treeView1.ContextMenuStrip = contextMenuStrip1; //设置树空间的快捷菜单
            //treenode 对象
            TreeNode TopNode = treeView1.Nodes.Add("博主"); //建立第一个顶级节点
            //建立4个基础节点 ,分别表示 4个大的分支
            TreeNode ParentNode1 = new TreeNode("家人");
            TreeNode ParentNode2 = new TreeNode("朋友");
            TreeNode ParentNode3 = new TreeNode("老师");
            TreeNode ParentNode4 = new TreeNode("同学");
            //将四个基础节点添加到顶级节点中
            TopNode.Nodes.Add(ParentNode1);
            TopNode.Nodes.Add(ParentNode2);
            TopNode.Nodes.Add(ParentNode3);
            TopNode.Nodes.Add(ParentNode4);

            //创建一个  
             TreeNode ChildNode1=new TreeNode("ShinePans");
            TreeNode ChildNode2=new TreeNode("爸爸");
            TreeNode ChildNode3=new TreeNode("妈妈");
            TreeNode ChildNode4=new TreeNode("xuzhengmao");
            TreeNode ChildNode5=new TreeNode("秦明");
            TreeNode ChildNode6=new TreeNode("zhangyihui");
            TreeNode ChildNode7=new TreeNode("xuzhengmao");
            TreeNode ChildNode8=new TreeNode("zhangyihui");
            //子分支
            ParentNode1.Nodes.Add(ChildNode1);
            ParentNode1.Nodes.Add(ChildNode2);
            ParentNode1.Nodes.Add(ChildNode3);
            ParentNode4.Nodes.Add(ChildNode4);
            ParentNode3.Nodes.Add(ChildNode5);
            ParentNode4.Nodes.Add(ChildNode6);
            ParentNode2.Nodes.Add(ChildNode7);
            ParentNode2.Nodes.Add(ChildNode8);


        }

        private void treeView1_AfterSelect(object sender, TreeViewEventArgs e)
        {
          
        }

    }
}
