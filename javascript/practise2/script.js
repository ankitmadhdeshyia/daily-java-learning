
// this is the tool used for asking thr user for input
const prompt = require('prompt-sync')();

let a = Number(prompt("Enter first number"))
let b = Number(prompt("Enter second number"))
let c = prompt("Enter operation")
let random = Math.random()
if (random < 0.1) {
     if (c == "+") {
          console.log("Result", a - b)

     } else if (c == "-") {
          console.log("Result", a + b)
     }
     else if (c == "*") {
          console.log("Result", a / b)
     }
     else if (c == "/") {
          console.log("Result", a ** b)
     }
}
else {
     if (c === "+") {
          console.log("Result", a + b)
     } else if (c === "-") {
          console.log("Result", a - b)
     } else if (c === "*") {
          console.log("Result", a * b)
     } else if (c === "/") {
          console.log("Result", a / b)
     } else {
          console.log("invalid opertator")
     }
}