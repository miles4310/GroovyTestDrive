public class Mailer {
  public Mailer to(String address) { System.out.println('to called'); return this; }
  public Mailer from(String address) { System.out.println('from called'); return this; }
  public Mailer subject(String address) { System.out.println('subject called'); return this; }
  public Mailer message(String address) { System.out.println('message called'); return this; }
  public static void send(block) { 
    Mailer mailer = new Mailer()
    block(mailer)
    System.out.println('send...'); 
  }
}

Mailer.send { mailer ->
  mailer.to('venkats@agiledeveloper.com')
  mailer.from('build@agiledeveloper.com')
  mailer.subject('you broke the build')
  mailer.message('shame on you')
}
