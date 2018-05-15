package m.e.c.r.controller;

import m.e.c.r.model.Cpu;
import m.e.c.r.model.Game;
import m.e.c.r.model.Gpu;
import m.e.c.r.model.Manufacturor;
import m.e.c.r.repository.CpuRepository;
import m.e.c.r.repository.GameRepository;
import m.e.c.r.repository.GpuRepository;
import m.e.c.r.repository.ManufacturorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    ManufacturorRepository manufacturorRepository;
    @Autowired
    CpuRepository cpuRepository;
    @Autowired
    GpuRepository gpuRepository;
    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/poz")
    public String helloWorld(){
        return "Hello word";
    }

    @GetMapping(value = "/cpu")
    public List<Cpu> getCpus(){
        return cpuRepository.findAll();
    }

    @GetMapping(value = "/gpu")
    public List<Gpu> getGpus(){
        return gpuRepository.findAll();
    }

    @GetMapping(value = "/games")
    public List<Game> getGames(){
        return gameRepository.findAll();
    }

    @GetMapping(value = "/manufacturors")
    public List<Manufacturor> getManufacturors(){
        return manufacturorRepository.findAll();
    }

    @GetMapping(value = "/check")
    public String getRunIt(@RequestParam Long gpuId, @RequestParam Long cpuId, @RequestParam Long gameId){
        return "hello word" + gpuId+ " " + gameId+ " "  +cpuId;
    }

}

