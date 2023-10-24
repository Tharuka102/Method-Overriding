public class centralBanck {
    int getRateofInterest (){
        return 2;

    }
}
class Boc extends centralBanck{
    @Override
    int getRateofInterest() {
        return 8;
    }
}
class Hnb extends centralBanck{
    @Override
    int getRateofInterest() {
        return 7;
    }
}
class Nsb extends centralBanck{
    @Override
    int getRateofInterest() {
        return 9;
    }
}
class testOverride{
    public static void main(String[] args) {
        Boc b =new Boc();
        Hnb h =new Hnb();
        Nsb n =new Nsb();
        System.out.println("BOC Rate Of Interest   ;"+b.getRateofInterest());
        System.out.println("HNB Rate Of Interest   ;"+h.getRateofInterest());
        System.out.println("NSB Rate Of Interest   ;"+n.getRateofInterest());
    }
}

