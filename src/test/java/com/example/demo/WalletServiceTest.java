//package com.example.demo;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demo.entity.Person;
//import com.example.demo.entity.Wallet;
//import com.example.demo.repository.PersonRepository;
//import com.example.demo.repository.WalletRepository;
//import com.example.demo.service.WalletService;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class WalletServiceTest {
//
//	@Autowired
//	private PersonRepository personRepository;
//	@Autowired
//	private WalletRepository walletRepository;
//	@Autowired
//	private WalletService walletService;
//
//	@Test
//	public void shouldCreateAndAddEmptyWalletToPerson() {
//		// given
//		Person margaret = personRepository.save(new Person("Margaret"));
//
//		// when
//		Integer walletId = walletService.createWalletAndAttachToPerson(margaret.getId()).getId();
//
//		// then
//		Optional<Wallet> dbWallet = walletRepository.findById(walletId);
//		assertThat(dbWallet).isPresent();
//
//		Optional<Person> dbMargaret = personRepository.findById(margaret.getId());
//		assertThat(dbMargaret).isPresent();
//
//		Wallet margaretWallet = dbMargaret.get().getWallet();
//		assertThat(margaretWallet).isNotNull();
//		assertThat(margaretWallet.getId()).isNotNull();
//		assertThat(margaretWallet.getAmount()).isZero();
//	}
//
//}