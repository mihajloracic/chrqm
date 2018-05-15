package m.e.c.r.model.dto;

public class InfoDto {
    public boolean cpu;
    public boolean gpu;
    public boolean ram;

    public InfoDto(boolean cpu, boolean gpu, boolean ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }
}
