public abstract class User {
    protected Mediator mediator;
    protected String name;
    protected String status;

    public User(Mediator med, String name, String status){
        this.mediator = med;
        this.name = name;
        this.status = status;
    }

    public abstract void setStatus(String status);
    public abstract void showStatus();
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
