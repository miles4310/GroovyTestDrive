def factorial1(BigInteger number) {
  if (number == 1)
    number
  else
    number * factorial1(number - 1)
}

println factorial1(5)

try {
  println factorial1(5000)
} catch(ex) {
  println ex
}