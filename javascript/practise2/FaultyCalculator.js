let random = Math.random()
let a = prompt("Enter First Number")
let b = prompt("Enter Second Number")
let c = prompt("Enter operation")

let obj = {
    //here we have stored the diffrent value in diffrent sign
    //when somone will do + tham ans will come by - the number
    "+": "-",
    "*": "+",
    "-": "/",
    "/": "**"
    //c=obj[c]
    //this means that change the value of c
    //+=>-.-=>/,*=>+,/=>**(Exponential)
}
console.log(random)
if (random > 0.1) {
    //perform correct operation 
    console.log(`The result is ${a} ${c} ${b}`)
    alert(`The result is${eval(`${a} ${c} ${b}`)}`)

} else {
    //perform incorrect operation
    //here eval() is the function which work as calculator but in real world we do not use it
    c = obj[c]
    console.log(`The result is ${a} ${c} ${b}`)
    alert(`The Result is ${eval(`${a} ${c} ${b}`)}`)

}