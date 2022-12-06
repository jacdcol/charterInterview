package com.Charter.repository;

import com.Charter.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardsRepository extends JpaRepository<Customer, String>
{
    @Query("SELECT s FROM Rewards s WHERE s.username=?1 AND s.password=?2")
    Customer login(String username, String password);

    @Query("ALTER s FROM Rewards s WHERE s.username=?1")
}
