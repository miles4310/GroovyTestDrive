import static groovyx.gpars.GParsPool.withPool

def getPizza() {
  println 'getting...pizza'
  Thread.sleep(2000)
  'pizza is here...'
}

def getDrinks() {
  Thread.sleep(2000)
  println 'Drink is here...'
}

TimeIt.code {
  getPizza()
  getDrinks()
}

TimeIt.code {
  withPool {
    def resultFuture = { getPizza() }.callAsync() 
    getDrinks()
    println resultFuture.get()    
  }
}

try {
  TimeIt.code {
    withPool {
      def resultFuture = { getPizza() }.callTimeoutAsync(100) 
      getDrinks()
      println resultFuture.get()    
    }
  }  
} catch(ex) {
  println ex
}

