package io.library.management.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, insertable = true, updatable = true)
    private String name;

    @Min(value = 1)
    @Column(name = "initial_stock", nullable = false, insertable = true, updatable = true)
    private int initialStock;

    @Min(value = 0)
    @Column(name = "remaining_stock", nullable = false, insertable = true, updatable = true)
    private int remainingStock;

}
