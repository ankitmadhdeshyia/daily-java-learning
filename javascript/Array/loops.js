const prompt = require('prompt-sync')();
// let a = [12, 14, 43, 13, 65, 41]
// //we can also rename the index word with i as we do in java
// //this is simple for loop
// for (let index = 0; index < a.length; index++) {
//     const element = a[index];
//     console.log(element)
// }
// //this is now for Each Loop
// a.forEach((value, index, array) => {
//     console.log(value, index, array)
// })
// let object = {
//     a: 1,
//     b: 2,
//     c: 3
// }
// for (const key in object) {
//     if (!Object.hasOwn(object, key)) continue;

//     const element = object[key];
//     console.log(key, element)


// }
// for (const element of a) {
//     console.log(element)
// } 
// //Here each elememt of array will get multiplied by itself 2 times
// let newArr=a.map((e)=>{
//      return e**2;
// })
// console.log(newArr)
// //it will print the all element which is greater than 13
// const greaterThanTwo = (e) => {
//     if (e > 13) {
//         return true
//     }
//     return false
// }
// console.log(a.filter(greaterThanTwo))

let flag = true
 let arr = []
while (flag) {
    console.log("Enter Opeation\n, 1:Add number\n,2:Exit")
    let choice=prompt("Enter The Operation")
    switch (choice) {
        case "1":
            let num = prompt("Enter Number To add in The array")       
            arr.push(Number(num))
            break;
        case "2":
            console.log("Thanks For Adding The Number")
            flag=false
            break;

        default:
            console.log("Invalid option, try Again")
            break;
    }
}
console.log(arr)
for (let index = 0; index < arr.length; index++) {
    if(arr[index]%10==0){
        console.log(arr[index])
    }
    
}




