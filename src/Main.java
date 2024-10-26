public class Main {

    static{
        System.loadLibrary("libgitTest_JNI");
    }
   // before shit starts library needs to be raedy
    //no exception




    static {
        System.out.println("im static block {1}");
    }
    {
        System.out.println("{just block}");
    }
    static {
        System.out.println("and im static block {2}");
    }
    public static void main(String[] args) {
        Main main = new Main();
    System.out.println(main.DoSthWithInt(5));


    }
    public native int DoSthWithInt(int iVal);
}