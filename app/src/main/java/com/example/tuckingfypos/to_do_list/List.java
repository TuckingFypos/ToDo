package com.example.tuckingfypos.to_do_list;

/**
 * Created by TuckingFypos on 7/7/16.
 */
public class List {

    String mTitle;
    List<ToDoItem> toDoItemsList;

    public List(String mTitle, List<ToDoItem> toDoItemsList) {
        this.mTitle = mTitle;
        this.toDoItemsList = toDoItemsList;
    }


}
