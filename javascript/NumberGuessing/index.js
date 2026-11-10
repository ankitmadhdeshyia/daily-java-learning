const prompt=require('prompt-sync')();
let number=12;
 let flag=true;
while(flag){
let userNumber=Number(prompt("Enter The Number between 0 and 100"))

    if(userNumber>50){
        console.log("Number is To High")
    }else if(userNumber>40 || userNumber>30){
   console.log("A little bit Near, Try again")
    }else if(userNumber>20 || userNumber>15){
        console.log("To Near try Again")
    }else if(userNumber<10){
        console.log("A little bit greater")
    }else if(userNumber==number){
        console.log("You Got it")
        flag=false
    }
}