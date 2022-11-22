package fm.douban.app.service.impl;

import fm.douban.app.pojo.Singer;
import fm.douban.app.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SingerServiceImpl implements SingerService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Singer addSinger(Singer singer) {
        return null;
    }

    @Override
    public Singer get(String singerId) {
        return null;
    }

    @Override
    public List<Singer> getAll() {
        return mongoTemplate.findAll(Singer.class);
    }

    @Override
    public boolean modify(Singer singer) {
        return false;
    }

    @Override
    public boolean delete(String singerId) {
        return false;
    }
}
