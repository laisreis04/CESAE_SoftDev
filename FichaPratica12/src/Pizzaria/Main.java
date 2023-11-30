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

        Topping molhoTomate = new Topping("I4587","Molho de tomate", Unidade_Medida.LITROS,5, OrigemIngrediente.ESPANHA);
        Topping molhoPesto = new Topping("I1234", "Molho Pesto vegano", Unidade_Medida.GRAMAS, 1.5,OrigemIngrediente.BRASIL);
        Topping molhoBranco = new Topping("I4569","Molho Branco Vegano", Unidade_Medida.LITROS, 120, OrigemIngrediente.ESPANHA);
        Topping queijoRalado = new Topping("I4587","Queijo Ralado Vegano", Unidade_Medida.GRAMAS, 2, OrigemIngrediente.BRASIL);
        Topping queijoFatias = new Topping("I8976", "Queijo em fatias Vegano", Unidade_Medida.UNIDADES, 50, OrigemIngrediente.ESPANHA);
        Topping creamCheese = new Topping("I4523", "Cream Cheese Vegano", Unidade_Medida.GRAMAS, 1.8, OrigemIngrediente.ESPANHA);
        Topping chourico = new Topping("I1819", "Rodelas de chouriço Vegano", Unidade_Medida.UNIDADES, 50, OrigemIngrediente.BRASIL);
        Topping peperoni = new Topping("I8910", "Pepperoni Vegano", Unidade_Medida.UNIDADES, 40, OrigemIngrediente.BRASIL);
        Topping bacon = new Topping("I9304", "bacon vegano", Unidade_Medida.GRAMAS,50, OrigemIngrediente.ESPANHA);
        Topping cebolaRoxa = new Topping("I8367", "Cebola Roxa", Unidade_Medida.GRAMAS,3, OrigemIngrediente.PORTUGAL);
        Topping azeitona = new Topping("I73464", "Azeitonas Pretas", Unidade_Medida.GRAMAS,2, OrigemIngrediente.PORTUGAL);
        Topping cogumelos = new Topping("I8347", "Cogumelos frescos", Unidade_Medida.UNIDADES,0.5, OrigemIngrediente.ESPANHA);
        Topping pimento = new Topping("I8475","Pimentos diversos", Unidade_Medida.GRAMAS, 3, OrigemIngrediente.ESPANHA);
        Topping alho = new Topping("I6454", "Alho", Unidade_Medida.UNIDADES, 12, OrigemIngrediente.PORTUGAL);
        Base base1 = new Base("I90989", "Massa fina", Unidade_Medida.GRAMAS, 20, BasePizza.FINA, "Fininhas e sem muitas calorias");
        Base base2 = new Base("I9384", "Massa Alta", Unidade_Medida.GRAMAS,30, BasePizza.ALTA, "nada como uma boa base alta, para não deixar o recheio fugir");
        Base base3 = new Base("I9485", "Massa sem glúten", Unidade_Medida.GRAMAS,35, BasePizza.SEM_GLUTEN,"Deliciosa Pizza sem glúten");


        Pizza pizza = new Pizza("4589","Vegan Calabresa", "É vegan porra",19.99, Tamanho.GRANDE);

        Pizza pizza2 = new Pizza("P-0002", "Pizza Chouriçada Vegan", "Aquele gosto que te engana", 20.99, Tamanho.GRANDE);


        pizza.addIngredientes(new Ingrediente_Pizza(queijoFatias,10));
        pizza.addIngredientes(new Ingrediente_Pizza(molhoTomate, 0.2));
        pizza.addIngredientes(new Ingrediente_Pizza(peperoni,10));
        pizza.addIngredientes(new Ingrediente_Pizza(alho,2));

        System.out.println();

        pizza.exibirDetalhes_Pizza();

        System.out.println();

        pizza2.addIngredientes(new Ingrediente_Pizza(base1, 200));
        pizza2.addIngredientes(new Ingrediente_Pizza(chourico, 10));
        pizza2.addIngredientes(new Ingrediente_Pizza(molhoPesto, 0.5));
        pizza2.addIngredientes(new Ingrediente_Pizza(cogumelos, 200));
        pizza2.addIngredientes(new Ingrediente_Pizza(queijoFatias, 5));

        pizza2.exibirDetalhes_Pizza();
        System.out.println();



    }
}
