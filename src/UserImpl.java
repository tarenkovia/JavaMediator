public class UserImpl extends User {
    public UserImpl(Mediator med, String name, String status){
        super(med, name, status);
    }

    @Override
    public void setStatus(String newStatus){
        this.status = newStatus;
    }
    @Override
    public void showStatus(){
        System.out.println(this.name + " " + this.status);
    }
    @Override
    public void send(String msg){
        System.out.println(this.name + " - Отправил следующее письмо: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg){
        System.out.println(this.name + " - Принял письмо: " + msg);
    }
}
