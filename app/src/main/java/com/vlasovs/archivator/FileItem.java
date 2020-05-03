package com.vlasovs.archivator;

public class FileItem {
    private String name;
    private String date;
    private String size;

    public FileItem(String name, String date, String size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getSize() {
        return size;
    }
}
