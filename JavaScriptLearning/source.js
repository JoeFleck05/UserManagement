
// pulled up into memory
//greet();
//function greet() {
//    console.log('hi');
//}
//
//// When being executed an object is created. (function expression)
//var anonymousGreet = function() {
//    console.log('hi');
//}
//
//// If invoc is called before the anonymous function is will not see the function.
//anonymousGreet();
//
//function log(a) {
//    console.log(a);
//}
//
//log("4");
//// passing an object
//log({
//    greeting: 'hi'
//});

//function log(a) {
//    //inorder to execute pass function you call the parameter
//    a();
//}
//// function expression
//log(function() {
//    console.log('hi');
//});

//var factorial = function fac(n) { return n < 2 ? 1 : n * fac(n - 1); };
//console.log(factorial(3));

let problems = [];
let firstObject = {};
firstObject.code = {};
firstObject.code.codingSystemMap = new Map();

let keyObj = {
    system : "Soooooo"
};

let valueObj = {
    system : "Poop",
    display: "free"
};

firstObject.code.codingSystemMap.set(keyObj,valueObj);

console.log(problems);
console.log(firstObject);
console.log(firstObject.code);

var numbers = [4, 2, 5, 1, 3];
numbers.sort(function(a, b) {
  return b - a;
});
console.log("NUMBERS: " + numbers);

const resourceNew = "";

let resource = [
    {
        type: String,
        firstName: "Joe"
    },
    {
        type: String,
        lastName:"Fleck"
        
    },
    {
        type: String,
        middleInitial: "E"
    }
];

console.log("Name: " + resource["0"].firstName + " " + resource["2"].middleInitial + " " + resource["1"].lastName);



let temporalRelation = [
    {
        type: String,
        
    }
]

let dArr = [];

dArr.push(1,23,54,3,9);

console.log(dArr);

for(d of dArr){
    console.log(d);
}


let dt = new Date();
let yr = dt.getFullYear();
let mnth = dt.getMonth();
let dy = dt.getDay();

console.log(dt);

let dateArr = [];

dateArr.push(Date.now()-10000000);
dateArr.push(Date.now()-100000000000);
dateArr.push(Date.now()-100000);
dateArr.push(Date.now()-100000000);
dateArr.push(Date.now()-100);
dateArr.push(Date.now()-1000000000000);
dateArr.push(Date.now()-1000000);
dateArr.push(Date.now()-10000);

console.log(dateArr);

let maxDate = Date.now();
let minDate = Date.now()-1000000000000;
console.log("MIN: " + minDate);
console.log("MAX: " + maxDate);

dateArr.forEach((d) => {
   if (minDate <= d && d <= maxDate){
       console.log("Date that falls between: " + d);
   } 
});



var map = new Map();
map.set('2-1', "foo");
map.set('0-1', "bar");
map.set('3-1', "baz");

var mapAsc = new Map([...map.entries()].sort());

console.log(mapAsc)
