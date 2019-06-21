var numJewelsInStones = function(J,S) {
    // var num = 0
    // Array.from(S).forEach(i => {
    //     if (J.includes(i)) {
    //         num += 1
    //     }
    // })
    // console.log(num);
    //S.split("").filter(s => J.includes(s)).length;
    var a=S.split("").filter(s => J.includes(s)).length;
    console.log(a);
};//includes() 方法用来判断一个数组是否包含一个指定的值，如果是返回 true，否则false。
numJewelsInStones([aA],[aAAbbbb]);