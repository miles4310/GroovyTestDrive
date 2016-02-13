def foo = { e -> "${toUpperCase()} $e" }

try {
  foo('James')
} catch(ex) {
  println ex
}

str = 'hello'
foo.delegate = str
println foo('James')