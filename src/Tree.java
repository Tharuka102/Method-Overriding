class Tree {

    void gain(){
        System.out.println("Growing");
    }

}

class Mango extends Tree{
    void gain(){
        System.out.println("Growing Slow");
    }
    public static void main(String[] args) {
        Mango m =new Mango();
        m.gain();


    }
}

