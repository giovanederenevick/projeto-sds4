package br.com.giovanederenevick.dsvendas.dto;

import br.com.giovanederenevick.dsvendas.entities.Seller;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SellerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
