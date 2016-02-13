public class Mailer {
  public Mailer to(String address) { System.out.println('to called'); return this; }
  public Mailer from(String address) { System.out.println('from called'); return this; }
  public Mailer subject(String address) { System.out.println('subject called'); return this; }
  public Mailer message(String address) { System.out.println('message called'); return this; }
  public void send() { System.out.println('send...'); }
}

new Mailer()
 .to('venkats@agiledeveloper.com')
 .from('build@agiledeveloper.com')
 .subject('you broke the build')
 .message('shame on you')
 .send();
