package app;

public class Computer {
    private String ddrType;
    private long Mhz;
    private int memorySize;

    public Computer() {
    }

    public Computer(String ddrType, long mhz, int memorySize) {
        this.ddrType = ddrType;
        Mhz = mhz;
        this.memorySize = memorySize;
    }

    public String getDdrType() {
        return ddrType;
    }

    public void setDdrType(String ddrType) {
        this.ddrType = ddrType;
    }

    public long getMhz() {
        return Mhz;
    }

    public void setMhz(long mhz) {
        Mhz = mhz;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ddrType='" + ddrType + '\'' +
                ", Mhz=" + Mhz +
                ", memorySize=" + memorySize +
                '}';
    }
}
