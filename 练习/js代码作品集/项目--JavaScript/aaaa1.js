var majorityElement = function(nums) {
   var a =[];
   for(var i=0;i<=nums.length;i++){
       if(!a[nums[i]]){
           a[nums[i]]=1;
       }
       else{
            a[nums[i]]++;
       }
       if(a[nums[i]]>nums.length/2){
           console.log(nums[i]);
       }
   }
};
majorityElement([2,2,1,1,1,2,2])