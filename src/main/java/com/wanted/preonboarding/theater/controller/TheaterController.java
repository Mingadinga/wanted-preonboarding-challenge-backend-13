package com.wanted.preonboarding.theater.controller;

import com.wanted.preonboarding.theater.service.TheaterService;
import com.wanted.preonboarding.theater.service.dto.AudienceTicketPurchaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
@RequiredArgsConstructor
public class TheaterController {
    private final TheaterService theaterService;

    @GetMapping("hello")
    public String welcomeMessage(){
        return "Welcome to The Wanted Theater";
    }

    @GetMapping("enter")
    public String enter(@ModelAttribute("dto") AudienceTicketPurchaseDto dto){
        return theaterService.enter(dto);
    }
}
