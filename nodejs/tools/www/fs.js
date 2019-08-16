var fs =require('fs');
//使用 require 方法加载fs核心模块
//第一个参数就是要读取的文件路径  
//第二个参数就是回调函数
//一个叫error   一个叫data
//如果读取成功  error就是错误对象  否者就是null
fs.readFile('./hello.txt',function(error,data){
console.log(data)
//默认文件中存储的都是二进制数字
})

