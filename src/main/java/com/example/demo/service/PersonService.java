package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Person;
import com.example.demo.entity.Wallet;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	WalletService walletService;

	@Transactional
	public Integer createPerson(String name) {
		
		Person person = new Person(name);
		person=personRepository.save(person);
		Wallet Wallet=walletService.createWalletAndAttachToPerson(person.getId().intValue());

		return Wallet.getId();
	}

}
