package headfirst.designpatterns.커맨드_패턴.remote;

public class TVOnCommand implements Command{

    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
