package OOpsfinal.a;
/*Hierarchial Inheritance means when more than one class extends the same class . All the rules of single inheritance applies here.*/
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
class Prize extends Container{
    int prize;
    Prize(){
        super();
        this.prize = -1;
    }
    Prize(int weight, int side){
        super(side);
        this.prize = weight;
    }
    Prize(int length, int breadth, int height, int weight){
        super(length,breadth,height);
        this.prize = weight;
    }
    Prize(Weight obj){
        super(obj);
        this.prize = obj.weight;
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Prize obj1 = new Prize(1,2,3,4);
        Weight obj2 = new Weight(1,2,3,4);
    }
}

