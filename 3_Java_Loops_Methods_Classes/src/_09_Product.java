 public class _09_Product implements Comparable<_09_Product>{
        private String name;
        private double price;
       
        public _09_Product(String name, double price){
                this.name = name;
                this.price = price;
        }
       
        public String getName(){
                return name;
        }
       
        public double getPrice(){
                return price;
        }
       
        public int compareTo(_09_Product compareFruit) {
                 
                double otherPrice = ((_09_Product) compareFruit).getPrice();
 
                //ascending order
                if(this.price>otherPrice) return 1;
                else
                if(this.price==otherPrice) return 0;
                return -1;
        }      
}