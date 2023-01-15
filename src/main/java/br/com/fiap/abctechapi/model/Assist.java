package br.com.fiap.abctechapi.model;
import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name = "assitances")
public class Assist {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name=)

}
