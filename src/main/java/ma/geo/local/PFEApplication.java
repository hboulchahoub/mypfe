package ma.geo.local;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER= LoggerFactory.getLogger(PFEApplication.class);

    @Autowired
    private Environment env;

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(PFEApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOGGER.info("Access URLs:\n----------------------------------------------------------\n\t" +
                        "Local: \t\thttp://127.0.0.1:{}/swagger-ui/#/\n\t" +
                        "External: \thttp://{}:{}/swagger-ui/#/\n----------------------------------------------------------",

                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port")
        );

    }
}
