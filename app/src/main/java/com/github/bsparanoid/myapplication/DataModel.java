package com.github.bsparanoid.myapplication;

/**
 * Created by bsparanoid on 18/03/17.
 */

public class DataModel {

    String _titleTask;
    String _descTask;

    public DataModel(String titleTask, String descTask) {
        _titleTask = titleTask;
        _descTask = descTask;
    }

    public String get_titleTask() {
        return _titleTask;
    }

    public String get_descTask() {
        return _descTask;
    }
}