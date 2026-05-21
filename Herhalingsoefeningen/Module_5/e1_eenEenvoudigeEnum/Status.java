package Herhalingsoefeningen.Module_5.e1_eenEenvoudigeEnum;

public enum Status {
    //values
    STARTED, PAUSED, STOPPED, UNREACHABLE;
    //extra
    public void run() {
        System.out.println(this.name());
    }
}
