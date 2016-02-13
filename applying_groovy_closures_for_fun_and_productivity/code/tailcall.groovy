def factorial(BigInteger candidate) {
  def factorialImpl
  factorialImpl = { BigInteger fact, BigInteger number ->
    if (number == 1)
      fact
    else
      factorialImpl.trampoline(fact * number, number -1)
  }.trampoline()

  factorialImpl(1, candidate)
}

println factorial(5)
println factorial(5000)