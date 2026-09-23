package id.ac.polinema.lumajang.portalku.jurnal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jurnal")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jurnal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String judul;

    @Column(nullable = false, length = 100)
    private String penerbit;

    @Column(name = "tahun_terbit", nullable = false)
    private Integer tahunTerbit;
}