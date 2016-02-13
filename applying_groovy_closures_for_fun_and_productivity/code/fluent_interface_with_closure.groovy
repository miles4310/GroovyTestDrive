public class Mailer {
  public Mailer to(String address) { System.out.println('to called'); return this; }
  public Mailer from(String address) { System.out.println('from called'); return this; }
  public Mailer subject(String address) { System.out.println('subject called'); return this; }
  public Mailer message(String address) { System.out.println('message called'); return this; }
  public static void send(block) { 
    Mailer mailer = new Mailer()
//    block.delegate = mailer
//    block()

//The below is better because we make a copy
//and did not mess with the given block
//    def clone = block.clone()
//    clone.delegate = mailer
//    clone()
  
    //one line below replaces the above 3 commented lines
    mailer.with block
    System.out.println('send...'); 
  }
}

Mailer.send {
  to 'venkats@agiledeveloper.com'
  from 'build@agiledeveloper.com'
  subject 'you broke the build'
  message 'shame on you'
}
