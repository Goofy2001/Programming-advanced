package Module_5;

enum Status {
    STARTED,
    PAUSED,
    STOPPED,
    UNREACHABLE;

    public void run() {
        System.out.println(this.name());
    }
}


class TestStatus {
    public static void main(String[] args) {
        for (Status status : Status.values()) {
            status.run();
        }
        }

    }

