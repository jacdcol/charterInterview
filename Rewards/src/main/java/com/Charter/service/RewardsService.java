package com.Charter.service;

import com.Charter.entity.Rewards;
import com.Charter.repository.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    @Autowired
    RewardsRepository rewardsRepository;

    public void saveCustomer(Rewards rewards) {rewardsRepository.save(rewards);}
    public Rewards loginRewards(Rewards rewards) {return rewardsRepository.login(rewards.getUsername(), rewards.getPassword());}
    public void recordTransaction(Rewards rewards, Integer purchaseTotal)
    {
        Integer points = rewards.getPoints();
        if(purchaseTotal > 100){
            points += 50 + 2 * (purchaseTotal - 100);
        }
        else if(purchaseTotal > 50){
            points += purchaseTotal - 50;
        }
        rewardsRepository.updatePoints(rewards.getUsername(), points);
    }
}
