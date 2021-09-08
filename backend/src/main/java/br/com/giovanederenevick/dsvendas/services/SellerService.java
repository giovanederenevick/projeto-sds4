package br.com.giovanederenevick.dsvendas.services;

import br.com.giovanederenevick.dsvendas.dto.SellerDTO;
import br.com.giovanederenevick.dsvendas.entities.Seller;
import br.com.giovanederenevick.dsvendas.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> findAll() {

        List<Seller> result = sellerRepository.findAll();

        return result.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
