package com.io.t11.exchangeconnectivity.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/")

public class IndexController {
    // index controller
    @GetMapping
    public IndexRoute index() {
        return new IndexRoute(
                true,
                "Exchange Connectivity Service",
                LocalDate.now()
        );
    }
}
