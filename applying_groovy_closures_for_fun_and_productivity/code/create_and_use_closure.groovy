def total(numbers, selector) {
  def totalValue = 0
  for(e in numbers) {
    if(selector(e)) totalValue += e
  }
  totalValue
}

list = [1, 2, 3, 4]
println total(list, { true })
println total(list, { e -> e % 2 == 0 })
println total(list, { it % 2 != 0 })
println total(list) { it > 2 }

def fn(closure1, param1, closure2) {
  closure1()
  println "given param $param1"
  closure2()
}

fn({ println 'begin' }, 2, { println 'end' })
fn({ println 'begin'}, 2) { println 'end' }

