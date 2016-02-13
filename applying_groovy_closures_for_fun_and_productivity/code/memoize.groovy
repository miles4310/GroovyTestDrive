def fib(number) {
  if (number < 2)
    number
  else
    fib(number - 1) + fib(number - 2)
}

TimeIt.code { println fib(40) }

def fibM
fibM = { number ->
  if (number < 2)
    number
  else
    fibM(number - 1) + fibM(number - 2)
}.memoize()

TimeIt.code { println fibM(40) }
TimeIt.code { println fibM(400) }