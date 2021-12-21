
public class Block {
    int a, b, c;
    int volume;

    Block(int a1, int b1, int c1) {
        a=a1;
        b=b1;
        c=c1;
        volume = a * b * c;
    }
    boolean sameBlock(Block ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else {
            return false;
        }
    }
    boolean sameVolume(Block ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
    
    Block initializeBlock()
    {
        return new Block(0,0,0);
    }
    public static void main(String args[]) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
        System.out.println("ob1 same dimensions as ob2: "
                + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: "
                + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: "
                + ob1.sameVolume(ob3));
        ob3=ob3.initializeBlock();
        
    }
}



