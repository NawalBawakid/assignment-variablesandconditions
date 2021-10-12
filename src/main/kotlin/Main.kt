fun main(args: Array<String>) {

    /* Question 1
    Write a Kotlin program that designs a calculator.
    The program should read from the user two integer numbers and a character
    which indicates the type of operation desired. +, -, *, / and %.
     */

    var num1 = 0
    var num2 = 0
    var add = '+'
    var sub = '-'
    var mul = '*'
    var div = '/'
    var module = '%'

    println("Enter the first number: ")
    num1 = readLine()!!.toInt()

    println("Enter the second number: ")
    num2 = readLine()!!.toInt()

    println("Enter the operation (+,-,*,/,%) ")
    var operation = readLine()!!.single()

    println("The result is: ")

    if(operation == add){
        println(num1 + num2)
    }else if(operation == sub){
        println(num1-num2)
    }else if(operation == mul){
        println(num1*num2)
    }else if(operation == div){
        println(num1/num2)
    }else if(operation == module) {
        println(num1 % num2)
    }


    println("----------------------------------------------------------------------")


    /* Question 2
    Complete the following program to determine the raise and new salary for an employee
    by adding if -else statements to compute the raise.
    The input to program includes the current annual salary for the employee
    and a number indicating the performance rating (1=excellent, 2=good, and 3=poor).
    An employee with a rating of 1 will receive a 6% raise,
    an employee with a rating of 2 will receive a 4% raise,
    and one with a rating of 3 will receive a 1.5% raise.
     */

    var salary = 0.0
    var performance = 0

    println("Enter employee salary: ")
    salary = readLine()!!.toDouble()

    println("Enter employee performance: (1,2,3)")
    performance = readLine()!!.toInt()



    if(performance == 1){
        println("The new employee salary is: " + (salary+(salary * 6/100)) + " and performance is Excellence")
    }else if(performance == 2){
        println("The new employee salary is: " + (salary + (salary * 4/100)) + " and performance is good")
    }else if(performance == 3){
        println("The new employee salary is: " + (salary + (salary * 1.5/100)) + " and performance is poor")
    }

}