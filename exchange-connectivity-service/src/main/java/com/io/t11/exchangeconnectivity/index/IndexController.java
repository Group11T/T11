package com.io.t11.exchangeconnectivity.Index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/")

public class IndexController {
    @GetMapping
    public IndexRoute indexRoute() {
        return new IndexRoute( true, "Exchange Connectivity", LocalDate.now());
    }
}
