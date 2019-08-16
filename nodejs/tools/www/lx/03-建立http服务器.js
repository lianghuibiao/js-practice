//首先得应用require
//我可以使用node创建一个服务器
//因为node中专门提供了一个核心模块  ：http
//http这个模块的职责就是帮我创建编写服务器

//1.首先要加载http核心模块
var http =require('http')



//2.使用http.createServer()方法来创建一个web服务器
//返回一个server实例
var server=http.createServer()



//3.服务器
//提供服务：对数据的服务
//发请求
//接受请求
//处理请求
//给个反馈（发送响应）
//注册request请求事件
//当客户端请求过来，就会自动触发服务器的request请求事件，然后执行第二个参数：回调函数
server.on('request',function(){
	console.log('收到客户端的请求')
})
//4.启动服务器  绑定端口号   listen
//3000 只要不被暂用什么都可以

server.listen(3000,function(){
	console.log('服务器启动成功了，可以通过http://127.0.0.1:3000/ 来进行访问')
})