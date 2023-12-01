package Pizzaria;

import Pizzaria.Enum.BasePizza;
import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.Tamanho;
import Pizzaria.Enum.Unidade_Medida;
import Pizzaria.Ingredientes.Base;
import Pizzaria.Ingredientes.Ingrediente;
import Pizzaria.Ingredientes.Topping;

public class Main {
    public static void main(String[] args) {


        Ingrediente molhoTomate = new Ingrediente("I4587","Molho de tomate", Unidade_Medida.LITROS,5);
        Ingrediente molhoPesto = new Ingrediente("I1234", "Molho Pesto vegano", Unidade_Medida.GRAMAS, 1.5);
        Ingrediente molhoBranco = new Ingrediente("I4569","Molho Branco Vegano", Unidade_Medida.LITROS, 120);
        Ingrediente queijoRalado = new Ingrediente("I4587","Queijo Ralado Vegano", Unidade_Medida.GRAMAS, 2);
        Ingrediente queijoFatias = new Ingrediente("I8976", "Queijo em fatias Vegano", Unidade_Medida.UNIDADES, 50);
        Ingrediente creamCheese = new Ingrediente("I4523", "Cream Cheese Vegano", Unidade_Medida.GRAMAS, 1.8);
        Ingrediente chourico = new Ingrediente("I1819", "Rodelas de chouriço Vegano", Unidade_Medida.UNIDADES, 50);
        Ingrediente peperoni = new Ingrediente("I8910", "Pepperoni Vegano", Unidade_Medida.UNIDADES, 40);
        Ingrediente bacon = new Ingrediente("I9304", "bacon vegano", Unidade_Medida.GRAMAS,50);
        Ingrediente cebolaRoxa = new Ingrediente("I8367", "Cebola Roxa", Unidade_Medida.GRAMAS,3);
        Ingrediente azeitona = new Ingrediente("I73464", "Azeitonas Pretas", Unidade_Medida.GRAMAS,2);
        Ingrediente cogumelos = new Ingrediente("I8347", "Cogumelos frescos", Unidade_Medida.UNIDADES,0.5);
        Topping pimento = new Topping("I8475","Pimentos diversos", Unidade_Medida.GRAMAS, 3, OrigemIngrediente.PORTUGAL);
        Ingrediente alho = new Ingrediente("I6454", "Alho", Unidade_Medida.UNIDADES, 12);
        Base base1 = new Base("I90989", "Massa fina", Unidade_Medida.GRAMAS, 20, BasePizza.FINA,"Uma massa bem fininha!");
        Ingrediente base2 = new Ingrediente("I9384", "Massa Alta", Unidade_Medida.GRAMAS,30);
        Ingrediente base3 = new Ingrediente("I9485", "Massa sem glúten", Unidade_Medida.GRAMAS,35);



        Pizza pizza = new Pizza("4589","Vegan Calabresa", "É vegan porra",19.99, Tamanho.GRANDE);


        Pizza pizza2 = new Pizza("P0001", "Chouriçada vegan", "Deliciosa e sem carne", 20.90, Tamanho.GRANDE);



        pizza.addIngredientes(new Ingrediente_Pizza(queijoFatias,10));
        pizza.addIngredientes(new Ingrediente_Pizza(molhoTomate, 0.2));
        pizza.addIngredientes(new Ingrediente_Pizza(peperoni,10));
        pizza.addIngredientes(new Ingrediente_Pizza(alho,2));

        System.out.println();

        pizza.exibirDetalhes_Pizza();

        System.out.println();

        pizza2.addIngredientes(new Ingrediente_Pizza(base1, 200));




    }
}
