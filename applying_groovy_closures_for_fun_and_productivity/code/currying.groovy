def report = { date, level, msg ->
  println "$date --- $level --- $msg"
}

today = new Date()
report today, 1, 'begin'
report today, 1, 'working...'
report today, 1, 'complete'

def reportToday = report.curry(today)
reportToday 1, 'being'
reportToday 1, 'working...'
reportToday 1, 'complete'

def reportTodayAtLevel2 = report.curry(today, 2)
reportTodayAtLevel2('cool')

def reportWorking = report.rcurry('working...')
reportWorking(today, 3)

def reportWorkingAtLevel2 = report.rcurry(2, 'working...')
reportWorkingAtLevel2(today)

def reportAtLevel4 = report.ncurry(1, 4)
reportAtLevel4(today, 'working?')