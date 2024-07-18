package net.khoudmi.ensetdemospringang.repository;

import net.khoudmi.ensetdemospringang.entities.Payment;
import net.khoudmi.ensetdemospringang.entities.PaymentStatus;
import net.khoudmi.ensetdemospringang.entities.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByStudentCode(String code);
    List<Payment> findByStatus(PaymentStatus status);
    List<Payment> findByType(PaymentType type);
}
