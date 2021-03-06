package com.example.demo17.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Locale;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "approvisionnement")
public class ApprovisionnementModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qte;
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "produitId", insertable = false, updatable = false)
    private ProduitModel produitModel;
    private int produitId;
}
