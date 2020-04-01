package com.bta.eestilotto.controller;

import com.bta.eestilotto.domain.VikingLottoResult;
import com.bta.eestilotto.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VikingLottoController {
    @Autowired
    private ResultService resultService;

    @GetMapping("/vikinglotto")
    public String vikingLotto(Model model) {

        return "game";
    }

    @GetMapping ("/play")
    public String playVikingLotto (Model model) {
        resultService.getResults();
        List<VikingLottoResult> results = resultService.getAllResults();
        model.addAttribute("results", results);

        return "game";
    }
}
