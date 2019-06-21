var transpose = function(A) {
var a=new Array();
for (var i = 0; i < A[0].length; i++) {
	a[i] = new Array();
}
	for(var i=0;i<A.length;i++){
 		
		for(var j=0;j<A[0].length;j++)
		{
			a[j][i] = A[i][j];
			
		}
		
		}
		console.log(a);
 };
 transpose([[2,2,3],[2,3,4]]);
