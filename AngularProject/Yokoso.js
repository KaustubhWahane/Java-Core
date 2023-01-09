// console.log("Hello World");
// Yokoso watashiwa soul society
// var a; // var = variable
// var b = 69;
// console.log(a)//Pehle kuch nahi tha
// a = 66;
// console.log(a) // Ab hai
// var c = "Me hu ";
// c = c + "Chutiya !!";
// console.log(c) // ham aese add kar sakte hai!
//Also not to mention variables here are case sensitive

// Assignment operators
// var add = 1 + 5; //add or sum
// console.log(add)
// var add = 5 - 1;
// console.log(add)
// var multiply = 5 * 5;
// console.log(multiply)
// var quotient = 25 / 5;
// console.log(quotient)
//Also it doesn't matter what the variable is the operator sign matters

// Incrementing numbers or Decrementing
// var MeraVar = 69;
// MeraVar++; //instead of writing MeraVar = MeraVar + 1
// console.log(MeraVar) 
// var Chutiya = 15;
// Chutiya--;
// console.log(Chutiya)// same as above

//Augmented Incremenet operators
// MeraVar += 15; 
// Chutiya -= 14;
// MeraVar *= 11;
// Chutiya /= 15;

//How to write quotation marks inside the quotation?
// var Stringuser = "Hello aap kaise ho?, \"Me thik hu aap kaise ho?\""
// //or
// var Stringuser1 = 'Hello aap kaise ho?, "Me thik hu aap kaise ho?"'
// console.log(Stringuser)  isme ham (backward slash) ka istemal karte hai

//String concatenation
// var MeraLund = "Kesa hai tu? " + "\nAcha hu tu kesa hai?";
// OR
// MeraLund += " Nahi be thik nahi hai tera bhai!";

// console.log(MeraLund)
//To find the length of the string in variables
// var Chutiya = "sladfk ";
// Chutiya = Chutiya.length
//To find the index of the variable (Position)
// Chutiya = Chutiya[2]
// console.log(Chutiya)


//Arrays
// var Mera = ["oye hoye" , 12]; //Single array
// var Mera_Do = [["JuhaBach", 124]["JUha baaaach", 13]]; //Nested (Multiple Arrays)
// var Hat = [50, 15, 69];
// Hat[0] = 69; 
// console.log(Hat)
//Let's say we want to do this trick in nested loops so,
// varIchigo = [[0, 2 , 5],[5, 6 ,1],[5, 7, 8],[[1,19,2]]];
// varJuhabach = varIchigo [1][1];
// console.log(varJuhabach)

//Shift and Unshift
// var array = ["kesa" , "yokoso" , "Chutiyap"]
// array.shift(); // It will remove the first element of our array
// array.unshift("Bol lavde") // It will add this to our previous elements of the array
// console.log(array)


//Functions
// function Oyehoye() {
//     console.log("oho Puttaaaaaar")
// }

// Oyehoye();

//Some more news to variable in function let' say {}
// function Tuhimera() {
//     Globalvariable = 5 ; // Here i don't have to put in variable because its scoped as a function so i can still use this a variable anywhere I want :)
// }

//Example of function we can use like
// function Example(int) { //in the (this bracket) there should be something in order to do arithmetic operations
//     return int * 5 ;
// }
// console.log(Example (2))

//Example
// function nextInLine(arr,item){
    
// Barr.push(item);
//     arr.shift();
// }
// var testArr=[1,2,3,4,5];
// console.log("Before:"+JSON.stringify(testArr));
// console.log(nextInLine(testArr,6));
// console.log("After:"+JSON.stringify(testArr));

// function TrueOrFalse (KASAKAY) {
//     if (KASAKAY) {
//     return "Hao me thik hu";
//     }
//     return "Me thik nahi re bala"
// }
// console.log(TrueOrFalse((true)))
// console.log(TrueOrFalse((false)))

          //Equality operators
// function Equalhaikinahi(value) {
//     if(value == 12){
//         return "Hao barabar hai"
//     }
//     return "Naa barabr nahi hai"
// }
// console.log(Equalhaikinahi(12));

//Strict Equality Operators (===)

