package OOpsfinal.a;
class Container{
    int length;
    int breadth;
    int height;

    Container(){
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }
    Container(int side){
        this.length = side;
        this.breadth = side;
        this.height = side;
    }
    Container(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    Container(Container box){
        this.length = box.length;
        this.breadth = box.breadth;
        this.height = box.height;
    }
}

class Weight extends Container{
    int weight;
    Weight(){
        super();
        this.weight = -1;
    }
    Weight(int weight, int side){
        super(side);
        this.weight = weight;
    }
    Weight(int length, int breadth, int height, int weight){
        super(length,breadth,height);
        this.weight = weight;
    }
    Weight(Weight obj){
        super(obj);
        this.weight = obj.weight;
    }
}
class Prize extends Weight{
    int prize;
    Prize(){
        super();
        this.prize = -1;
    }
    Prize(int weight, int side, int prize){
        super(weight,side);
        this.prize = prize;
    }
    Prize(int weight, int prize, int length, int breadth, int height){
        super(length, breadth, height, weight);
        this.prize = prize;
    }
    Prize(Prize obj){
        super(obj);
        this.prize = obj.prize;
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
       Prize obj1 = new Prize(1,2,3,4,5);
        System.out.println(obj1.height + " " + obj1.prize + " " + obj1.breadth + " " + obj1.length + " " + obj1.weight);

        Prize obj2 = new Prize(obj1);
        System.out.println(obj2.height + " " + obj2.prize + " " + obj2.breadth + " " + obj2.length + " " + obj2.weight);
    }
}

