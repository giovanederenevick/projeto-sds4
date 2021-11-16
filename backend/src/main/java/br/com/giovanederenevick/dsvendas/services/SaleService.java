package br.com.giovanederenevick.dsvendas.services;

import br.com.giovanederenevick.dsvendas.dto.SaleDTO;
import br.com.giovanederenevick.dsvendas.dto.SaleSuccessDTO;
import br.com.giovanederenevick.dsvendas.dto.SaleSumDTO;
import br.com.giovanederenevick.dsvendas.entities.Sale;
import br.com.giovanederenevick.dsvendas.repository.SaleRepository;
import br.com.giovanederenevick.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {

        sellerRepository.findAll();

        Page<Sale> result = saleRepository.findAll(pageable);
        System.out.println("TESTE");
        return result.map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }
}
