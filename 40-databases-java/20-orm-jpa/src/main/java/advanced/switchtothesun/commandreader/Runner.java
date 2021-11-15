package advanced.switchtothesun.commandreader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class Runner implements CommandLineRunner {

    private CommandReader commandReader;

    @Autowired
    public Runner(CommandReader commandReader) {
        this.commandReader = commandReader;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("****************************************");
        System.out.println("Welcome to Switch To The Sun Application");
        System.out.println("****************************************");
        commandReader.startReadingUserInput();
    }
}
