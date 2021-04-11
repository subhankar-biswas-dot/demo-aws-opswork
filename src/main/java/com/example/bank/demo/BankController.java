package com.example.bank.demo;



import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController{
    @Autowired
    private BankRepo accountRepo;

    @GetMapping("/getAllAccounts")
    public List<Bank> getAccount(){
        
        return accountRepo.findAll();

    }

    @GetMapping("/getAccount/{id}")
    public Bank getAlienById(@PathVariable(value="id") String id){
        return accountRepo.findByAccountNumber(id);
    }

    @PostMapping("/enterAccount")
    public void postAccount(@RequestBody Bank alien){
       // System.out.println(alien);
        accountRepo.save(alien);
    }

    @PutMapping("/updateAccount/{id}")
    public void putAccount(@PathVariable(value="id") String  id, @RequestBody Bank alien){
        Bank newAlien = getAlienById(id);
        newAlien.setAccountNumber(alien.getAccountNumber());
        newAlien.setHolderName(alien.getHolderName());
        accountRepo.save(newAlien);

    }
    @DeleteMapping("/deleteAccount/{id}")
    public void deleteBank(@PathVariable(value="id") String id){
        Bank del = getAlienById(id);
        accountRepo.delete(del);
    }
}

    