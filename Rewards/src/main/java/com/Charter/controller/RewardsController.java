package com.Charter.controller;

import com.Charter.entity.Rewards;
import com.Charter.entity.Transaction;
import com.Charter.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@CrossOrigin("*")
public class RewardsController {
    @Autowired
    RewardsService rewardsService;

    @RequestMapping(value="/save", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
    public void newRewards(@RequestBody Rewards rewards) {rewardsService.saveRewards(rewards);}

    @RequestMapping(value="/login", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
    public ResponseEntity<Rewards> handleLogin(@RequestBody Rewards rewards)
    {
        Rewards rewardsLogin = rewardsService.loginRewards(rewards);
        try {
            if(rewardsLogin != null) {
                return new ResponseEntity<>(rewardsLogin, HttpStatus.OK);
            }
            else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value="/recordTransaction", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
    public void recordTransaction(@RequestBody Rewards rewards, Date purchaseDate, Integer purchaseTotal)
    {
        rewardsService.recordTransaction(rewards, new Transaction(purchaseDate, purchaseTotal));
    }

    @RequestMapping(value="/testSuiteA", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
    public void testSuiteA() {}
}
