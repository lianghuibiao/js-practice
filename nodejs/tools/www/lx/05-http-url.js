var http=require('http')
//1.创建一个server
//2.监听request 请求时间 设置请求函数
var server=http.createServer()

server.on('request',function(req,res){
  console.log('收到请求了，请求路径是：'+req.url)
  //获取地址后面  用不同地址显示不同的结果
  var url=req.url
  /*if(url==='/'){
      res.end('hello /')
  }else if(url==='/login'){
      res.end('login')
  }else{
      res.end('404 Not Found')
  }*/
        //问题出在这里  开始结束  
//res.end('hello workd')
var  product=[
  {
      name:"孙悟空",
      age:18
  },
  {
    name:"猪八戒",
    age:28
},
{
    name:"沙和尚",
    age:38
}



]
   if(url==='/product'){
     res.end(JSON.stringify(product))  //数组转化为字符串
   }
})



//3.绑定端口号
//不可以重复  端口被暂用了
server.listen(3000,function(){
    console.log('服务器启动成功，可以访问了。。')
})