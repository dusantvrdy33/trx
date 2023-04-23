package com.trxproject.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.trxproject.rest.models.*;
import com.trxproject.rest.services.TransactionService;

@RestController
@RequestMapping
public class ApiControllers {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/accounts/{acc}/transactions")
    @ResponseBody
    public List<TransactionDTO> getTrxsPerAccount(@PathVariable String acc) {
        return transactionService.findTrxPerAccount(acc);
    }

}
