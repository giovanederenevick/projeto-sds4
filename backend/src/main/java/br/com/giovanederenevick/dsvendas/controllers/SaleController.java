package br.com.giovanederenevick.dsvendas.controllers;

import br.com.giovanederenevick.dsvendas.dto.SaleDTO;
import br.com.giovanederenevick.dsvendas.dto.SaleSuccessDTO;
import br.com.giovanederenevick.dsvendas.dto.SaleSumDTO;
import br.com.giovanederenevick.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {

        Page<SaleDTO> list = saleService.findAll(pageable);

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {

        List<SaleSumDTO> list = saleService.amountGroupedBySeller();

        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {

        List<SaleSuccessDTO> list = saleService.successGroupedBySeller();

        return ResponseEntity.ok(list);
    }
}
