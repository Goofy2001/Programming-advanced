package Herhalingsoefeningen.Module_5.e1_eenEenvoudigeEnum;

public class StatusTest {
    public void runAll() {
        for (Status status : Status.values()) {
            status.run();
        }
    }
    public static void main(String[] args) {
        StatusTest tester = new StatusTest();
        tester.runAll();
    }
}
