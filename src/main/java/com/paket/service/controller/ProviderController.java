package com.paket.service.controller;

import com.paket.service.model.Phone;
import com.paket.service.model.Provider;
import com.paket.service.model.RegexNumber;
import com.paket.service.repository.ProviderRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    ProviderRepository providerRepository;


    @GetMapping("/all")
    public List<Provider> getAll(){
        return providerRepository.findAll();
    }

    @PostMapping("/add")
    public List<Provider> persist(@RequestBody final Provider provider){
        providerRepository.save(provider);
        return providerRepository.findAll();
    }

    @GetMapping("/paket")
    public ResponseEntity<?> findPaket(@RequestBody Phone phone){
        RegexNumber rg = new RegexNumber();
        String kartu = rg.validatePhoneNumber(phone.getNomer_hp());
        JSONObject jsonObject = new JSONObject();
        if(kartu.equals("invalid")){
            jsonObject.put("msg","number invalid");
            return new ResponseEntity<>(jsonObject, HttpStatus.BAD_REQUEST);
        }
        List<Provider> providers= providerRepository.findByKartu(kartu.toUpperCase());
        jsonObject.put("data",providers);
        return new ResponseEntity<>(jsonObject,HttpStatus.OK);
    }
}
