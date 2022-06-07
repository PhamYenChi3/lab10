package lab10;

public class Client {
    public Client(){
        //to do:
    }
    public void doUnchecked(String value){
        //can phai check exception neu khong -> bug
        int result = canThrowUncheckedException(value);
        System.out.println("result="+result);
    }
    private int canThrowUncheckedException (String value) {
        return Integer.parseInt(value);
    }
    public void doChecked(){
        try{
            //buoc phai check exception o day
            canThrowUncheckedException();
            System.out.println("ok");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    private void canThrowUncheckedException() {
    }

    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }
}

