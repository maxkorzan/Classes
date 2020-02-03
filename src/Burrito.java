public class Burrito {
        //variables
        private String rice;
        private String bean;
        private String meat;
        private Veggies veggies;


        //default constructor
        public Burrito(){

        }

        //setters
        public void setRice(String rice){
            this.rice = rice;
        }

        //getters
        public String getRice(){
            return this.rice;
        }

        public void setBean(String bean){
            this.bean = bean;
        }
        public String getBean(){
            return this.bean;
        }

        public void setMeat(String meat){
            this.meat = meat;
        }
        public String getMeat(){
            return this.meat;
        }

        public void setVeggies(Veggies veggies){
            this.veggies = veggies;
        }
        public Veggies getVeggies(){
            return this.veggies;
        }




}
