package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ComputerApi {

    private List<Computer> computers;

    public ComputerApi() {
        Computer computer1 = new Computer("DDR1",2000,50);
        Computer computer2 = new Computer("DDR2",4000,20);
        computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
    }

    @GetMapping("/api/computer/get")
    public List<Computer> getComputers() {
        return computers;
    }

    @PostMapping("/api/computer/add")
    public void addComputer(@RequestBody Computer computer){
    }
}


