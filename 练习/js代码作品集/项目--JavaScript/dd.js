var uncommonFromSentences = function(A, B) {
var newStr=(A+' '+B).split(' ');
    var count={};
    var res=[];
    for(var i=0;i<newStr.length;i++){
        if(count[newStr[i]]){
            count[newStr[i]]+=1;
        }else{
            count[newStr[i]]=1;
        }
    }
    for(var k in count){
        if(count[k]==1){
            res.push(k)
        }
    }
  console.log(res);
};
uncommonFromSentences(["aaaac vvvv"],["aaad dd"])