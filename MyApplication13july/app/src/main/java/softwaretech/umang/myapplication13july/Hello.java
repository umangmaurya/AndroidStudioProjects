package softwaretech.umang.myapplication13july;

/**
 * Created by UMANG on 7/17/2017.
 */


/**
 *
 */
class abc{
    void show(){}
}
interface abcd{
    void f1();
    void f2();
}



public class Hello extends abc implements abcd {

//    int a= 5;
//    int b = 5;
//    int c = 5;
//    int d = 5;
//    int e = 5;

  /*  @Override
    void show() {
        super.show();
    }*/




    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     */
    public Hello(int a, int b, int c, int d, int e) {


        try {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
        }
    }


    public int getA() {
        return ;
    }

    public void setA(int a) {
        this. = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b)


    {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }
}
