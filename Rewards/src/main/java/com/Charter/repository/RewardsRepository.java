package com.Charter.repository;

import com.Charter.entity.Rewards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<Rewards, String>
{
    @Query("SELECT s FROM Rewards s WHERE s.username=?1 AND s.password=?2")
    Rewards login(String username, String password);

    @Query("UPDATE Rewards s SET s.points = ?2 where s.username = ?1")
    void updatePoints(String username, Integer points);
}
