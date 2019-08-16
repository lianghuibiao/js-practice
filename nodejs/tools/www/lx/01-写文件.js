var fs =require('fs')
//第一个参数表示路径
//第二个参数表示文件的内容
//第三个参数表示回调函数 只有一个参数error 
//写入成功  error 是null
//写入失败 error是错误对象
//读是readFile
fs.writeFile('./xie.md','大家好',function(error){
	//文件提示
   //参数error的含义  与用法
    if (error) {

    	console.log('写入失败了')
    } else {

    	 console.log('文件写入成功')
    }
})
