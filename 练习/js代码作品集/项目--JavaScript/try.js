function queue(arr, item) {
    // 请把你的代码写在这里
    arr.push(item);//从后面添加   arr=[12,32,43]
    item = arr.shift(arr);//删除第一个   
    
    console.log(item)
  }
  queue([12,32,43],[23,12,43])