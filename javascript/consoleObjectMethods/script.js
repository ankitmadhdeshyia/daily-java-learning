 const prompt=require('prompt-sync')();
let age=prompt("Enter Your Age")
if(age>18){
alert("You can drive")
}else if(age<0){
    alert("Age Can not be negative")
}else{
    alert("You Can Not Drive")
   
}
