# Factorial-Questions

<h1>Learning Data Structures and Algorithms with Java</h1>
    <h2>Post 3: Functions and Methods</h2>
    <p>Hello Everyone!</p>
    <p>Today is the third post in our series on learning Data Structures and Algorithms with Java.</p>
    <p>In today's post, we'll focus on Functions and Methods.</p>

<h3>Functions</h3>
    <p>A function can be defined as a block of organized, reusable code that is used to perform a specific action multiple times in your program.</p>

<h3>Methods</h3>
    <p>Methods are similar to functions, but the main difference is that methods are written inside classes (this is a concept from Object-Oriented Programming, which we'll cover in the future). Methods are called by objects.</p>

<h3>Programs</h3>
    <p>Let's discuss the programs I have worked on to clear up the concept of functions:</p>

<h4>1. Product of Two Numbers</h4>
    <p>In this program, the main function contains two variables that store user input. These inputs are then passed as arguments to a function named <code>product</code>, which takes two parameters, <code>a</code> and <code>b</code>. Inside the <code>product</code> function, I created a new variable, <code>c</code>, to store the product of the two numbers. This value is then returned to the main function and stored in the variable <code>result</code>. This is how the problem was solved.</p>

<h4>2. Factorial Calculation</h4>
    <p>This program focuses on calculating the factorial of a number. I assume you already know what a factorial is.</p>
    <p>In the main function, I took the user input and passed it to the <code>fact</code> function. In the <code>fact</code> function, if the user input is either 0 or 1, the function returns 1. For input values of 2 or more, I used a for loop to calculate the factorial. I initialized a variable with the value 1, and within the loop, I multiplied this variable by the loop counter on each iteration, storing the result back in the same variable. This is how the factorial of any number is obtained.</p>
