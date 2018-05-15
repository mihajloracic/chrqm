package m.e.c.r.service;

import m.e.c.r.model.Cpu;
import m.e.c.r.model.Game;
import m.e.c.r.model.Gpu;
import m.e.c.r.model.dto.InfoDto;
import m.e.c.r.model.dto.ResponseDto;
import m.e.c.r.repository.CpuRepository;
import m.e.c.r.repository.GameRepository;
import m.e.c.r.repository.GpuRepository;
import m.e.c.r.repository.ManufacturorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReponseService {

    @Autowired
    ManufacturorRepository manufacturorRepository;
    @Autowired
    CpuRepository cpuRepository;
    @Autowired
    GpuRepository gpuRepository;
    @Autowired
    GameRepository gamRepository;
    public ResponseDto getEvaluation(Long gameId,Long cpuId,Long gpuId, int ram){
        Game game =gamRepository.findById(gameId).get();
        Cpu cpu = cpuRepository.findById(cpuId).get();
        Gpu gpu = gpuRepository.findById(gpuId).get();
        InfoDto infoDtoMinimal = new InfoDto(game.getMinimalCpuClass() <= cpu.getClass_(),game.getMinimalGpuClass() <= gpu.getClass_(),game.getMinRam() <= ram);
        InfoDto infoDtoRecommended = new InfoDto(game.getRecommnedCpuClass() <= cpu.getClass_(),game.getRecommendedGpuClass() <= gpu.getClass_(),game.getRecommendedRam()/1024 <= ram);
        return new ResponseDto(infoDtoMinimal,infoDtoRecommended);
    }
}
