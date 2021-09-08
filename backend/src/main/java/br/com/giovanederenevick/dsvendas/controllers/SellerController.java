package br.com.giovanederenevick.dsvendas.controllers;

import br.com.giovanederenevick.dsvendas.dto.SellerDTO;
import br.com.giovanederenevick.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {

        List<SellerDTO> list = sellerService.findAll();

        return ResponseEntity.ok(list);
    }
}
