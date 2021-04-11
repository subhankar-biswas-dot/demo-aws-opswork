package com.example.bank.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<Bank,String>{

    //public void saveOrUpdate(Aliens alien);
    public Bank findByAccountNumber(String id);

}