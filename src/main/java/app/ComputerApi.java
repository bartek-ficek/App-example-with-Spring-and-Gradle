package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerApi {

    private List<Computer> computers;

    public ComputerApi() {
        Computer computer1 = new Computer("DDR1",2000,50);
        Computer computer2 = new Computer("DDR2",4000,20);
        computers = Arrays.asList(computer1,computer2);
    }

    @GetMapping("/api/computer/get")
    public List<Computer> getComputers() {
        return computers;
    }

    @PostMapping("/api/computer/add")
    public void addComputer(@RequestBody Computer computer){

    }
}


