//EcmaScrpt  
//没有DOM,BOM
//提供了很多的核心模块
//什么是核心模块？ 
//在node中  node为JavaScript提供了很多的服务器级别的API  这些API绝大多数都包装到一个具名的核心模块中了  
//例如文件操作的fs 核心模块  http服务构建的叫http模块  path路径操作模块   os操作系统信息获取信息模块
//var  引它   模块名叫什么 变量名就是什么  var fs =require('fs')
//var http=require('http')  等等
var os=require('os')   //用来获取机器信息
//console.log(os.cpus()) //获取当前电脑cpu的基本信息
//
var path=require('path') //获取路径

console.log(os.totalmem())//获取内存大小

//https://nodejs.org/dist/latest-v12.x/docs/api/http.html#http_http_createserver_options_requestlistener   API文件

//如果要通过一个文件夹中的a文件b文件同时执行   必须通过a文件中的代码执行 文件b  
//require 是一个方法  作用是用来加载模块  
//在node中，模块有三种
// 具名的核心模块   fs http
//用户自己编写的文件模块
//相对路径必须加./
