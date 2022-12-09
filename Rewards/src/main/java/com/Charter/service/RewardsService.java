package com.Charter.service;

import com.Charter.entity.Rewards;
import com.Charter.entity.Transaction;
import com.Charter.repository.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    @Autowired
    RewardsRepository rewardsRepository;

    public void saveRewards(Rewards rewards) {rewardsRepository.save(rewards);}
    public Rewards loginRewards(Rewards rewards) {return rewardsRepository.login(rewards.getUsername(), rewards.getPassword());}
    public void recordTransaction(Rewards rewards, Transaction transaction)
    {
        Integer points = rewards.getPoints();
        Integer purchaseTotal = Integer.valueOf((int)transaction.getPurchaseTotal());
        if(purchaseTotal > 100){
            points += 50 + 2 * (purchaseTotal - 100);
        }
        else if(purchaseTotal > 50){
            points += purchaseTotal - 50;
        }
        System.out.println(transaction);
        System.out.println(rewards.pointsToString());
        rewardsRepository.updatePoints(rewards.getUsername(), points);
    }
}
