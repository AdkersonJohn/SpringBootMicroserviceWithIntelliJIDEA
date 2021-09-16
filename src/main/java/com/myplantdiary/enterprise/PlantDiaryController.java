package com.myplantdiary.enterprise;


import com.myplantdiary.enterprise.dto.Specimen;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantDiaryController {

    //handle the root (/) and return a start page//
    //@return
    @RequestMapping("/")
    public String index(){return "start";}

/*    @RequestMapping("/lookup/{id}/")
    public ResponseEntity index(@PathVariable("id") String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity( "Your number: " + id, headers, HttpStatus.FORBIDDEN);
        return responseEntity;
    }

    @RequestMapping("/start")
        public String startPage() {
            return "start";
        }

    @RequestMapping("/invalid")
    public ResponseEntity invalid() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity("Foo" , headers, HttpStatus.FORBIDDEN);
        return responseEntity;
    }

    @RequestMapping("/valid")
    public ResponseEntity valid() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        ResponseEntity responseEntity = new ResponseEntity("Foo" , headers, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/validJson")
    public ResponseEntity validJson() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity responseEntity = new ResponseEntity("{name:Foo}" , headers, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/jsonObject")
    @ResponseBody
    public Specimen getSpecimenObject() {
        Specimen specimen = new Specimen();
        specimen.setPlantId(83);
        specimen.setSpecimenId("1002");
        specimen.setLatitude("39.74");
        specimen.setLongitude("-84.51");
        specimen.setDescription("A native tree with delicious fruit");
        return specimen;
    }

    @PostMapping(
        value = "/createSpecimen", consumes = "application/json", produces = "application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen) {
        int i = 1 + 1;
        return specimen;
    }*/

    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimens(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/specimen", consumes="application/json", produces="application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
