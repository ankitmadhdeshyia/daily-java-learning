
// for(let i=0;i<=1000;i++){
//     console.log(i)
// }
// var a=1
// while(a<=20){
//     console.log(a)
//     a++
// }
let obj={
    name:"ankit",
    role:"coder",
    company:"java"

}
for (const key in obj) {
    // if (!Object.hasOwn(object, key)) conte;
    
    const element = obj[key];
    console.log(key,element)
  
}
for (const element of "Ankit") {
    console.log(element)
}