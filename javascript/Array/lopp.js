let a=[12,14,43,13,65,41]
//we can also rename the index word with i as we do in java
//this is simple for loop
// for (let index = 0; index < a.length; index++) {
//     const element = a[index];
//     console.log(element)    
// }
//this is now for Each Loop
// a.forEach((value,index,array)=>{
//     console.log(value,index,array)
// })
// let object={
//     a:1,
//     b:2,
//     c:3
// }
// for (const key in object) {
//     if (!Object.hasOwn(object, key)) continue;
    
//     const element = object[key];
//     console.log(key,element)
    
    
// }
// for (const element of a) {
//     console.log(element)
// } 
// let newArr=a.map((e)=>{
//      return e**2;
// })
// console.log(newArr)\
const greaterThanTwo=(e)=>{
    if(e>13){
        return true
    }
    return false
}
console.log(a.filter(greaterThanTwo))