// function Equalhaikinahi(value) {
//     if(value === 12){
//         return "Hao barabar hai"
//     }
//     return "Naa barabr nahi hai"
// }
// console.log(Equalhaikinahi('12')); //String se equal kiya toh wrong because integer or String alag alag
// console.log(Equalhaikinahi(12));

// function Equalhaikinahi(value) {
//     if(value !== 12){ //Not equal
//         return "Hao barabar hai"
//     }
//     return "Naa barabr nahi hai"
// }
// console.log(Equalhaikinahi(69));

// function Testnumber(value) {
//     if (value > 100) {
//         return "Ye toh 100 se bhi bada hai";
//     }
//     if (value > 10){
//         return "Ye toh 10 se thoda jyada hai";
//     }
    
//     if (value > 69){
//         return "OOOOh lucky number";
//     }
// }
// console.log(Testnumber(11));

// function Testnumber(value) {
//     if (value >= 200) {
//         return "Ye toh 100 se bhi bada hai";
//     }
//     if (value >= 8){
//         return "Ye toh 10 se thoda jyada hai";
//     }
    
//     if (value >= 194){
//         return "OOOOh lucky number"; 
//     }
// }
// console.log(Testnumber(201));

// function Testnumber(value) {
//     if (value <= 1000) {
//         return "Ye toh 1000 se bhi bada hai";
//     }
//     if (value <= 10){
//         return "Ye toh 10 se thoda jyada hai";
//     }
    
//     if (value <= 69){
//         return "OOOOh lucky number";
//     }
// }
// console.log(Testnumber(11));

// Now let's say we want it to make this simple and to the point by saving lines 

// function LogicalOperators (value) {
//     if (value >= 69 && value <= 96) {
//         return "Hmm kaha ka hai ye number??"
//     }

// }
// console.log(LogicalOperators(69));

// Or aese likthe hai ||
// function orderMyLogic (val) {
//     if(val < 10) {
//       return"Less than 10";
// }  else if(val < 5) {
//       return"Less than5";
//   }
//    else{
//       return"Greater than or equal to 10";
//    }
 
// }
//   console.log(orderMyLogic(11));

//Do note if the first condition is met in if else then the rest of the if else will be neglected

// Default statements meaning if-else mese Else 

// function Testmynumber (val)
// {
//     if (val<=  5)
//     {
//         return ("This is tiny!")
//     }
//     else if (val<=  10)
//     {
//         return ("This is small!")
//     }
//     else if (val<=  15)
//     {
//         return ("This is medium!")
//     }
//     else if (val<=  20)
//     {
//         return ("This is large!")
//     }
//     else if (val <= 25)
//     {
//         return ("This is are BC!")
//     }
// }
// console.log(Testmynumber(20));

//Switch statements

// function switchstatements (val) {
//  var Uttar = "";
//  switch(val) {
//   case 1 :
//     Uttar = "Alpha"
//   break;
//   case 2 :
//     Uttar = "Beta"
//   break;
//   case 3 :
//     Uttar = "Gamma"
//   break;
//   case 4 :
//     Uttar = "Delta"
//   break;
//  }
//  return Uttar;
// }
// console.log(switchstatements(1)); //Bracket dhang se lagana

// function sequentialswitch (val2)
// var Answer= "" ; 
// switch(val2)
// {
//     case 1:
//     case 2:
//     case 3:
//     Answer = "Low";
//     break;

//     case 4:
//     case 5:
//     case 6:
//     Answer = "Bich ka";
//     break;

//     case 7:
//     case 8:
//     case 9:
//     Answer = "Bahut bada";
//     break;
//     return = Answer;
// }
// console.log(sequentialswitch(1));


//Converting if else statement to switch case
// function ifelsetoswitch (val){
//     var answer = "";
//     switch (val){
//         case "bob" : answer = "Marley";
//         break;
//         case 42: answer = "The Answer";
//         break;
//         case 1: answer = "There is no #1";
//         break;
//         case 99: answer = "Missed me by this much" ;
//         break;
//         case 7: answer = "Ate nine";
//         break;
//     }
//     return answer;
// }
// console.log(ifelsetoswitch(7));