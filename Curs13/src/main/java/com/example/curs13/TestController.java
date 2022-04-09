package com.example.curs13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Locale;

@RestController
public class TestController implements ErrorController {

    @Autowired
    TimeZoneService timeZoneService;
    @Autowired
    Hogwarts harryPotter;
    @Autowired
    MathService mathService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {

        return "";
    }

//    @RequestMapping(value = "/time", method = RequestMethod.GET)
//            public LocalDateTime currentTime(@RequestParam(name = "timeZone") String timeZone){
//            return timeZoneService.getTimeByZone(timeZone);
//            }
    @GetMapping("time")
        public LocalDateTime getCurrentTime(@RequestParam("timeZone") String timeZone){
            return timeZoneService.getTimeByZone(timeZone);
    }

    @GetMapping("harry-potter")
    public String harryPotter() {
        return harryPotter.getName();
    }

    @PostMapping("math-service")
    public String operation(@RequestBody MathServiceParams mathServiceParams) {
        return "result " + mathService.operationResult(mathServiceParams);
    }
}
