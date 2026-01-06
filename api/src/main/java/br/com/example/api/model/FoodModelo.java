package br.com.example.api.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //DEFINE QUE ISSO É UMA ENTIDADE NO BANCO
public class FoodModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate data_expericao;
    private Integer quantidade;

    public FoodModelo(){
        
    }

    public FoodModelo(String nome, LocalDate data_expericao, Integer quantidade){
        this.nome = nome;
        this.data_expericao = data_expericao;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public LocalDate getData_expericao() {
        return data_expericao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Long getId() {
        return id;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setData_expericao(LocalDate data_expericao) {
        this.data_expericao = data_expericao;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
