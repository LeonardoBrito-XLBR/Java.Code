
package br.com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.api.repository.FoodRespository;
import br.com.example.api.service.FoodService;
import br.com.example.api.model.FoodModelo;

@RestController
@RequestMapping("/food")//link para acessar o certo servico https:ifood.com.br/food
public class FoodControle {

    @Autowired
    private FoodService foodService;
    

    public FoodControle(FoodService foodService, FoodRespository foodRespository) {
        this.foodService = foodService;
    }


    @GetMapping("/listar")
    public List<FoodModelo> getAll(){
        return foodService.getAll();
    }

    @PostMapping("/salvar")
    public FoodModelo create(@RequestBody FoodModelo food){
        return foodService.save(food);
    }

    @PutMapping("/atualizar")
    public FoodModelo editar(@RequestBody FoodModelo f) {
        return foodService.editar(f);
    }
    
    @DeleteMapping("/deletar/{id}")
        public void remover (@PathVariable Long id){
            foodService.delete(id);
        }
    
}