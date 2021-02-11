package homework11AF18;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitors;
    private SystemBlock systemBlock;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitors, SystemBlock systemBlock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitors = monitors;
        this.systemBlock = systemBlock;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public void setMonitors(Monitor monitors) {
        this.monitors = monitors;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }
}
