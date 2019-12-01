package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Person;
import com.example.demo.entity.Wallet;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.WalletRepository;

@Service
public class WalletService {

	@Autowired
	WalletRepository walletRepository;

	@Autowired
	PersonRepository personRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.SERIALIZABLE)
	public Wallet createWalletAndAttachToPerson(Integer personId) {
		Wallet emptyWallet = new Wallet();
		walletRepository.save(emptyWallet);
		Person person = personRepository.findById(personId).orElseThrow();
		person.setWallet(emptyWallet);
		return emptyWallet;
	}

}
