//SICP
//procedure vs. process
//Iteration - iteration
//Recursion - recursion
//Recursion -> iteration

def foo
foo = { a ->
  if (a == 1) throw new RuntimeException("mad")
  1 * foo(a - 1)
}

try {
  foo(5)
} catch(ex) {
  println ex.printStackTrace()
}

def gracefullFoo
gracefullFoo = {a ->
  if (a == 1) throw new RuntimeException('Mad')
  gracefullFoo.trampoline(a - 1)
}.trampoline()

gracefullFoo(5)