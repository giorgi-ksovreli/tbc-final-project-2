package ge.tbc.testautomation.pojo;

import java.util.List;

public class Section {

    private String title;
    private List<ListItem> list;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<ListItem> getList() { return list; }
    public void setList(List<ListItem> list) { this.list = list; }
}