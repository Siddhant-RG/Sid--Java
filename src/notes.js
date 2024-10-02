// 1. Arrow Function
// Arrow functions short syntax mai functions likhne ka tareeka hai.
// Yeh apna khud ka `this` bind nahi karti, isliye simple functions ke liye useful hai
// but objects ke methods ke liye suitable nahi hai.

const add = (a, b) => a + b; // Arrow function without block
const greet = (name) => {
  console.log(`Hello, ${name}`); // Arrow function with block
};
greet('Sid');





















// 2. First-Class Function
// JavaScript mai functions ko first-class citizens ki tarah treat kiya jata hai.
// Iska matlab yeh hai ki functions ko variable mai store, as argument pass,
// ya dusre functions se return bhi kar sakte ho.

function sayHello() {
  return 'Hello!';
}

const greetFunction = sayHello; // Function ko variable mai store karna
console.log(greetFunction()); // Variable ke through function ko call karna

// 3. Higher-Order Function
// Higher-order function wo hoti hai jo ya toh ek function ko as argument leti hai 
// ya ek function return karti hai.

function higherOrder(fn) {
  return fn(); // Passed function ko execute karna
}

higherOrder(() => console.log('Yeh ek higher-order function hai!'));

// 4. Callback Function
// Callback ek aisi function hoti hai jo doosre function ko argument ke roop mai di jati hai 
// aur kisi operation ke baad execute hoti hai.

function fetchData(callback) {
  // Data fetch karne ka simulation
  console.log('Data fetch ho raha hai...');
  callback(); // Callback function ko execute karna
}

function onDataFetched() {
  console.log('Data successfully fetch ho gaya!');
}

fetchData(onDataFetched); // `onDataFetched` ko callback ke roop mai pass kar rahe hain









// 4. Callback Function - Extra Info
// - Callback hell: If you nest multiple callbacks, it can lead to a difficult-to-read 
//   structure called "callback hell", which is one reason why Promises and async/await 
//   were introduced in JavaScript.
// - Synchronous vs Asynchronous Callbacks: 
//   Callback functions can be synchronous (executed immediately) or asynchronous 
//   (executed after some time or an event).

// Synchronous Callback
function syncCallbackExample(callback) {
    console.log('Before callback');
    callback();
    console.log('After callback');
  }
  syncCallbackExample(() => console.log('This is a synchronous callback'));
  
  // Asynchronous Callback
  function asyncCallbackExample(callback) {
    console.log('Before async callback');
    setTimeout(callback, 2000); // Executes after 2 seconds
    console.log('After async callback');
  }
  asyncCallbackExample(() => console.log('This is an asynchronous callback'));
  
  // - The downside of asynchronous callbacks is the infamous "callback hell":
  setTimeout(() => {
    console.log('1 second passed');
    setTimeout(() => {
      console.log('2 seconds passed');
      setTimeout(() => {
        console.log('3 seconds passed');
        // This chaining becomes harder to read and maintain.
      }, 1000);
    }, 1000);
  }, 1000);
  
  // This problem is solved with Promises and async/await.
