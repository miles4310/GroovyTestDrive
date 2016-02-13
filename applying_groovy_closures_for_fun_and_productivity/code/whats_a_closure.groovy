def printit = { e -> println e }
//printit is a lambda-expression

printit(2)

def list = [1, 2, 3, 4]
list.each printit

list.each { println it }

def total = 0 
list.each { e -> total += e }
println "Total is $total"

//this lambda expression closes over
//the scores - it is a closure.