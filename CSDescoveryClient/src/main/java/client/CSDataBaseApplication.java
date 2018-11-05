package client;

import org.springframework.web.bind.annotation.RequestMapping;

public class CSDataBaseApplication {
    @RequestMapping(value = "/available")
    public String available() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/checked-out")
    public String checkedOut() {
        return "Spring Boot in Action";
    }
}
