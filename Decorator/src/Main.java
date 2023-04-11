
     abstract class Pizza{
        String description="Trial pizza";

        public String getdescription()
        {
            return  description;
        }
        public abstract int getcost();



    }
      class peppypanner extends Pizza
    {
        public  peppypanner()
        {
            description="Peppy Paneer";
        }

        @Override
        public int getcost() {
            return 250;
        }
    }

      class farmhouse extends Pizza
    {
        public  farmhouse()
        {
            description="Farm house";
        }

        @Override
        public int getcost() {
            return 350;
        }
    }

      class Margharita extends Pizza
    {
        public  Margharita()
        {
            description="Margharita";
        }

        @Override
        public int getcost() {
            return 150;
        }
    }

      class ChickenFiesta extends Pizza
    {
        public  ChickenFiesta()
        {
            description="Chicken Fiesta";
        }

        @Override
        public int getcost() {
            return 450;
        }
    }

     abstract class toppingsdecorator extends Pizza
    {
        public abstract String getdescription();
    }
     class  freshtomato extends toppingsdecorator

    {
        Pizza pizza;
        public freshtomato(Pizza pizza)
        {
            this.pizza=pizza;
        }

        @Override
        public String getdescription() {
            return pizza.getdescription()+" fresh tomato added";
        }

        @Override
        public int getcost() {
            return pizza.getcost()+40;
        }
    }

     class panneer extends toppingsdecorator
    {
        Pizza pizza;

        public panneer(Pizza pizza)
        {
            this.pizza=pizza;
        }
        @Override
        public String getdescription() {
            return pizza.getdescription()+" panneer  added";
        }

        @Override
        public int getcost() {
            return pizza.getcost()+90;
        }
    }

     class Jalapeno extends toppingsdecorator
    {
        Pizza pizza;
        public Jalapeno(Pizza pizza)
        {
            this.pizza=pizza;
        }
        @Override
        public String getdescription() {
            return pizza.getdescription()+" Jalapeno  added";
        }

        @Override
        public int getcost() {
            return pizza.getcost()+30;
        }
    }

     class Barbeque extends toppingsdecorator
    {
        Pizza pizza;
        public Barbeque(Pizza pizza)
        {
            this.pizza=pizza;
        }
        @Override
        public String getdescription() {
            return pizza.getdescription()+" Barbeque  added";
        }

        @Override
        public int getcost() {
            return pizza.getcost()+100;
        }
    }



class Pizzastore {

    public static void main(String[] args) {
        Pizza pizza = new peppypanner();
//        pizza = new Margharita();


        System.out.println("Description:" + pizza.getdescription());
        System.out.println("Cost:" + pizza.getcost());
        Pizza pizza2 = new Jalapeno(pizza);

        System.out.println("Description:" + pizza2.getdescription());
        System.out.println("Cost:" + pizza2.getcost());

        pizza2= new Barbeque(pizza2);

        System.out.println("Description:" + pizza2.getdescription());
        System.out.println("Cost:" + pizza2.getcost());



    }
}
