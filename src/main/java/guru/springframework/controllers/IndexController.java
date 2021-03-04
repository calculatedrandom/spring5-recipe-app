package guru.springframework.controllers;

import guru.springframework.domain.Catagory;
import guru.springframework.domain.UOM;
import guru.springframework.repositories.CatagoryRepo;
import guru.springframework.repositories.UOMRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Slf4j
@Controller
public class IndexController {

    UOMRepo uomRepo;
    CatagoryRepo catagoryRepo;

    public IndexController(UOMRepo uomRepo, CatagoryRepo catagoryRepo) {
        this.uomRepo = uomRepo;
        this.catagoryRepo = catagoryRepo;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Catagory> optionalCatagory = catagoryRepo.findByDescription("Australian");
        Optional<UOM> optionalUOM = uomRepo.findById(1L);

        System.out.println(optionalCatagory.get().getId());
        System.out.println(optionalUOM.get().getDescription());

        log.info("Fuck yo buddy ive got a log");
        return "index";
    }
}
