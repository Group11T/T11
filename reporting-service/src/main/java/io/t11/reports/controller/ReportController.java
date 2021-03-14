package io.t11.reports.controller;

import io.t11.reports.service.TradeSubscriber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @GetMapping("/trade/orders")
    public List<String> getTradeEngineMessages(){
        return new TradeSubscriber().messageList;
    }
}
