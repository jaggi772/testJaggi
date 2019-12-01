//package com.example.demo;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demo.entity.Person;
//import com.example.demo.entity.Wallet;
//import com.example.demo.repository.PersonRepository;
//import com.example.demo.service.PersonService;
//import com.example.demo.service.WalletService;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class PersonServiceTest {
//
//	@InjectMocks
//	private PersonService personService;
//	@MockBean(name = "personRepository")
//	private PersonRepository personRepository;
//	
//	@MockBean(name = "walletService")
//	WalletService walletService;
//	
//	@BeforeEach
//	public void init() {
//		System.out.print("berfor called");
//		MockitoAnnotations.initMocks(this);
//	}
//
//	
//	@Test
//	public void testcheck() {
//		Wallet wallet = new Wallet();
//		wallet.setId(1);
//		when(personRepository.save(Mockito.any(Person.class))).thenAnswer( ans -> {
//			return ans;
//		});
//		when(walletService.createWalletAndAttachToPerson(Mockito.anyInt())).thenReturn(wallet);
//		assertEquals(1,personService.createPerson("jaggi"));
//	}
//	
////	@Test
////	public void shouldCreatePersonWithEmptyWallet() {
////		// when
////		Integer jeremyId = personService.createPerson("Jeremy");
////
////		// then
////		Optional<Person> jeremy = personRepository.findById(jeremyId);
////		assertThat(jeremy).isPresent();
////		Wallet jeremyWallet = jeremy.get().getWallet();
////		assertThat(jeremyWallet.getId()).isNotNull();
////		assertThat(jeremyWallet.getAmount()).isZero();
////	}
//
//}