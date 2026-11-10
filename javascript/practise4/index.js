
const prompt=require('prompt-sync')();
//finding factorial of a given number
let num=prompt("Enter Number To Find Factorial")
let b=1

for(let i=1;i<=num;i++){
    b=b*i
}
console.log(b)
// divisbility check
let a=prompt("Enter Number to check Divisibility")
if(a%2==0 && a%3==0){
    console.log("Divisible by 2 and 3 Both")
}else if(a%2==0){
    console.log("Divisible by 2")
}else if(a%3==0){
    console.log("Divisible by 3")
}else if(a%2==0 || a%3==0){
console.log("Divisible by 2 and 3 both")
}
else{
    console.log("neither divisible by 2 nor divisible by 3")
}
// Eligibility check
let c=prompt("Enter Your Age To check Elgibility")
var result=(c>=18) ? "you can drive":"you can not drive";
console.log(result)
//printing the object values
var obj={
    "math":"120",
    "mathamatics":"1210",
    "science":"1201",
    "GK":"1200",
}
//printing the values of object using for loop
let values=Object.values(obj);
for(let i=0;i<values.length;i++){
    console.log(values[i])
}
//printing the values of object using for in loop
for (const key in obj) {
    // if (!Object.hasOwn(object, key)) continue;
    
    const element = obj[key];
    console.log(element)
    
    
}

