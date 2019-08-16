
var http =require('http')


var server=http.createServer()
//request 请求事件处理函数，需要接收两个参数
//request  请求对象
//请求对象用来获取客户端的一些请求消息 
//response响应对象



server.on('request',function(request,response){
	//http://127.0.0.1:3000/
	console.log('收到客户端的请求路径是：'+request.url)
	//response对象有一个方法：write可以用来给客户端发送响应苏剧
	//write 可以使用多次，但是最后一定要使用end来结束响应，否则客户端会一直响应
	response.write('hello')
	response.write('nodejs')
		response.end()
})


server.listen(3000,function(){
	console.log('服务器启动成功了，可以通过http://127.0.0.1:3000/ 来进行访问')
	
})