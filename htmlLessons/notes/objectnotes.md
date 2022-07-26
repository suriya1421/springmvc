## Object
Everything in JavaScript is an Object.
Objects are used for collection of data, collection of functionality.
Example:

```javascript
const person = {
name: 'Sam', // property: value
age: 100
};
console.log(typeof person); // object
person.age = 101;
console.log(person. age); // 101
```

Order of properties doesn't matter in an object.

 **Accessing properties:**
 - `person.name // Sam` (dot notation)
 


const empty = {}; // An object with no properties
const point = { x: 10, y: 50 }; // Two properties
console.log(point.x);
console.log(point.y);
const point2 = { x: point.x, y: point.y + 1 }; // More complex values
console.log(point2.x);
console.log(point2.y);
const book = {
  'main title': 'JavaScript', // Property names include spaces,
  'sub-title': 'The Definitive Guide', // and hyphens, so use string literals
  'for': 'all audiences', // for is a reserved word, so quote
  author: { // The value of this property is
    firstname: 'Donald', // itself an object. Note that
    surname: 'Duck' // these property names are unquoted.
  }
};