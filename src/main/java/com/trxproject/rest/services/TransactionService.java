package com.trxproject.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trxproject.rest.models.Transaction;
import com.trxproject.rest.models.TransactionDTO;
import com.trxproject.rest.repositories.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<TransactionDTO> findTrxPerAccount(String acc) {
        List<Transaction> list = transactionRepository.findAll();
        return list.stream()
                .filter(transaction -> transaction.getOwnAccountNumber().equals(acc))
                .map(TransactionDTO::new)
                .toList();
    }
}
