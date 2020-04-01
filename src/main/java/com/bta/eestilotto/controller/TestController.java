package com.bta.eestilotto.controller;

import com.bta.eestilotto.domain.UserAccount;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
    @GetMapping(value = {"/","/index1"})
    public String index(Model model) {
        model.addAttribute("myTitle", "My First Page Title");

        return "index";
    }

    //@RequestMapping(path = "/get", method = RequestMethod.GET)
    @GetMapping("/get")
    public ResponseEntity<String> getHelloWorld(@RequestParam String param1, @RequestParam String param2) {
        System.out.println(param1);
        System.out.println(param2);

        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    //@RequestMapping(path = "/getById/{number}", method = RequestMethod.GET)
    @GetMapping("/getByid/{number}")
    public ResponseEntity<String> getByld(@PathVariable Long number) {
        System.out.println(number);

        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    //@RequestMapping(path = "/post", method = RequestMethod.POST)
    @PostMapping("/post")
    public ResponseEntity<Object> postHelloWorld(@RequestBody UserAccount userAccount) {
        userAccount.setFirstName("AfterPOST");
        userAccount.setId(999L);

        return new ResponseEntity<>(userAccount, HttpStatus.OK);
    }
}
