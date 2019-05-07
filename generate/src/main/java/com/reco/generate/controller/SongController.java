package com.reco.generate.controller;

import com.google.common.collect.Lists;
import com.reco.generate.core.BaseController;
import com.reco.generate.core.easyui.Combobox;
import com.reco.generate.entity.Song;
import com.reco.generate.entity.SongExample;
import com.reco.generate.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "song")
public class SongController extends BaseController<Song, Integer, SongExample, SongService> {

    @Autowired
    @Override
    protected void setService(SongService songService) {
        this.service = songService;
    }

    @GetMapping(value = "getSongCombobox")
    public List<Combobox> getSongCombobox(String cname) {
        List<Combobox> list = Lists.newArrayList();
        List<Song> songList = this.service.findByCname(cname);
        Combobox combobox = null;
        for (Song song :songList) {
            combobox = new Combobox();
            combobox.setId(song.getId());
            combobox.setText(song.getCname());
            list.add(combobox);
        }
        return list;
    }
}