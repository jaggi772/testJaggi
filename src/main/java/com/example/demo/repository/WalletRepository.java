package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {

}
