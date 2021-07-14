    public class Kucing {
       private String color;
       private Double height;
       private Double length;
       private Double weight;
     
       public Kucing() {
       }
      
       public Kucing(String color, Double height, Double length, Double weight) {
           this.color = color;
           this.height = height;
           this.length = length;
           this.weight = weight;
       }
     
       public String getColor() {
           return color;
       }
     
       public void setColor(String value) {
           this.color = value;
       }
     
       public Double getHeight() {
           return height;
       }
     
       public void setHeight(Double value) {
           this.height = value;
       }
     
       public Double getLength() {
           return length;
       }
     
       public void setLength(Double value) {
           this.length = value;
       }
     
       public Double getWeight() {
           return weight;
       }
     
       public void setWeight(Double value) {
           this.weight = value;
       }
    }