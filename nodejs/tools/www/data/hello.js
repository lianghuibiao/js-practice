var fs =require('fs');

//使用 require 方法加载fs核心模块
//第一个参数就是要读取的文件路径  
//第二个参数就是回调函数
//一个叫error   一个叫data
//如果读取成功  error就是错误对象  否者就是null
fs.readFile('./hello.txt',function(error,data){
console.log(data.toString())
//默认文件中存储的都是二进制数字
//我们要把他转换为16进制
//我们可以通过这个来加载读写文件
//刚刚展示了读  
//浏览器是不可以读写文件代码的

})
//node可以进行服务器级别的操作




