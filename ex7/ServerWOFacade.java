public class ServerWOFacade {
    public static void main(String[] args) {
        ScheduleServerFacade facade = new ScheduleServerFacade();

        facade.startServer();
        System.out.println("Start working......");
        System.out.println("After work done.........");
        facade.stopServer();
		System.out.println("Server has been shut down.");

    }
}
