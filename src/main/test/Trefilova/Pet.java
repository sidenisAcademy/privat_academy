package Trefilova;

import lombok.Setter;

import java.util.List;

@Setter
public class Pet {
    public int id;
    public Category category;
    public String name;
    public List<String> photoUrls;
    public List<Tags> tags;
    public String status;

}