package m.e.c.r.model.dto;

public class ResponseDto {
    public InfoDto minimal;
    public InfoDto recommneden;

    public ResponseDto(InfoDto minimal, InfoDto recommneden) {
        this.minimal = minimal;
        this.recommneden = recommneden;
    }
}
