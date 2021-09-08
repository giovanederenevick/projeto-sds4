package br.com.giovanederenevick.dsvendas.repository;

import br.com.giovanederenevick.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
