import java.util.Collection;

public class HelloWorld {
    private String name;
    private String prefix;
    private Collection<String> senders;

    public HelloWorld(final String name) {
        this.name = name;
    }

    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    public void setSenders(final Collection<String> senders) {
        this.senders = senders;
    }

    public void printHello() {
        System.out.println("Hello, " + prefix + " " + name + "!");
        System.out.println("From:");
        for (String s : senders) {
            System.out.println(s);
        }
    }
}