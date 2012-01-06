package springapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Controller
public class HelloController {

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value="/home")
    public String home() {
        logger.info("Returning hello view");
        return "home";
    }

    @RequestMapping(value="/test")
    public String test() {
        logger.info("Returning hello view");
        return "test";
    }

}