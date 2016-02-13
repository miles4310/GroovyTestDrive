public class Mailer {
  public void to(String address) { System.out.println('to called'); }
  public void from(String address) { System.out.println('from called'); }
  public void subject(String address) { System.out.println('subject called'); }
  public void message(String address) { System.out.println('message called'); }
  public void send() { System.out.println('send...'); }
}

Mailer mailer = new Mailer();
mailer.to('venkats@agiledeveloper.com');
mailer.from('build@agiledeveloper.com');
mailer.subject('you broke the build');
mailer.message('shame on you');
mailer.send();
