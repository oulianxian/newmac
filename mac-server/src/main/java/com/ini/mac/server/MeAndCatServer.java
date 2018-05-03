package com.ini.mac.server;


import com.ini.mac.dao.entity.MeAndCat;
import com.ini.mac.dao.repository.MeAndCatRepository;
import com.ini.mac.vo.MeAndCatSaveVo;
import com.ini.mac.vo.MeAndCatVo;
import com.ini.mac.vo.base.ErrorCode;
import com.ini.mac.vo.base.MyException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ou on 2018/4/14/014.
 */
@Component

public class MeAndCatServer {
    @Autowired
    private MeAndCatRepository meAndCatRepository;

    public List<MeAndCatVo> findAll() {
        ArrayList<MeAndCatVo> meAndCatVos = new ArrayList<>();
        List<MeAndCat> meAndCatRepositoryAll = meAndCatRepository.findAll();
        for (MeAndCat meAndCat : meAndCatRepositoryAll) {
            MeAndCatVo meAndCatVo = new MeAndCatVo();
            System.out.println(meAndCat.getCatBehavior());
            BeanUtils.copyProperties(meAndCat, meAndCatVo);
            meAndCatVos.add(meAndCatVo);
        }
        if(meAndCatRepositoryAll.size()==0){
            throw new MyException(ErrorCode.OBJECT_IS_NOT_FIND);
        }
        return meAndCatVos;
    }
    @Transactional
    public void saveMeAndCat(MeAndCatSaveVo meAndCatSaveVo) {
        MeAndCat meAndCat = new MeAndCat();
        BeanUtils.copyProperties(meAndCatSaveVo, meAndCat);
        meAndCatRepository.save(meAndCat);
    }

    /**
     * 根据我的态度判断猫的行为
     * @param attitude
     * @return
     */
    public String findByAttitude(int attitude){

        List<MeAndCat> byAttitude;
        byAttitude = meAndCatRepository.findByAttitude(attitude);
        return byAttitude.get(0).getCatBehavior();

    }
}
