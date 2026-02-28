package ge.tbc.testautomation.pojo;


import java.util.List;

public class PageResponse {

    private String title;
    private List<Section> sections;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<Section> getSections() { return sections; }
    public void setSections(List<Section> sections) { this.sections = sections; }
}