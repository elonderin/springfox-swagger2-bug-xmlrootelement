package hello;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "greeting-jaxb")
public class Greeting {

  @XmlElement(name = "my-id")
  private final long   id;
  private final String content;

  public Greeting(final long id, final String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
