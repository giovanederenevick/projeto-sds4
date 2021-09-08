package br.com.giovanederenevick.dsvendas.repository;

import br.com.giovanederenevick.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
