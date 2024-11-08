package com.example.tutor_java6.controller;

import com.example.tutor_java6.entity.BaiHat;
import com.example.tutor_java6.repository.BaiHatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bai-hat")
public class BaiHatController {
    @Autowired
    private BaiHatRepository baiHatRepository;

    @GetMapping("/hien-thi")
    public List<BaiHat> hienThi(){
        return baiHatRepository.findAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody BaiHat baiHat){
        BaiHat bh = baiHatRepository.save(baiHat);
        if(bh == null){
            return "Them loi";
        }
        return "Them thanh cong";
    }

    @PostMapping("/update")
    public String update(@RequestBody BaiHat baiHat){
        BaiHat bh = baiHatRepository.save(baiHat);
        if(bh == null){
            return "Update loi";
        }
        return "Update thanh cong";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id){
        baiHatRepository.deleteById(id);
        return "Xoa thanh cong";
    }
    @GetMapping("/search")
    public Optional<BaiHat> search(@RequestParam("id") Integer id){
       return baiHatRepository.findById(id);
    }

    @GetMapping("/phan-trang")
    public List<BaiHat> phanTrang(@RequestParam(value = "page", defaultValue = "0")Integer page){
        int pageSize = 2;
        Pageable pageable = PageRequest.of(page, pageSize);
        return baiHatRepository.findAll(pageable).getContent();
    }
}
