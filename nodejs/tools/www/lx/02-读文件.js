var fs =require('fs');
//使用 require 方法加载fs核心模块
//第一个参数就是要读取的文件路径  
//第二个参数就是回调函数
//一个叫error   一个叫data
//如果读取成功  error就是错误对象  否者就是null
fs.readFile('./xie.txt',function(error,data){
	//通过if语句进行错误处理  判断是否有错误发生
	if (error) {
		console.log('读取任务失败了')


	}else{
		console.log(data.toString())
		console.log('读取任务成功了')
	}

//默认文件中存储的都是二进制数字
})

