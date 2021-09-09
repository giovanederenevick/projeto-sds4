package br.com.giovanederenevick.dsvendas.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_sales")
public class Sale implements Serializable {

   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private Integer visited;
   private Integer deals;
   private Double amount;
   private LocalDate date;

   @ManyToOne
   @JoinColumn(name = "seller_id")
   private Seller seller;

   public Sale(Long id, Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
      this.id = id;
      this.visited = visited;
      this.deals = deals;
      this.amount = amount;
      this.date = date;
      this.seller = seller;
   }
}
