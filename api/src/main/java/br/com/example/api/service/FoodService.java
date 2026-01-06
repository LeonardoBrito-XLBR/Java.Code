package br.com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.example.api.model.FoodModelo;
import br.com.example.api.repository.FoodRespository;

@Service
public class FoodService {

   
    private final FoodRespository foodRespository;

    public FoodService  (FoodRespository foodRespository){
        this.foodRespository = foodRespository;
    }

    //LISTAR TUDO DO BANCO
    public List<FoodModelo> getAll(){
        return foodRespository.findAll();
        
    }

    //SALVAR NO BANCO A ENTIDADE DO TIPO MODELO
    public FoodModelo save(FoodModelo food){
        return foodRespository.save(food);
    }

    public FoodModelo editar(FoodModelo food){
        return foodRespository.save(food);
    }

    //DELETAR
    public void delete(Long id){
        foodRespository.deleteById(id);
    }
    
    
}