package com.fikry.library.repository;


import com.fikry.library.entity.Book;
import com.fikry.library.entity.Loan;
import com.fikry.library.entity.Member;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByMember(Member member);

    Optional<Loan> findByBookAndReturnDateIsNull(Book book);
}