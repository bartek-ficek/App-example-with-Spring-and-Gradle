package app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ComputerApi {

    private List<Computer> computers;

    public ComputerApi() {
        Computer computer1 = new Computer(1L,"DDR1",2000,50);
        Computer computer2 = new Computer(2L,"DDR2",4000,20);
        computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer2);
    }

    @GetMapping("/api/computers")
    public List<Computer> getComputers() {
        return computers;
    }

    @PostMapping("/api/computers")
    public void addComputer(@RequestBody Computer computer){
        computers.add(computer);
    }

    @DeleteMapping("/api/computers")
    public boolean deleteComputer(@RequestParam long id) {
        Optional<Computer> first = computers.stream().filter(element -> element.getId() == id).findFirst();
        return (first.map(computer -> computers.remove(computer)).orElse(false));
    }
}
//                THREE DIFFERENT WAYS TO WRITE CORRECT CONDITION:
//                return (first.isPresent() ? computers.remove(first.get()) : false)
//                return (first.map(computer -> computers.remove(computer)).orElse(false))
//                return (first.isPresent() && computers.remove(first.get()))