/**
 * 
 */
const my_name = 'NamefieldEmpty'; // Single quote
const middle = "Gabbbar";
const last = `Singh`; // back tick
console.log(my_name);
console.log(middle);
console.log(last);

const sentence1 = 'shes\'s so cool';
console.log(sentence1);
const sentence3 = "shes's so cool";
console.log(sentence3);
const sentence = "shes's so \"cool\"";
console.log(sentence); // she's so "cool"
// with back ticks
const sentence2 = `shes's so "cool"`;
console.log(sentence2);
const sentence4 = `shes\`s so "cool"`;
console.log(sentence4);
// multi line String using single quote doesn't work
const song1 = 'Ohhh \
 \
 ya \
 \
 I like \
 pizza';
const song2 = `Ohhh

 ya 
 
 I like 
 pizza`;
console.log(song2);
// concat
console.log(1 + 1); // 2
console.log('1' + '1'); // 11
console.log(1 + '1'); // 11

const hello3 = 'hello my name is ' + my_name + ". Nice to meet you";

let hello2 = 'hello my name is ';
hello2 = hello2 + my_name;
hello2 = hello2 + ' Nice to meet you';
// variable interpolation : putting a variable in a string sentence
// back ticks
const hello = `hello my name is ${my_name}. Nice to meet you. I am ${1 + 100} years old`;
console.log(hello);
// Js does not remember what quote was used in the code 
// All quotes are converted into double quotes
const html =`
<div id='div1'>
<h2>${my_name}</h2>
<p>${hello}</p>
</div>
`;
console.log(html);
//document.body.innerHTML=html;
//var element=document.getElementById('div1');
//element.innerHTML = '<p>hello world</p>'+html;
var elementsByName=document.getElementsByName('div2');
 console.log(elementsByName) ;
elementByName[0].innerHtml='home';
// end of String